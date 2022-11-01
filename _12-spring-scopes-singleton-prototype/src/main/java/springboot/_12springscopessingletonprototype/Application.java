package springboot._12springscopessingletonprototype;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springboot._12springscopessingletonprototype.app.SistemaMensagem;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
	@Bean
	public CommandLineRunner run(SistemaMensagem sistemaMensagem)throws Exception{
		return args -> {
			sistemaMensagem.enviarConfirmacaoCadastro();
			sistemaMensagem.enviarMensagemBoasVindas();
			sistemaMensagem.enviarConfirmacaoCadastro();
		};
	}

}
