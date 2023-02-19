package fr.b32023.entities;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Fish extends Animal {

    private FishLivEnv livingEnv;

    public Fish() {
    }

    public Fish(LocalDateTime birth, String couleur, PetStore petStore, FishLivEnv livingEnv) {
        super(birth, couleur, petStore);
        this.livingEnv = livingEnv;
    }

    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }
}