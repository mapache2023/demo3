package modelo;

import javax.persistence.*;

@Entity
@Table(name = "horas")
@NamedQueries({
        @NamedQuery(name = "Hora.findByNrs_Nombre", query = "select h.hora from Hora h where h.nrs.nombre = :nombre"),
        @NamedQuery(name = "Hora.findByNrs_NombreLike", query = "select h.hora, h.salonNombre from Hora h where h.nrs.nombre like :nombre")
})
public class Hora {
    @Id
    @Column(name = "hora")
    private Integer hora;

    @ManyToOne
    @JoinColumn(name = "nrs")
    private Materia nrs;

    @ManyToOne
    @JoinColumn(name = "salon_nombre")
    private Salon salonNombre;

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Materia getNrs() {
        return nrs;
    }

    public void setNrs(Materia nrs) {
        this.nrs = nrs;
    }

    public Salon getSalonNombre() {
        return salonNombre;
    }

    public void setSalonNombre(Salon salonNombre) {
        this.salonNombre = salonNombre;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "hora = " + hora + ")";
    }
}