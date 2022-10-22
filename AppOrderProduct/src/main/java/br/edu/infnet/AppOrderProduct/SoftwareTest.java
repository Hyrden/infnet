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
		
		Software gpn = new Software();
		gpn.setName("NOPING");
		gpn.setDescription("The No.1 GPN software!!!");
		gpn.setCompany("NOPING");
		gpn.setCategory("Software");
		gpn.setCode("S-NOPING-V-1");
		gpn.setLicense("Y1A7-8Q44-8Y8T-4TRW");
		gpn.setMaxPCAllowed(1);
		gpn.setCurrentInstallations(1);
		
		System.out.println("Software - "+gpn);
		
		Software windows = new Software();
		windows.setName("Microsoft Windows 11");
		windows.setDescription("The No.1 OS software!!!");
		windows.setCompany("Microsoft");
		windows.setCategory("Software");
		windows.setCode("S-Windows-11-1");
		windows.setLicense("Y1A7-8Q44-8Y8T-4TRW");
		windows.setMaxPCAllowed(3);
		windows.setCurrentInstallations(1);
		
		System.out.println("Software - "+windows);
		
	}

}
