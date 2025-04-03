// Define o pacote onde esta classe está localizada
package com.example.crudbase;

// Importa a classe SpringApplication, que é usada para iniciar a aplicação
import org.springframework.boot.SpringApplication;

// Importa a anotação SpringBootApplication, que marca esta classe como a principal da aplicação Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class crudbaseApplication {
	public static void main(String[] args) {
		SpringApplication.run(crudbaseApplication.class, args);
	}

}
