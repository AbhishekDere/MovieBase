package tech.abhishekdere.MovieBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class MovieBaseApplication {
	public static void main(String[] args) {
		SpringApplication.run(MovieBaseApplication.class, args);
	}


}
