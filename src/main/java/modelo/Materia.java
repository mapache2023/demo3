package modelo;

import javax.persistence.*;

@Entity
@Table(name = "materia")
@NamedQueries({
        @NamedQuery(name = "Materia.findByNombreLike", query = "select m from Materia m where m.nombre like :nombre")
})
public class Materia {
    @Id
    @Column(name = "nrs", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "maestro_nombre")
    private Maestro maestroNombre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Maestro getMaestroNombre() {
        return maestroNombre;
    }

    public void setMaestroNombre(Maestro maestroNombre) {
        this.maestroNombre = maestroNombre;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "nombre = " + nombre + ")";
    }
}