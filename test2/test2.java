package test2;

import javax.swing.JOptionPane;

/**
 * Crea un programa que solicite el año de nacimiento del usuario y calcule su edad actual.
 * crear una ventana al usuario requiriendo su año de nacimiento
 * escanear ese año 
 * descontar con el año actual
 */
public class test2 {

    public static void main(String[] args) {
        int actual=2024;
        int edad;
        int anonac = Integer.parseInt(JOptionPane.showInputDialog("Hola en que año naciste?"));
        edad=actual-anonac;
        JOptionPane.showMessageDialog(null, "Su edad actual es : " + edad);

        
    }
}