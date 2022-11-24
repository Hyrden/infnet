package br.edu.infnet.apiaccount.model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiaccount.model.domain.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer>{
	@Query("FROM Account a WHERE a.user.id =:userid")
	List<Account> getList(Integer userid);
}
