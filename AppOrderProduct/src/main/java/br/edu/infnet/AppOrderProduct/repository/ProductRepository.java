package br.edu.infnet.AppOrderProduct.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppOrderProduct.model.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
