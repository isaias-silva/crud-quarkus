package org.acme.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.entities.HqEntity;
import org.acme.repository.HqRepository;
import org.acme.utils.exception.HttpError;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@ApplicationScoped
public class HqService {
    @Inject
    HqRepository repository;


   public Object getHqs(){
        return repository.findAll();
   }

   public Object getHqById(Long id) throws HttpError {
      Object hqDb=repository.findById(id);
     if(hqDb==null){
         throw new HttpError(404,"hq não encontrada.");
     }
   return hqDb;
   }

}
