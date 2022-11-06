package br.edu.infnet.AppOrderProduct;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppOrderProduct.service.ProductService;
@Order(5)
@Component
public class ProductTest implements ApplicationRunner {
	@Autowired
	ProductService productService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		productService.getProductList();
	}

}
