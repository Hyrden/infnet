package br.edu.infnet.apiproduct.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiproduct.model.domain.Peripheral;

@Repository
public interface PeripheralRepository extends CrudRepository<Peripheral, Integer>{
	
}
