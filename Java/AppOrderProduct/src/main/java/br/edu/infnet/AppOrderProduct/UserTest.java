package br.edu.infnet.AppOrderProduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppOrderProduct.model.domain.User;
import br.edu.infnet.AppOrderProduct.model.service.UserService;

@Order(1)
@Component
public class UserTest implements ApplicationRunner {
	@Autowired
	UserService userService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		User admin = DataFactory.createUser("Administrator", "adminUser@test.com","12345", true);
		System.out.println("User - "+admin);
		userService.insertUser(admin);
		User standard = DataFactory.createUser("Standard User", "standardUser@test.com","12345", null);
		System.out.println("User - "+standard);
		userService.insertUser(standard);
	}

}
