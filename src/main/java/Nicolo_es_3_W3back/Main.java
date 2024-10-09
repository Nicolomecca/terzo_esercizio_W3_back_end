package Nicolo_es_3_W3back;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_a_più_tabelle_es3");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        // Puoi inserire qui qualsiasi operazione di test, ad esempio creare e persistere un'entità
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}