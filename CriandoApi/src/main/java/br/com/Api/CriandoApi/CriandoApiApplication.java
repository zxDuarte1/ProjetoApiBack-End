package br.com.Api.CriandoApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CriandoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriandoApiApplication.class, args);
	}

}