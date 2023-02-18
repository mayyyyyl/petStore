package fr.b32023.entities;

import javax.persistence.Entity;

@Entity
public class Fish extends Animal {

    private FishLivEnv livingEnv;

    public Fish() {
    }

    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }
}