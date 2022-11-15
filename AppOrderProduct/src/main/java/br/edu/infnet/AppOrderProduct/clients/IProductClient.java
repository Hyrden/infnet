package br.edu.infnet.AppOrderProduct.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.AppOrderProduct.model.domain.Game;
import br.edu.infnet.AppOrderProduct.model.domain.Peripheral;
import br.edu.infnet.AppOrderProduct.model.domain.Product;
import br.edu.infnet.AppOrderProduct.model.domain.Software;

@FeignClient(url = "localhost:8084/api/product", name = "productClient")
public interface IProductClient {
	@PostMapping(value = "/insert")
	public void insert(@RequestBody Object object);
	@DeleteMapping(value = "/{id}/delete")
	public void delete(@PathVariable Integer id);
	@GetMapping(value = "/game/list")
	public List<Game> getGameList();
	@GetMapping(value = "/software/list")
	public List<Software> getSoftwareList();
	@GetMapping(value = "/peripheral/list")
	public List<Peripheral> getPeripheralList();
}
