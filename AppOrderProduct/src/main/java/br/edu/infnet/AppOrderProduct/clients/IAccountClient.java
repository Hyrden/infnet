package br.edu.infnet.AppOrderProduct.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.AppOrderProduct.model.domain.Account;

@FeignClient(url = "localhost:8082/api/account", name = "accountClient")
public interface IAccountClient {
	@PostMapping(value = "/insert")
	public void insert(@RequestBody Account account);
	@DeleteMapping(value = "/{id}/delete")
	public void delete(@PathVariable Integer id);
	@GetMapping(value = "/list")
	public List<Account> getList(@RequestParam Integer id);
	@GetMapping(value = "/listall")
	public List<Account> getList();
}
