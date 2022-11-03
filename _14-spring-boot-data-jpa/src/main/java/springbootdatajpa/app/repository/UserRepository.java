package springbootdatajpa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import springbootdatajpa.app.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findBynameContaining(String name);

    User findByusername(String username);

    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);

}
