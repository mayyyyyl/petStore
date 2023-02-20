package fr.b32023;

import fr.b32023.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import static fr.b32023.entities.FishLivEnv.FRESH_WATER;
import static fr.b32023.entities.FishLivEnv.SEA_WATER;
import static fr.b32023.entities.ProdType.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        createdbPetstore();
    }

    private static void createdbPetstore() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "petstore" );
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        PetStore ps1 = new PetStore("A Tout Chat et Chien", "François Dupond", new Address("3", "Route du bonheur", "44000", "Nantes"));
        PetStore ps2 = new PetStore("Toutou pour le Chien", "Isabelle Haie", new Address("60", "Avenue de la paix", "44190", "Clisson"));
        PetStore ps3 = new PetStore("Moustaches - Le comptoir des chiens et chats", "Léa Lefeuvre", new Address("500", "Boulevard de la prairie", "44150", "Ancenis"));

        Product p1 = new Product("200","Croquettes pour chat",FOOD, 5.99);
        Product p2 = new Product("201","Laisse pour chien",ACCESSORY, 29.99);
        Product p3 = new Product("202","Paille pour rongeurs",CLEANING, 15.50);

        Cat c1 = new Cat(LocalDateTime.now(), "noir", ps1, "20154");
        Cat c2 = new Cat(LocalDateTime.now(), "marron", ps2, "20155");
        Cat c3 = new Cat(LocalDateTime.now(), "tigré", ps3, "20160");

        Fish f1 = new Fish(LocalDateTime.now(), "rouge", ps1, FRESH_WATER);
        Fish f2 = new Fish(LocalDateTime.now(), "gris", ps2, SEA_WATER);
        Fish f3 = new Fish(LocalDateTime.now(), "bleu", ps3, FRESH_WATER);


        Set<Product> products = new HashSet<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        ps1.setProducts(products);
        ps2.setProducts(products);


        em.persist(ps1);
        em.persist(ps2);
        em.persist(ps3);

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