package br.edu.infnet.AppOrderProduct.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.AppOrderProduct.model.domain.Software;
import br.edu.infnet.AppOrderProduct.model.repository.SoftwareRepository;
@Service
public class SoftwareService {
	@Autowired
	private SoftwareRepository softwareRep;
	
	public void insertSoftware(Software software) {
		softwareRep.save(software);
	}
	public void deleteSoftware(Integer id) {
		softwareRep.deleteById(id);
	}
	public List<Software> getSoftwareList(){
		return (List<Software>) softwareRep.findAll();
	}
}
