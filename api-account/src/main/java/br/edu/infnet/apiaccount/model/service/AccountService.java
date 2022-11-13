package br.edu.infnet.apiaccount.model.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiaccount.model.domain.Account;
import br.edu.infnet.apiaccount.model.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	AccountRepository accRep;
	
	public void insert(Account account) {
		accRep.save(account);
	}
	public void delete(Integer id) {
		accRep.deleteById(id);
	}
	public List<Account> getList(Integer id){
		if(id==null)return (List<Account>) accRep.findAll();
		return accRep.getList(id);
	}
	public List<Account> getAll(){
		return (List<Account>) accRep.findAll();
	}
}
