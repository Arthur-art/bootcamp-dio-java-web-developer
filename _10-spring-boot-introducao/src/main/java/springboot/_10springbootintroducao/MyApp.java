package springboot._10springbootintroducao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calcular calcular;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(calcular.sum(10,30));
    }
}
