package br.edu.infnet.AppOrderProduct.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppOrderProduct.model.domain.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Integer>{

}
