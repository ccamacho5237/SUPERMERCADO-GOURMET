package co.edu.unbosque.SuperMercado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SuperMercadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperMercadoApplication.class, args);
	}

}
