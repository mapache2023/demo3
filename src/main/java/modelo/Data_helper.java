package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Data_helper {
    private EntityManager em;
    public Data_helper(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        em = emf.createEntityManager();}
    Data_helper(EntityManager em){  this.em = em;}

    public Maestro maestroxmateria(String nombre) {
        try {
            Maestro maestro = (Maestro) em.createNamedQuery("Maestro.findByMaterias_NombreLike")
                    .setParameter("nombre", nombre).getSingleResult();
            return maestro;
        } catch (Exception e) {
            return null;
        }
    }
    public List<Hora> horasxmateria(String nombre){
       try {
           List <Hora> hora= (List<Hora>) em.createNamedQuery("Hora.findByNrs_NombreLike").setParameter("nombre",nombre).getResultList();
           return hora;
       }catch (Exception exception){

       return null;}
    }
    public Materia materiaxnombre(String nombre){
        try {
            Materia materia = (Materia) em.createNamedQuery("Materia.findByNombreLike")
                    .setParameter("nombre", nombre).getSingleResult();
            return materia;
        } catch (Exception e) {
            return null;
        }
    }
}
