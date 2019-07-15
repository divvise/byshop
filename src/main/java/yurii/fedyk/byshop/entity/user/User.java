package yurii.fedyk.byshop.entity.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import yurii.fedyk.byshop.entity.order.Order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    private Integer age;

    @OneToOne
    private Cart cart;

    @OneToMany(mappedBy = "user")
    private List<Order> orderList = new ArrayList();

}
