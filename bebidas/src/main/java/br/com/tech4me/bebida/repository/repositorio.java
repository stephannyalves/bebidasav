package br.com.tech4me.bebida.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface repositorio extends MongoRepository<bebida, String> {
    
}
    
