package br.edu.infnet.AppOrderProduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppOrderProduct.model.domain.Software;
import br.edu.infnet.AppOrderProduct.model.service.SoftwareService;
@Order(3)
@Component
public class SoftwareTest implements ApplicationRunner {
	@Autowired
	SoftwareService softwareService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Software bitdefender = DataFactory.createSoftware(49.9, "Bitdefender Total Security", "S-BITDEFENDER-TS-1", 
				"The No.1 Antivirus software!!!", "Software", "Bitdefender", "P1N7-8Q44-7Y8T-44RM", 3, 1);		
		System.out.println("Software 1 - "+bitdefender);
		softwareService.insertSoftware(bitdefender);
		
		Software gpn = DataFactory.createSoftware(14.9, "NOPING", "S-NOPING-V-1", 
				"The No.1 GPN software!!!", "Software", "NOPING", "Y1A7-8Q44-8Y8T-4TRW", 1, 1);
		System.out.println("Software 2 - "+gpn);
		softwareService.insertSoftware(gpn);
		
		Software windows = DataFactory.createSoftware(199.9, "Microsoft Windows 11", "S-WINDOWS-11-1", 
				"The No.1 GPN software!!!", "Software", "Microsoft", "P3HM4-WAM27-66ZXW-9PFTZ-CFZFV", 3, 1);		
		System.out.println("Software 3 - "+windows);
		softwareService.insertSoftware(windows);
	}

}
