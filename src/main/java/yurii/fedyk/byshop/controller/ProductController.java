package yurii.fedyk.byshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yurii.fedyk.byshop.dto.request.ProductRequest;
import yurii.fedyk.byshop.dto.response.ProductResponse;
import yurii.fedyk.byshop.entity.product.Product;
import yurii.fedyk.byshop.service.ProductService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public void create(@Valid @RequestBody ProductRequest request){
        productService.create(request);
    }

    @PutMapping
    public void update(Long id, @Valid @RequestBody ProductRequest request){
        productService.update(id, request);
    }

    @DeleteMapping
    public void delete(Long id){
        productService.delete(id);
    }

    @GetMapping
    public List<ProductResponse> findAll(){
        return productService.findAll();
    }

    @GetMapping
    public Product findById(Long id){
        return productService.findOne(id);
    }
}
