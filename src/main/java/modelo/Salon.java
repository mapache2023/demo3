package modelo;

import javax.persistence.*;

@Entity
@Table(name = "salon")
public class Salon {
    @Id
    @Column(name = "nombre", nullable = false, length = 50)
    private String id;

    @ManyToOne
    @JoinColumn(name = "edificio_nombre")
    private Edificio edificioNombre;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Edificio getEdificioNombre() {
        return edificioNombre;
    }

    public void setEdificioNombre(Edificio edificioNombre) {
        this.edificioNombre = edificioNombre;
    }

}