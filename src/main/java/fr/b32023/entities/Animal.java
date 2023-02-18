package fr.b32023.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime birth;
    private String couleur;

    @ManyToOne
    @JoinColumn(name = "PETSTORE_ID")
    private PetStore petStore;

    public Animal() {
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getBirth() {
        return birth;
    }

    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }
}
