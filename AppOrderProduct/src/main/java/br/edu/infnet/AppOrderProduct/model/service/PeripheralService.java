package br.edu.infnet.AppOrderProduct.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.AppOrderProduct.model.domain.Peripheral;
import br.edu.infnet.AppOrderProduct.model.repository.PeripheralRepository;

@Service
public class PeripheralService {
	@Autowired
	private PeripheralRepository pRep;
	
	public void insertPeripheral(Peripheral peripheral) {
		pRep.save(peripheral);
	}
	public void deletePeripheral(Integer id) {
		pRep.deleteById(id);
	}
	public List<Peripheral> getPeripheralList(){
		return (List<Peripheral>) pRep.findAll();
	}
}
