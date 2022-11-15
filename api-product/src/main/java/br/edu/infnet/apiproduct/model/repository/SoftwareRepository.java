package br.edu.infnet.apiproduct.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiproduct.model.domain.Software;

@Repository
public interface SoftwareRepository extends CrudRepository<Software, Integer>{
	
}
