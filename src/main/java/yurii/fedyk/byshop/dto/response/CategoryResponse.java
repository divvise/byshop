package yurii.fedyk.byshop.dto.response;

import lombok.Getter;
import lombok.Setter;
import yurii.fedyk.byshop.entity.product.Category;

@Getter
@Setter
public class CategoryResponse {
    private Long id;
    private String name;

    public CategoryResponse(Category category){
        id = category.getId();
        name = category.getName();
    }
}
