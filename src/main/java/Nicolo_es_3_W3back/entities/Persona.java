package Nicolo_es_3_W3back.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue
    private UUID idPersona;

    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataNascita;

    @Enumerated(EnumType.STRING)
    private Sesso sesso;

    @OneToMany(mappedBy = "persona")
    private List<Partecipazione> partecipazioni;

    public Persona() {
    }

    public Persona(String nome, String cognome, String email, LocalDate dataNascita, Sesso sesso, List<Partecipazione> partecipazioni) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
        this.partecipazioni = partecipazioni;
    }

    // Getters e Setters

    public List<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }

    // Altri getter e setter

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascita=" + dataNascita +
                ", sesso=" + sesso +
                ", partecipazioni=" + partecipazioni +
                '}';
    }
}