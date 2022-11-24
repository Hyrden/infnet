package br.edu.infnet.AppOrderProduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppOrderProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppOrderProductApplication.class, args); 
	}

}
