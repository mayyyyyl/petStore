package fr.b32023.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {
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

    public Animal(LocalDateTime birth, String couleur, PetStore petStore) {
        this.birth = birth;
        this.couleur = couleur;
        this.petStore = petStore;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getBirth() {
        return birth;
    }

    public String getCouleur() {
        return couleur;
    }
}
