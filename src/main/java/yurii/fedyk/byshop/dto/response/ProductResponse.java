package yurii.fedyk.byshop.dto.response;

import lombok.Getter;
import lombok.Setter;
import yurii.fedyk.byshop.entity.product.Product;

@Getter
@Setter
public class ProductResponse {
    private Long id;
    private String name;
    private String description;
    private Long price;
    private Long categoryId;

    public ProductResponse(Product product){
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        price = product.getPrice();
    }
}
