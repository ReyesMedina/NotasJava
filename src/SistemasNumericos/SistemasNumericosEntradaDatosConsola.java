package SistemasNumericos;
//Trabajaremos con la conversion de sistemas numericos introducidos por el usuario por consola


import java.util.Scanner;

public class SistemasNumericosEntradaDatosConsola {
    public static void main(String[] args) {

        //Instanciar objeto scanner para recibir datos por consola
        Scanner scanner = new Scanner(System.in);

        //Pedir dato al usuario por consola
        System.out.println("Ingrese un numero: ");

        String convertirNumero = scanner.nextLine(); //Guarda el dato ingresado en la ultima linea
        //Varianble para convertir el mensaje a int
        int numeroDecimal = 0;

        //Comprobar que nuestro usuario ingrese un numero decimal
        try{
            numeroDecimal=Integer.parseInt(convertirNumero); //Intentar convertir string a int
            //Podemos leer directamente el dato en int con scanner.nextInt();
        }catch(NumberFormatException e){ //En caso de error:
            System.out.println("Por favor introduce un numero decimal");
            main(args);//Volver a ejecutar los pasos
            System.exit(0);//Salir del programa

        }


        //Concatenar el mensaje de la conversion para mostrarlo
        String mensaje ="El Numero " +numeroDecimal +" en binario es: " +Integer.toBinaryString(numeroDecimal);
        mensaje+= "\nen octal es: " +Integer.toOctalString(numeroDecimal);
        mensaje+= "\ny en Hexadecimal es: " +Integer.toHexString(numeroDecimal);

        //Mostrar mensaje en consola
        System.out.println(mensaje);
    }
}
