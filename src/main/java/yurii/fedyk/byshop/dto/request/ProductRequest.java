package yurii.fedyk.byshop.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
public class ProductRequest {
    @NotBlank
    private String name;
    @Positive
    private Long price;
    @NotNull
    private Long categoryId;
    private String description;
}
