package yurii.fedyk.byshop.entity.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import yurii.fedyk.byshop.entity.order.Order;
import yurii.fedyk.byshop.entity.user.Cart;


import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ProductForOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer count;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Cart cart;


}
