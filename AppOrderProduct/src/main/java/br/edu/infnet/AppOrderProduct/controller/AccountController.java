package br.edu.infnet.AppOrderProduct.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppOrderProduct.model.domain.Account;

@Controller
public class AccountController {
	private static Map<Integer,Account> mpAcc = new HashMap<Integer,Account>();
	
	public static void insertAcc(Account account) {
		mpAcc.put(account.getId(), account);
	}
	public static void deleteAcc(Integer id) {
		mpAcc.remove(id);
	}
	public static Collection<Account> getAccList(){
		return mpAcc.values();
	}
	@GetMapping(value="/account/list")
	public String accountScreen(Model model) {
		model.addAttribute("accounts",getAccList());
		return "account/list";
	}
	@GetMapping(value="/account/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		deleteAcc(id);
		return "redirect:/account/list";
	}
}
