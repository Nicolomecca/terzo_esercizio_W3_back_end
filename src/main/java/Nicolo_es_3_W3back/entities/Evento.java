package Nicolo_es_3_W3back.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "evento")
public class Evento {
    @Id
    @GeneratedValue
    private UUID idEvento;

    private String titolo;
    private LocalDate data;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;

    private long listaNPersone;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location; // Aggiungi questo campo

    public Evento() {
    }

    public Evento(String titolo, LocalDate data, String descrizione, TipoEvento tipoEvento, long listaNPersone, Location location) {
        this.titolo = titolo;
        this.data = data;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.listaNPersone = listaNPersone;
        this.location = location;
    }

    // Getters e Setters

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "idEvento=" + idEvento +
                ", titolo='" + titolo + '\'' +
                ", data=" + data +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", listaNPersone=" + listaNPersone +
                ", location=" + location +
                '}';
    }
}