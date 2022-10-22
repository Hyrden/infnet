package br.edu.infnet.AppOrderProduct;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppOrderProduct.model.domain.Game;
import br.edu.infnet.AppOrderProduct.model.domain.Peripheral;
import br.edu.infnet.AppOrderProduct.model.domain.Software;

@Component
public class ProductTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Game tw = new Game();
		tw.setName("The Witcher 3");
		tw.setDescription("As war rages on throughout the Northern Realms, you take on the greatest contract of your life — tracking down the Child of Prophecy, a living weapon that can alter the shape of the world.");
		tw.setCompany("CD Projekt RED");
		tw.setCategory("Adventure");
		tw.setCode("G-CDPROJEKTRED-TW-3");
		tw.setPreOrder(false);
		tw.setReleased(true);
		tw.setValue(29.90);
		tw.setReleaseDate(LocalDate.of(2015,5,18));
		
		Software bitdefender = new Software();
		bitdefender.setName("Bitdefender Total Security");
		bitdefender.setDescription("The No.1 Antivirus software!!!");
		bitdefender.setCompany("Bitdefender");
		bitdefender.setCategory("Software");
		bitdefender.setCode("S-BITDEFENDER-TS-1");
		bitdefender.setLicense("P1N7-8Q44-7Y8T-44RM");
		bitdefender.setMaxPCAllowed(5);
		bitdefender.setCurrentInstallations(1);
		
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
	}

}
