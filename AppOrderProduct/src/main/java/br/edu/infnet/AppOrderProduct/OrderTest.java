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
		Order o1 = new Order();
		o1.setCreatedDate(LocalDateTime.now());
		o1.setOrderNumber(3);
		o1.setPaymentMethod("Pagseguro");
		
		Order o2 = new Order();
		o2.setCreatedDate(LocalDateTime.now().minusMonths(3));
		o2.setOrderNumber(2);
		o2.setPaymentMethod("Paypal");
		
		Order o3 = new Order();
		o3.setCreatedDate(LocalDateTime.now().minusMonths(5));
		o3.setOrderNumber(1);
		o3.setPaymentMethod("EBANX");		
	}

}
