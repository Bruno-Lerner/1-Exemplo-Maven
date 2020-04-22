package lerner.bruno.exemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 14/04/2020 11:00
 */
@SpringBootApplication
public class ExemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploApplication.class, args);

		System.out.println("Primeiro exemplo com SpringBOOT no Maven!");
	}
}
