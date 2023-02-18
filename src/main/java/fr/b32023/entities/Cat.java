package fr.b32023.entities;

import javax.persistence.Entity;

@Entity
public class Cat extends Animal {

    private String chiId;

    public Cat() {
    }

    public String getChiId() {
        return chiId;
    }

    public void setChiId(String chiId) {
        this.chiId = chiId;
    }
}
