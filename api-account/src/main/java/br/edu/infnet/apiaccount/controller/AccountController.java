package br.edu.infnet.apiaccount.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiaccount.model.service.AccountService;
import br.edu.infnet.apiaccount.model.domain.Account;

@RestController
@RequestMapping("/api/account")
public class AccountController {
	@Autowired
	AccountService accService;
	@PostMapping(value = "/insert")
	public void insert(@RequestBody Account account) {
		accService.insert(account);
	}	
	@DeleteMapping(value = "/{id}/delete")
	public void delete(@PathVariable Integer id) {
		accService.delete(id);
	}	
	@GetMapping(value = "/list")
	public List<Account> getList(@RequestParam Integer id){
		return accService.getList(id);
	}
	@GetMapping(value = "/listall")
	public List<Account> getList(){
		return accService.getAll();
	}
}
