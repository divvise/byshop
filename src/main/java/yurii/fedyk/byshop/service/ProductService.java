package yurii.fedyk.byshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yurii.fedyk.byshop.dto.request.ProductRequest;
import yurii.fedyk.byshop.dto.response.ProductResponse;
import yurii.fedyk.byshop.entity.product.Category;
import yurii.fedyk.byshop.entity.product.Product;
import yurii.fedyk.byshop.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryService categoryService;


    public List<ProductResponse> findAll(){
        return productRepository
                .findAll()
                .stream()
                .map(ProductResponse::new)
                .collect(Collectors.toList());
    }
    public Product findOne(Long id){
        return productRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException
                        ("Product with id " + id + " not found."));
    }
    private Product productReqeustToProduct(Product product, ProductRequest request){
        if (product == null){
            product = new Product();
        }
        Category category = categoryService.findOne(request.getCategoryId());
        product.setCategory(category);
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product.setDescription(request.getDescription());
        return product;
    }
    public void create(ProductRequest request){
        productRepository.save(productReqeustToProduct(null, request));
    }
    public void update(Long id, ProductRequest request){
        productRepository.save(productReqeustToProduct(findOne(id), request));
    }
    public void delete(Long id){
        productRepository.delete(findOne(id));
    }


}
