package springboot.designpatterns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot.designpatterns.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}