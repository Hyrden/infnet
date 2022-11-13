package br.edu.infnet.AppOrderProduct.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppOrderProduct.model.domain.Software;

@Repository
public interface SoftwareRepository extends CrudRepository<Software, Integer>{

}
