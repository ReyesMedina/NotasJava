package SistemasNumericos;

import javax.swing.*;

//Trabajaremos con la conversion de sistemas numericos introducidos por el usuario en una ventana
public class SistemasNumericosEntradaDatosVentana {
    public static void main(String[] args) {

        //Pedir dato al usuario con ventana JOptionPane
        String convertirNumero = JOptionPane.showInputDialog(null, "Ingrese un numero: ");

        //Varianble para convertir el mensaje a int
        int numeroDecimal = 0;

        //Comprobar que nuestro usuario ingrese un numero decimal
        try{
            numeroDecimal=Integer.parseInt(convertirNumero); //Intentar convertir string a int
        }catch(NumberFormatException e){ //En caso de error:
            JOptionPane.showMessageDialog(null,"Por favor introduce un numero decimal"); //Informar al usuario
            main(args);//Volver a ejecutar los pasos
            System.exit(0);//Salir del programa

        }


        //Concatenar el mensaje de la conversion para mostrarlo
        String mensaje ="El Numero " +numeroDecimal +" en binario es: " +Integer.toBinaryString(numeroDecimal);
        mensaje+= "\nen octal es: " +Integer.toOctalString(numeroDecimal);
        mensaje+= "\ny en Hexadecimal es: " +Integer.toHexString(numeroDecimal);

        //Mostrar mensaje en ventana con JOptionPane
        JOptionPane.showMessageDialog(null,mensaje);


    }
}
