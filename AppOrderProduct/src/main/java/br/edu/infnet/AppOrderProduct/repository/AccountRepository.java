package br.edu.infnet.AppOrderProduct.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppOrderProduct.model.domain.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer>{
	@Query("FROM Account a WHERE a.user.id =:userid")
	List<Account> getAccList(Integer userid);
}
