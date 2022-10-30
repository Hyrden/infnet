package br.edu.infnet.AppOrderProduct;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppOrderProduct.controller.OrderController;
import br.edu.infnet.AppOrderProduct.model.domain.Account;
import br.edu.infnet.AppOrderProduct.model.domain.Game;
import br.edu.infnet.AppOrderProduct.model.domain.Order;
import br.edu.infnet.AppOrderProduct.model.domain.Peripheral;
import br.edu.infnet.AppOrderProduct.model.domain.Product;
import br.edu.infnet.AppOrderProduct.model.domain.Software;
@Component
public class OrderTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		int id = 1;
		Account acc = DataFactory.createAccount(id++,LocalDate.of(1995,5,18), "Benjamin Antonio Caio Ribeiro", "88696268814",
				"benjaminantonioribeiro@piscinasegura.com.br", "Rua Maestro Armando Belardi","812", "AP 404", "SP", "Campinas", 
				"13058-414", "BRAZIL");
		
		Account acc2 = DataFactory.createAccount(id++,LocalDate.of(19959,1,15), "Francisca Carla Ana Campos", "89622147844",
				"francisca@qualitest.com.br", "Avenida Frei Damião","588", "AP 404", "SP", "Campinas", 
				"13058-181", "BRAZIL");
		
		Game g1 = DataFactory.createGame(id++,29.90, "The Witcher 3", "G-CDPROJEKTRED-TW-3", "As war rages on throughout the Northern Realms, you take on the greatest contract of your life — tracking down the Child of Prophecy, a living weapon that can alter the shape of the world.", 
				"Adventure", "CD Projekt RED", false, LocalDate.of(2015,5,18));
		
		Game g2 = DataFactory.createGame(id++,199.90, "Kerbal Space Program 2", "G-INTERCEPTGAMES-KSP-2", "Kerbal Space Program 2 is the sequel to the acclaimed space-flight simulation game Kerbal Space Program. Enter the next generation of space adventure with exciting new parts, stunning visuals, fully revamped UI and Map View, and rich new environments to explore.", 
				"Simulation", "Intercept Games",true, LocalDate.of(2023,2,24));
		
		Software bitdefender = DataFactory.createSoftware(id++,49.9, "Bitdefender Total Security", "S-BITDEFENDER-TS-1", 
				"The No.1 Antivirus software!!!", "Software", "Bitdefender", "P1N7-8Q44-7Y8T-44RM", 3, 1);
		
		Peripheral headset = DataFactory.createPeripheral(id++,2000.00, "ASTRO A50", "P-LOGITECH-A-50", "The No1 best headset on the World!!!",
				"Peripheral", "Logitech", "40372.43", 12, 1.5f);
		
		List<Product> ltProducts1 = new ArrayList<Product>();
		ltProducts1.add(g1);
		ltProducts1.add(g2);
		ltProducts1.add(headset);
		
		List<Product> ltProducts2 = new ArrayList<Product>();
		ltProducts2.add(g1);
		ltProducts2.add(bitdefender);
		
		Order o1 = DataFactory.createOrder(id++,3, LocalDateTime.now(), "Pagseguro",acc,ltProducts1);
		System.out.println("Order 1 - "+o1);
		OrderController.insertOrder(o1);
		
		Order o2 = DataFactory.createOrder(id++,2, LocalDateTime.now().minusMonths(3), "Paypal",acc2,ltProducts2);
		System.out.println("Order 2 - "+o2);
		OrderController.insertOrder(o2);
		
		Order o3 = DataFactory.createOrder(id++,1, LocalDateTime.now().minusMonths(5), "EBANX",acc,ltProducts2);	
		System.out.println("Order 3 - "+o3);	
		OrderController.insertOrder(o3);
	}

}
