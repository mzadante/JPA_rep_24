
package logica;

import java.util.Date;
import persistencia.ControladoraPersistencia;

public class TestJPA {

    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("12345678", "Nico", "Martin", new Date("01/06/2024"));
        ControladoraPersistencia control = new ControladoraPersistencia();
        control.crearAlumno(alumno1);
    }
    
}
