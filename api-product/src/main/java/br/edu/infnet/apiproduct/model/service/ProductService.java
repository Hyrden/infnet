package br.edu.infnet.apiproduct.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiproduct.model.domain.Product;
import br.edu.infnet.apiproduct.model.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository prodRep;
	
	public void insert(Product product) {
		prodRep.save(product);
	}
	public void delete(Integer id) {
		prodRep.deleteById(id);
	}
	public List<Product> getList(){
		return (List<Product>) prodRep.findAll();
	}
}
