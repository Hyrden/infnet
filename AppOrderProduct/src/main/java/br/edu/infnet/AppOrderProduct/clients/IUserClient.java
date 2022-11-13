package br.edu.infnet.AppOrderProduct.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.AppOrderProduct.model.domain.User;

@FeignClient(url = "localhost:8081/api/user", name = "userClient")
public interface IUserClient {
	@PostMapping(value = "/insert")
	public void insert(@RequestBody User user);	
	@DeleteMapping(value = "/{id}/delete")
	public void delete(@PathVariable Integer id);
	@GetMapping(value = "/list")
	public List<User> getList();
	@PostMapping(value = "/validate")
	public User validate(@RequestParam String email, @RequestParam String password);
}
