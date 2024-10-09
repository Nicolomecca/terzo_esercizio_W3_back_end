package Nicolo_es_3_W3back.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "partecipazione")
class Partecipazione {
    @Id
    @GeneratedValue
    private UUID idPartecipazione;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @Enumerated(EnumType.STRING)
    private StatoPartecipazione stato;

    // Getters e Setters
}