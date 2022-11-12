package br.edu.infnet.AppOrderProduct.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name="addressClient")
public interface IAddressClient {
	@GetMapping(value = "/{postalCode}/json")
	public Object getPostalCode(@PathVariable String postalCode);
}
