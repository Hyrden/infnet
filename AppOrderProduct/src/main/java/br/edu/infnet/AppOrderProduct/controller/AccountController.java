package br.edu.infnet.AppOrderProduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import br.edu.infnet.AppOrderProduct.model.domain.Account;
import br.edu.infnet.AppOrderProduct.model.domain.User;
import br.edu.infnet.AppOrderProduct.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@GetMapping(value="/account/list")
	public String accountScreen(Model model,@SessionAttribute("user") User user) {
		model.addAttribute("accounts",accountService.getAccList(user,model));
		return "account/list";
	}
	@GetMapping(value="/account")
	public String registerAcc() {
		return "account/register";
	}
	@PostMapping(value="/account/insert")
	public String insertAcc(Account acc, @SessionAttribute("user") User user) {
		acc.setUser(user);
		accountService.insertAcc(acc);		
		return "redirect:/account/list";
	}
	@GetMapping(value="/account/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		accountService.deleteAcc(id);
		return "redirect:/account/list";
	}
}
