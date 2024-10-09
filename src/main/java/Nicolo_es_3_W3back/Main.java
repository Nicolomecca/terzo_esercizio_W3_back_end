package Nicolo_es_3_W3back;


import Nicolo_es_3_W3back.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_a_più_tabelle_es3");
        EntityManager em = emf.createEntityManager();


        // Crea un evento
        Evento evento = new Evento("Concerto di Primavera", LocalDate.of(2024, 5, 15), "Un concerto all'aperto con artisti locali.", TipoEvento.PUBBLICO, 100);

        // Salva l'evento
        em.getTransaction().begin();
        em.persist(evento);
        em.getTransaction().commit();

        // Crea una persona
        Persona persona = new Persona("Mario", "Rossi", "mario.rossi@example.com", LocalDate.of(1990, 4, 12), Sesso.MASCHIO, new ArrayList<>());

        // Salva la persona
        em.getTransaction().begin();
        em.persist(persona);
        em.getTransaction().commit();

        // Crea una partecipazione
        Partecipazione partecipazione = new Partecipazione(persona, evento, StatoPartecipazione.DA_CONFERMARE);

        // Salva la partecipazione
        em.getTransaction().begin();
        em.persist(partecipazione);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
