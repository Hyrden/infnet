package br.edu.infnet.AppOrderProduct;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppOrderProduct.controller.ProductController;
import br.edu.infnet.AppOrderProduct.model.domain.Game;
import br.edu.infnet.AppOrderProduct.model.domain.Peripheral;
import br.edu.infnet.AppOrderProduct.model.domain.Software;

@Component
public class ProductTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		int id = 1;
		Game g1 = DataFactory.createGame(id++,29.90, "The Witcher 3", "G-CDPROJEKTRED-TW-3", "As war rages on throughout the Northern Realms, you take on the greatest contract of your life — tracking down the Child of Prophecy, a living weapon that can alter the shape of the world.", 
				"Adventure", "CD Projekt RED", false, LocalDate.of(2015,5,18));
		ProductController.insertProduct(g1);
		Software bitdefender = DataFactory.createSoftware(id++,49.9, "Bitdefender Total Security", "S-BITDEFENDER-TS-1", 
				"The No.1 Antivirus software!!!", "Software", "Bitdefender", "P1N7-8Q44-7Y8T-44RM", 3, 1);
		ProductController.insertProduct(bitdefender);
		Peripheral headset = DataFactory.createPeripheral(id++,2000.00, "ASTRO A50", "P-LOGITECH-A-50", "The No1 best headset on the World!!!",
				"Peripheral", "Logitech", "40372.43", 12, 1.5f);
		ProductController.insertProduct(headset);
	}

}
