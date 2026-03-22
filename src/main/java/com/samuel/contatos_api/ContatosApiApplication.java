package com.samuel.contatos_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/contatos")
public class ContatosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatosApiApplication.class, args);
	}

}
