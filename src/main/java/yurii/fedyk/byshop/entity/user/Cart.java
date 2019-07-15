package yurii.fedyk.byshop.entity.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import yurii.fedyk.byshop.entity.product.ProductForOrder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "cart")
    private User user;

    @OneToMany(mappedBy = "cart")
    private List<ProductForOrder> productForOrderList = new ArrayList();
}

