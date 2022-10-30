package br.edu.infnet.AppOrderProduct;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppOrderProduct.controller.ProductController;
import br.edu.infnet.AppOrderProduct.controller.SoftwareController;
import br.edu.infnet.AppOrderProduct.model.domain.Software;

@Component
public class SoftwareTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		int id = 1;
		Software bitdefender = DataFactory.createSoftware(id++,49.9, "Bitdefender Total Security", "S-BITDEFENDER-TS-1", 
				"The No.1 Antivirus software!!!", "Software", "Bitdefender", "P1N7-8Q44-7Y8T-44RM", 3, 1);		
		System.out.println("Software 1 - "+bitdefender);
		SoftwareController.insertSoftware(bitdefender);
		
		Software gpn = DataFactory.createSoftware(id++,14.9, "NOPING", "S-NOPING-V-1", 
				"The No.1 GPN software!!!", "Software", "NOPING", "Y1A7-8Q44-8Y8T-4TRW", 1, 1);
		System.out.println("Software 2 - "+gpn);
		SoftwareController.insertSoftware(gpn);
		
		Software windows = DataFactory.createSoftware(id++,199.9, "Microsoft Windows 11", "S-WINDOWS-11-1", 
				"The No.1 GPN software!!!", "Software", "Microsoft", "P3HM4-WAM27-66ZXW-9PFTZ-CFZFV", 3, 1);		
		System.out.println("Software 3 - "+windows);
		SoftwareController.insertSoftware(windows);
	}

}
