package springboot.designpatterns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.designpatterns.model.Cars;

public interface CarsRepository extends JpaRepository<Cars,Integer> {
}
