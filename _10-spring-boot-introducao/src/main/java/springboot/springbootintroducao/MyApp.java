package springboot.springbootintroducao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private User user;
    @Autowired
    private Calcular calcular;
    @Override
    public void run(String... args) throws Exception {
        user.setNome("Arthur");
        user.setIdade(26);
        System.out.println(user);
        System.out.println(calcular.sum(10,30));
    }
}
