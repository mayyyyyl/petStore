package fr.b32023.entities;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Cat extends Animal {

    private String chipId;

    public Cat(LocalDateTime birth, String couleur, PetStore petStore, String chipId) {
        super(birth, couleur, petStore);
        this.chipId = chipId;
    }

    public Cat() {

    }

    public String getChiId() {
        return chipId;
    }

    public void setChiId(String chiId) {
        this.chipId = chiId;
    }
}