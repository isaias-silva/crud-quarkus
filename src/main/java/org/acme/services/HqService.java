package org.acme.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.dto.CreateHqDto;
import org.acme.entities.HqEntity;
import org.acme.repository.HqRepository;
import org.acme.utils.exception.HttpError;
import org.acme.utils.responses.HttpResponse;

import java.util.*;

@ApplicationScoped
public class HqService {
    @Inject
    HqRepository repository;


   public List<HqEntity> getAllHqs(){
        return repository.listAll();
   }

   public HqEntity getHqById(Long id) throws HttpError {
      HqEntity hqDb=repository.findById(id);

     if(hqDb==null){
         throw new HttpError(404,"hq não encontrada.");
     }
   return hqDb;
   }

   public HttpResponse createHq(CreateHqDto dto){

       HqEntity hqExists= repository.findByName();

       return new HttpResponse("hq criada com sucesso!");
   }
}
