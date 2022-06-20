package modelo;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "maestro")
@NamedQueries({
        @NamedQuery(name = "Maestro.findByMaterias_NombreLike", query = "select m from Maestro m inner join m.materias materias where materias.nombre like :nombre")
})
public class Maestro {
    @Id
    @Column(name = "nombre", nullable = false, length = 50)
    private String id;

    @Column(name = "correo", length = 50)
    private String correo;

    @OneToMany(mappedBy = "maestroNombre")
    private Set<Materia> materias = new LinkedHashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "correo = " + correo + ")";
    }
}