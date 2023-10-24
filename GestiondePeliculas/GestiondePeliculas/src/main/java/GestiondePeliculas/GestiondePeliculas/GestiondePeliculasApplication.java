package GestiondePeliculas.GestiondePeliculas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableFeignClients
@SpringBootApplication
public class GestiondePeliculasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestiondePeliculasApplication.class, args);
	}

}
