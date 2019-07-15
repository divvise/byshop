package yurii.fedyk.byshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yurii.fedyk.byshop.dto.request.CategoryRequest;
import yurii.fedyk.byshop.dto.response.CategoryResponse;
import yurii.fedyk.byshop.entity.product.Category;
import yurii.fedyk.byshop.service.CategoryService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public void create(@Valid @RequestBody CategoryRequest request){
        categoryService.create(request);
    }

    @PutMapping
    public void update(Long id, @Valid @RequestBody CategoryRequest request){
        categoryService.update(id, request);
    }

    @DeleteMapping
    public void delete(Long id){
        categoryService.delete(id);
    }

    @GetMapping
    public List<CategoryResponse> findAll(){
        return categoryService.findAll();
    }

    @GetMapping
    public Category findById(Long id){
        return categoryService.findOne(id);
    }

}
