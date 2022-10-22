package br.edu.infnet.AppOrderProduct;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppOrderProduct.model.domain.Peripheral;

@Component
public class PeripheralTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Peripheral headset = new Peripheral();
		headset.setName("ASTRO A50");
		headset.setDescription("The No1 best headset on the World!!!");
		headset.setCompany("Logitech");
		headset.setCategory("Peripheral");
		headset.setCode("P-LOGITECH-A-50");
		headset.setValue(2000);
		headset.setFirmware("");
		headset.setWarrant(12);
		headset.setWeight(1.5f);
		
		System.out.println("Peripheral - "+headset);
		
		Peripheral mouse = new Peripheral();
		mouse.setName("G903");
		mouse.setDescription("The No1 best mouse on the World!!!");
		mouse.setCompany("Logitech");
		mouse.setCategory("Peripheral");
		mouse.setCode("P-LOGITECH-G-903");
		mouse.setValue(650);
		mouse.setFirmware("");
		mouse.setWarrant(24);
		mouse.setWeight(0.15f);
		
		System.out.println("Peripheral - "+mouse);
		
		Peripheral keyboard = new Peripheral();
		keyboard.setName("G915");
		keyboard.setDescription("The No1 best keyboard on the World!!!");
		keyboard.setCompany("Logitech");
		keyboard.setCategory("Peripheral");
		keyboard.setCode("P-LOGITECH-G-915");
		keyboard.setValue(1500);
		keyboard.setFirmware("");
		keyboard.setWarrant(24);
		keyboard.setWeight(1.3f);
		
		System.out.println("Peripheral - "+keyboard);
	}

}
