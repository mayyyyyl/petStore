package fr.b32023.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
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
}
