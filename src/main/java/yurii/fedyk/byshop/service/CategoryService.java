package yurii.fedyk.byshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yurii.fedyk.byshop.dto.request.CategoryRequest;
import yurii.fedyk.byshop.dto.response.CategoryResponse;
import yurii.fedyk.byshop.entity.product.Category;
import yurii.fedyk.byshop.repository.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryResponse> findAll(){
        return categoryRepository
                .findAll()
                .stream()
                .map(CategoryResponse::new)
                .collect(Collectors.toList());
    }
    public Category findOne(Long id){
        return categoryRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException
                        ("Category with id " + id + " not found."));
    }

    private Category categoryRequestToCategory(Category category, CategoryRequest request) {
        if (category == null) {
            category = new Category();
        }
        category.setName(request.getName());
        return category;
    }

    public void create(CategoryRequest request){
        categoryRepository.save(categoryRequestToCategory(null, request));
    }
    public void update(Long id, CategoryRequest request){
        categoryRepository.save(categoryRequestToCategory(findOne(id), request));
    }
    public void delete(Long id){
        categoryRepository.delete(findOne(id));
    }

}
