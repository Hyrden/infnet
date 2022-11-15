package br.edu.infnet.AppOrderProduct;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppOrderProduct.model.domain.Account;
import br.edu.infnet.AppOrderProduct.model.domain.Game;
import br.edu.infnet.AppOrderProduct.model.domain.Order;
import br.edu.infnet.AppOrderProduct.model.domain.Peripheral;
import br.edu.infnet.AppOrderProduct.model.domain.Product;
import br.edu.infnet.AppOrderProduct.model.domain.Software;
import br.edu.infnet.AppOrderProduct.model.domain.User;
import br.edu.infnet.AppOrderProduct.model.service.OrderService;

@org.springframework.core.annotation.Order(6)
@Component
public class OrderTest implements ApplicationRunner {
	@Autowired
	OrderService orderService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		User user = new User();
		user.setId(1);
		User user2 = new User();
		user2.setId(2);
		Account acc = new Account();
		acc.setId(1);		
		Account acc2 = new Account();		
		acc2.setId(2);		
		Game g1 = new Game();
		g1.setId(1);		
		Game g2 = new Game();
		g2.setId(2);		
		Software bitdefender = new Software();
		bitdefender.setId(4);		
		Peripheral headset = new Peripheral();
		headset.setId(7);		
		List<Product> ltProducts1 = new ArrayList<Product>();
		ltProducts1.add(g1);
		ltProducts1.add(g2);
		ltProducts1.add(headset);
		
		List<Product> ltProducts2 = new ArrayList<Product>();
		ltProducts2.add(g1);
		ltProducts2.add(bitdefender);
		
		Order o1 = DataFactory.createOrder(3148, LocalDateTime.now(), "Pagseguro",acc,ltProducts1,user);		
		orderService.insertOrder(o1);
		System.out.println("Order 1 - "+o1);
		
		Order o2 = DataFactory.createOrder(5678, LocalDateTime.now().minusMonths(3), "Paypal",acc2,ltProducts2,user2);		
		orderService.insertOrder(o2);
		System.out.println("Order 2 - "+o2);
		
		Order o3 = DataFactory.createOrder(9119, LocalDateTime.now().minusMonths(5), "EBANX",acc,ltProducts1,user);				
		orderService.insertOrder(o3);
		System.out.println("Order 3 - "+o3);
	}

}
