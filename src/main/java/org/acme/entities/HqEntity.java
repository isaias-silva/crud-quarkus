package org.acme.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Hqs")
public class HqEntity implements Serializable {
    private static final long serialId = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String actor;
    private String year_creation;
    private String image;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getYear_creation() {
        return year_creation;
    }

    public void setYear_creation(String year_creation) {
        this.year_creation = year_creation;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
