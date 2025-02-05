package org.dictnory.dictnory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
@OpenAPIDefinition(info = @Info(title = "Dictnory API", version = "1.0", description = "Dictnory API", 
					contact = @Contact(name = "Harshith N J", email = "Harshith.dev2024@outlook.com")))
@SpringBootApplication
public class DictnoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DictnoryApplication.class, args);
	}

}
