package br.edu.infnet.AppOrderProduct.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppOrderProduct.clients.IProductClient;
import br.edu.infnet.AppOrderProduct.model.domain.Software;
@Service
public class SoftwareService {
	@Autowired
	private IProductClient clientApi;
	
	public void insertSoftware(Software software) {
		clientApi.insert(software);
	}
	public void deleteSoftware(Integer id) {
		clientApi.delete(id);
	}
	public List<Software> getSoftwareList(){
		return (List<Software>) clientApi.getSoftwareList();
	}
}
