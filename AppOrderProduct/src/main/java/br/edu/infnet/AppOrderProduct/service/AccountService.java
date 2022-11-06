package br.edu.infnet.AppOrderProduct.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppOrderProduct.model.domain.Account;
import br.edu.infnet.AppOrderProduct.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	AccountRepository accRep;
	
	public void insertAcc(Account account) {
		accRep.save(account);
	}
	public void deleteAcc(Integer id) {
		accRep.deleteById(id);
	}
	public Collection<Account> getAccList(){
		return (Collection<Account>) accRep.findAll();
	}
}
