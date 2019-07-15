package yurii.fedyk.byshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yurii.fedyk.byshop.entity.product.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
