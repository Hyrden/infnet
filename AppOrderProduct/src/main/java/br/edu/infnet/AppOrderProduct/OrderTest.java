package br.edu.infnet.AppOrderProduct;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppOrderProduct.model.domain.Order;

@Component
public class OrderTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Order o1 = DataFactory.createOrder(3, LocalDateTime.now(), "Pagseguro");
		System.out.println("Order 1 - "+o1);
		
		Order o2 = DataFactory.createOrder(2, LocalDateTime.now().minusMonths(3), "Paypal");
		System.out.println("Order 2 - "+o2);
		
		Order o3 = DataFactory.createOrder(1, LocalDateTime.now().minusMonths(5), "EBANX");	
		System.out.println("Order 3 - "+o1);		
	}

}
