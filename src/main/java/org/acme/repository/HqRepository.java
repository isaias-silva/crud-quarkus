package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.entities.HqEntity;

import java.util.List;

@ApplicationScoped
public class HqRepository implements PanacheRepository<HqEntity> {
    public HqEntity findByName(String name) {
        return find("name",name).;
    }

    public List<HqEntity> findByAuthor(String author) {
        return list("autor", author);
    }

}