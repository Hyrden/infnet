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
	}

}
