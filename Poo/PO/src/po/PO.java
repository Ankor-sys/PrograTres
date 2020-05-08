/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po;

import javax.swing.JOptionPane;

/**
 *
 * @author SOPORTE
 */
public class PO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //persona objPersona = new persona();
       // persona objPersona = new persona("Luis Ejemplo", "2000-01-01", 20);
        //objPersona.crearPersona("Luis Ejemplo", "2000-01-01", 20);
        //JOptionPane.showMessageDialog(null, "Nombre: " + objPersona.getNombre()+" Fecha Nacimiento: " + objPersona.getFechaNacimiento() + " Edad: "+ objPersona.getEdad());
        alumno objAlumno = new alumno("Enrique Lopez", "1990-01-01", 30);
        objAlumno.setMatricula("6666666");
        objAlumno.mostrarDatos();
        profesor objProfesor = new profesor("Juan Ejemplo", "1980-01-01", 40);
        objProfesor.setDpi("18012320");
        objProfesor.mostrarDatos();
    }
    
}
