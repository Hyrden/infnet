package br.edu.infnet.AppOrderProduct;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppOrderProduct.model.domain.Peripheral;

@Component
public class PeripheralTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Peripheral headset = DataFactory.createPeripheral(2000.00, "ASTRO A50", "P-LOGITECH-A-50", "The No1 best headset on the World!!!",
				"Peripheral", "Logitech", "40372.43", 12, 1.5f);
		System.out.println("Peripheral 1 - "+headset);
		
		Peripheral mouse = DataFactory.createPeripheral(650.00, "G903", "P-LOGITECH-G-903", "The No1 best mouse on the World!!!",
				"Peripheral", "Logitech", "G3928.Y554", 24, 0.15f);
		System.out.println("Peripheral 2 - "+mouse);
		
		Peripheral keyboard = DataFactory.createPeripheral(1500.00, "G915", "P-LOGITECH-G-915", "The No1 best keyboard on the World!!!",
				"Peripheral", "Logitech", "G3999.Y554", 24, 0.3f);
		System.out.println("Peripheral 3 - "+keyboard);
	}

}
