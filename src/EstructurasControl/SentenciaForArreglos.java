package EstructurasControl;

import javax.swing.*;

public class SentenciaForArreglos {
    //Recorrer un arreglo con el ciclo for
    public static void main(String[] args) {
        String [] nombres = {"andres","pepe","gloria","lorena","ximena","alondra"};
        int longitudArreglo = nombres.length;
        for(int i = 0; i<longitudArreglo; i++){
            if(nombres[i].equalsIgnoreCase("andres") ||
                    nombres[i].equalsIgnoreCase("alondra")){
                continue;
            }
            System.out.println(i + ".-" + nombres[i]);

        }
        //Ejemplo buscar un nombre
        String buscarNombre = JOptionPane.showInputDialog("Ingrese al nombre a buscar ejemplo \"pepa\"");
        boolean encontrado = false;

        for(int i = 0; i<longitudArreglo;i++){
            if (nombres[i].equalsIgnoreCase(buscarNombre)) {
                encontrado = true;
                break;

            }

        }
        if(encontrado){
            JOptionPane.showMessageDialog(null,buscarNombre + " fue encontrado");

        }
        else{
            JOptionPane.showMessageDialog(null,buscarNombre + " no fue encontrado");
        }
    }
}
