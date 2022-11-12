package br.edu.infnet.AppOrderProduct.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import br.edu.infnet.AppOrderProduct.model.domain.Account;
import br.edu.infnet.AppOrderProduct.model.domain.User;
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
	public Collection<Account> getAccList(User u, Model model){
		if(u.getIsAdmin()) {
			model.addAttribute("message","You're an admin, that's why you can see all accounts.");
			return (Collection<Account>) accRep.findAll();
		}else {
			return (Collection<Account>) accRep.getAccList(u.getId());
		}
	}
}
