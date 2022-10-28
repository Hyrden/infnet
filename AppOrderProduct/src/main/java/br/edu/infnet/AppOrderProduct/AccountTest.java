package br.edu.infnet.AppOrderProduct;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppOrderProduct.model.domain.Account;

@Component
public class AccountTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		/* Gerei esses dados fictícios utilizando o website  https://www.4devs.com.br/gerador_de_pessoas */
		Account acc = DataFactory.createAccount(LocalDate.of(1995,5,18), "Benjamin Antonio Caio Ribeiro", "88696268814",
				"benjaminantonioribeiro@piscinasegura.com.br", "Rua Maestro Armando Belardi","812", "AP 404", "SP", "Campinas", 
				"13058-414", "BRAZIL");
		System.out.println("Account - "+acc);
		
		Account acc2 = DataFactory.createAccount(LocalDate.of(19959,1,15), "Francisca Carla Ana Campos", "89622147844",
				"francisca@qualitest.com.br", "Avenida Frei Damião","588", "AP 404", "SP", "Campinas", 
				"13058-181", "BRAZIL");		
		System.out.println("Account - "+acc2);
		
		Account acc3 = DataFactory.createAccount(LocalDate.of(1997,11,8), "Gabrielly Sueli Giovana Baptista", "47736658404",
				"gabriellysuelibaptista@usa.com", "Rua Três","872", "AP 404", "PE", "Petrolina", 
				"13058-181", "BRAZIL");			
		System.out.println("Account - "+acc3);
		
	}

}
