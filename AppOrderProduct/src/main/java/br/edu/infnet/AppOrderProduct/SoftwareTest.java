package br.edu.infnet.AppOrderProduct;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppOrderProduct.model.domain.Software;

@Component
public class SoftwareTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Software bitdefender = new Software();
		bitdefender.setName("Bitdefender Total Security");
		bitdefender.setDescription("The No.1 Antivirus software!!!");
		bitdefender.setCompany("Bitdefender");
		bitdefender.setCategory("Software");
		bitdefender.setCode("S-BITDEFENDER-TS-1");
		bitdefender.setLicense("P1N7-8Q44-7Y8T-44RM");
		bitdefender.setMaxPCAllowed(5);
		bitdefender.setCurrentInstallations(1);
		
		System.out.println("Software - "+bitdefender);
		
	}

}
