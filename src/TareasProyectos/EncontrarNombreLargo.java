package TareasProyectos;

import javax.swing.*;

//Tarea 6
/*Obtener el nombre mas largo de tres personas*/
public class EncontrarNombreLargo {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Introduzca el primer nombre");
        String nombre2 = JOptionPane.showInputDialog("Introduzca el segundo nombre");
        String nombre3 = JOptionPane.showInputDialog("Introduzca el tercer nombre");

        int longitudNombre1 = nombre1.split(" ")[0].length();
        int longitudNombre2 = nombre2.split(" ")[0].length();
        int longitudNombre3 = nombre3.split(" ")[0].length();

        String max = nombre1.split(" ")[0].length()>nombre2.split(" ")[0].length()? nombre1:nombre2;
        max = max.split(" ")[0].length() > nombre3.split(" ")[0].length()? max:nombre3;

        JOptionPane.showMessageDialog(null,max + " tiene el nombre mas largo") ;







    }
}
