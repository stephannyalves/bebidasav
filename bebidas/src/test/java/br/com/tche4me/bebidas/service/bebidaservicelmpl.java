package br.com.tche4me.bebidas.service;



import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.catalina.mapper.Mapper;
import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.bebidaService;
import br.com.tche4me.bebidas.model.bebida;
import br.com.tche4me.bebidas.repository.bebidaRepository;


@Service
public class bebidaservicelmpl implements bebidaService{
    private static final String Repository = null;
    @Autowired
    bebidaRepository repositorio;

    @Override
    public <bebidaDto> List <bebidaDto> obterTodos() {
        String pess= Repository = Repository {

        }
    
    }
    public bebidaservicelmpl(bebidaRepository repositorio) {
        this.repositorio = repositorio;
    }


    }
    @Override
    public String toString() {
        return "bebidaservicelmpl [repositorio=" + repositorio + "]";
    }
   

    


}