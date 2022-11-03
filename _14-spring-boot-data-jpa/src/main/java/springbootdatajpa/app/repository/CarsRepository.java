package springbootdatajpa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootdatajpa.app.model.Carros;

public interface CarsRepository extends JpaRepository<Carros, Integer> {
}
