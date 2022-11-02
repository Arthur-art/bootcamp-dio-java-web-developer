package springbootdatajpa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootdatajpa.app.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
