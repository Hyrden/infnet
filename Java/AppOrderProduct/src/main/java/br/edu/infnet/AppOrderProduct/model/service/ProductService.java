package br.edu.infnet.AppOrderProduct.model.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppOrderProduct.clients.IProductClient;
import br.edu.infnet.AppOrderProduct.model.domain.Product;

@Service
public class ProductService {
	@Autowired
	private IProductClient clientApi;
	
	public void deleteProduct(Integer id) {
		clientApi.delete(id);
	}
	public List<Product> getProductList(){
		List<Product> ltProduct = new ArrayList<>();
		ltProduct.addAll(clientApi.getGameList());
		ltProduct.addAll(clientApi.getPeripheralList());
		ltProduct.addAll(clientApi.getSoftwareList());
		return ltProduct;
	}
}