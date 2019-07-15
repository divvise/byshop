package yurii.fedyk.byshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yurii.fedyk.byshop.entity.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
