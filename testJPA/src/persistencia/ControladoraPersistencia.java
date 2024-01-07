
package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Alumno;


public class ControladoraPersistencia {
    AlumnoJpaController aluJPA= new AlumnoJpaController();
    
    public void crearAlumno(Alumno alu){
        try {
            aluJPA.create(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
