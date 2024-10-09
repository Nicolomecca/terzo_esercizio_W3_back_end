package Nicolo_es_3_W3back.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "evento")
public class Evento {
    @Id
    @GeneratedValue
    private UUID idEvento;

    private String titolo;
    private LocalDate date;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;

    @ManyToMany(mappedBy = "eventi")
    private List<Persona> partecipanti;

    public Evento() {
        
    }

    public Evento(UUID idEvento, String titolo, LocalDate date, String descrizione, TipoEvento tipoEvento, List<Persona> partecipanti) {
        this.idEvento = idEvento;
        this.titolo = titolo;
        this.date = date;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.partecipanti = partecipanti;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public List<Persona> getPartecipanti() {
        return partecipanti;
    }

    public void setPartecipanti(List<Persona> partecipanti) {
        this.partecipanti = partecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "idEvento=" + idEvento +
                ", titolo='" + titolo + '\'' +
                ", date=" + date +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", partecipanti=" + partecipanti +
                '}';
    }
}
