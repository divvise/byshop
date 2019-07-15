package yurii.fedyk.byshop.entity.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import yurii.fedyk.byshop.entity.product.ProductForOrder;
import yurii.fedyk.byshop.entity.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "order")
    private List<ProductForOrder> productForOrderList = new ArrayList();

    @ManyToOne
    private User user;
}
