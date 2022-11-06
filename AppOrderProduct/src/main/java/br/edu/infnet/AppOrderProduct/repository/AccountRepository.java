package br.edu.infnet.AppOrderProduct.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppOrderProduct.model.domain.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer>{

}
