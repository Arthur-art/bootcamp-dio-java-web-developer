package springbootdatajpa.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springbootdatajpa.app.model.User;
import springbootdatajpa.app.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setName("Arthur");
        user1.setUsername("arthur-art");
        user1.setPassword("123456");

        repository.save(user1);

        for (User u:repository.findAll()
             ) {
            System.out.println(u);
        }

    }
}
