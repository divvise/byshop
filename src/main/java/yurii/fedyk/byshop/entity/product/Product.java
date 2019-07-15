package yurii.fedyk.byshop.entity.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Long price;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<ProductForOrder> productForOrderList = new ArrayList();
}
