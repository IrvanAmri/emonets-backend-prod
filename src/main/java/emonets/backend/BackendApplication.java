package emonets.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import emonets.backend.bean.IntegrationUrl;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	public IntegrationUrl integrasiUrl(){
		// for production
		final String backendUrl = "https://emonet-backend2.azurewebsites.net";
		final String frontendUrl = "https://delightful-flower-066973a10.2.azurestaticapps.net";

		// for development
		// final String backendUrl = "http://localhost:8080";
		// final String frontendUrl = "http://localhost:3000";
		IntegrationUrl integrationUrl = new IntegrationUrl(frontendUrl, backendUrl);
		return integrationUrl;
	}
}
