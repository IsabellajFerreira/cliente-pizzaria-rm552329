package br.com.fiap.clientepizzaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class ClientePizzariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientePizzariaApplication.class, args);
	}

	@GetMapping(value = "/")
	public String index(){
		String hello = """
				Bom dia! 2TDSPG
								
				Seja bem-vindo à Benezinho's Pizzaria
				""";
		return hello;
	}

}