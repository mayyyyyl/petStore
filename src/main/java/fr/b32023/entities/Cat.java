package fr.b32023.entities;

import javax.persistence.Entity;

@Entity
public class Cat extends Animal {

    private String chipId;

    public Cat() {
    }

    public String getChiId() {
        return chipId;
    }

    public void setChiId(String chiId) {
        this.chipId = chiId;
    }
}