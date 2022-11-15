package br.edu.infnet.AppOrderProduct.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppOrderProduct.clients.IProductClient;
import br.edu.infnet.AppOrderProduct.model.domain.Peripheral;

@Service
public class PeripheralService {
	@Autowired
	private IProductClient clientApi;
	
	public void insertPeripheral(Peripheral peripheral) {
		clientApi.insert(peripheral);
	}
	public void deletePeripheral(Integer id) {
		clientApi.delete(id);
	}
	public List<Peripheral> getPeripheralList(){
		return (List<Peripheral>) clientApi.getPeripheralList();
	}
}
