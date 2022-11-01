package springboot.springbootintroducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		System.out.println("Hello Spring Boot");
		SpringApplication.run(Main.class, args);
	}

}
