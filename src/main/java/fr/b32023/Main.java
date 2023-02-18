package fr.b32023;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        createdbPetstore();
    }

    private static void createdbPetstore() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "petstore" );
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}