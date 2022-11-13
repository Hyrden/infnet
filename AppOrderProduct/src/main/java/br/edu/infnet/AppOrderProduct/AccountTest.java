package br.edu.infnet.AppOrderProduct;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppOrderProduct.model.domain.Account;
import br.edu.infnet.AppOrderProduct.model.domain.Address;
import br.edu.infnet.AppOrderProduct.model.domain.User;
import br.edu.infnet.AppOrderProduct.model.service.AccountService;
@Order(5)
@Component
public class AccountTest implements ApplicationRunner {
	@Autowired
	AccountService accountService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		/* Gerei esses dados fictícios utilizando o website  https://www.4devs.com.br/gerador_de_pessoas */
		Address add1 = DataFactory.createAddress("Rua Maestro Armando Belardi","812", "AP 404", "SP", "Campinas",
				"13058-414", "BRAZIL");
		Address add2 = DataFactory.createAddress("Avenida Frei Damião","588", "AP 404", "SP", "Campinas", 
				"13058-181", "BRAZIL");
		Address add3 = DataFactory.createAddress("Rua Três","872", "AP 404", "PE", "Petrolina", 
				"13058-181", "BRAZIL");
		User user = new User();
		user.setId(1);		
		User user2 = new User();
		user2.setId(2);
		Account acc = DataFactory.createAccount(LocalDate.of(1995,5,18), "Benjamin Antonio Caio Ribeiro", "88696268814",
				"benjaminantonioribeiro@piscinasegura.com.br",user,add1);
		System.out.println("Account - "+acc);
		accountService.insertAcc(acc);	
		
		Account acc2 = DataFactory.createAccount(LocalDate.of(1959,1,15), "Francisca Carla Ana Campos", "89622147844",
				"francisca@qualitest.com.br",user2,add2);		
		System.out.println("Account - "+acc2);
		
		accountService.insertAcc(acc2);
		
		Account acc3 = DataFactory.createAccount(LocalDate.of(1997,11,8), "Gabrielly Sueli Giovana Baptista", "47736658404",
				"gabriellysuelibaptista@usa.com",user,add3);			
		System.out.println("Account - "+acc3);
		
		accountService.insertAcc(acc3);
	}

}
