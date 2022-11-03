package springbootdatajpa.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springbootdatajpa.app.model.Carros;
import springbootdatajpa.app.model.User;
import springbootdatajpa.app.repository.CarsRepository;
import springbootdatajpa.app.repository.UserRepository;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Autowired
    private CarsRepository repositoryCars;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();

        Carros carro = new Carros();
        carro.setModelo("AstonMartin");
        carro.setPlaca("#Hbh32112");
        carro.setQuilometros(0);

        repositoryCars.save(carro);

        List<User> users = repository.filtrarPorNome("Arthur");
        for (User u:users
             ) {
            System.out.println(u);
        }

        for (User u:repository.findAll()
             ) {
            System.out.println(u);
        }

    }
}
