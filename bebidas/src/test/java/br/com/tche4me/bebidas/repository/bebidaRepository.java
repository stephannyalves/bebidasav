package br.com.tche4me.bebidas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tche4me.bebidas.model.bebida;

public interface bebidaRepository extends MongoRepository<bebida, String> {
  
}
    

