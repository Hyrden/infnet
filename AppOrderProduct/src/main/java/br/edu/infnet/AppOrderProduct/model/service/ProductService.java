package br.edu.infnet.AppOrderProduct.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppOrderProduct.model.domain.Product;
import br.edu.infnet.AppOrderProduct.model.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository prodRep;

	public void insertProduct(Product product) {
		prodRep.save(product);
	}
	public void deleteProduct(Integer id) {
		prodRep.deleteById(id);
	}
	public Collection<Product> getProductList(){
		return (Collection<Product>) prodRep.findAll();
	}
}
