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
public class profesor extends persona {
    private String Dpi;
    
    public profesor(String nombre, String fechaNacimiento, int edad) {
        super(nombre, fechaNacimiento, edad);
    }

    public String getDpi() {
        return Dpi;
    }

    public void setDpi(String Dpi) {
        this.Dpi = Dpi;
    }
public void mostrarDatos() {
    JOptionPane.showMessageDialog(null," PROFESOR: \n Nombre: " + getNombre() + " Fecha Nacimiento:" + getFechaNacimiento()+" Edad:  " + getEdad()+" DPI: " + getDpi());
}   
}
