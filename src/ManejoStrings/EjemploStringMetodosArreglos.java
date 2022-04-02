package ManejoStrings;

public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());//Convertir en un arreglo de caracteres
        char [] arreglo = trabalenguas.toCharArray();

        for (int i=0 ; i<arreglo.length;i++){ //length en un arreglo es un atributo no un metodo
            System.out.print(arreglo[i]);
        }

        String [] arreglo2 = trabalenguas.split("a");

    }
}
