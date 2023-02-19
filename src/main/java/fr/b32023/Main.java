package fr.b32023;

import fr.b32023.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

import static fr.b32023.entities.FishLivEnv.FRESH_WATER;
import static fr.b32023.entities.FishLivEnv.SEA_WATER;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        createdbPetstore();
    }

    private static void createdbPetstore() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "petstore" );
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        PetStore p1 = new PetStore("A Tout Chat et Chien", "François Dupond", new Address("3", "Route du bonheur", "44000", "Nantes"));
        PetStore p2 = new PetStore("Toutou pour le Chien", "Isabelle Haie", new Address("60", "Avenue de la paix", "44190", "Clisson"));
        PetStore p3 = new PetStore("Moustaches - Le comptoir des chiens et chats", "Léa Lefeuvre", new Address("500", "Boulevard de la prairie", "44150", "Ancenis"));

//        Product produit = new Product("200","food",4, 5.99, p1);

        Cat c1 = new Cat(LocalDateTime.now(), "noir", p1, "20154");
        Cat c2 = new Cat(LocalDateTime.now(), "marron", p2, "20155");
        Cat c3 = new Cat(LocalDateTime.now(), "tigré", p3, "20160");

        Fish f1 = new Fish(LocalDateTime.now(), "rouge", p1, FRESH_WATER);
        Fish f2 = new Fish(LocalDateTime.now(), "gris", p2, SEA_WATER);
        Fish f3 = new Fish(LocalDateTime.now(), "bleu", p3, FRESH_WATER);

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);

        em.persist(c1);
        em.persist(c2);
        em.persist(c3);

        em.persist(f1);
        em.persist(f2);
        em.persist(f3);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}