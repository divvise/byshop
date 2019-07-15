package yurii.fedyk.byshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yurii.fedyk.byshop.entity.user.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
}
