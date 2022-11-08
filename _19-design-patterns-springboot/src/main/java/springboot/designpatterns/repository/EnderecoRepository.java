package springboot.designpatterns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.designpatterns.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco,String> {
}
