package ManejoStrings;

import java.util.Locale;

public class ValidarString {
    //Validaremos el contenido de nuestros strings
    /*Es importante validar para evitar problemas en nuestra aplicacion,
    * por ejemplo si nuestro objeto es null y queremos invocar algun
    * atributo o metodo de este objeto nuestra aplicacion fallara lanzara
    * el error NullPointerException*/
    public static void main(String[] args) {
        String curso = null;
        
        boolean esNulo= curso == null;
        System.out.println("esNulo = " + esNulo);
       // System.out.println(curso.toUpperCase()); //Por ejemplo aqui lanzaria un error

        //Null es diferente de vacio
         curso = "";
        esNulo = curso== null;
        System.out.println("esNulo = " + esNulo);
        boolean esVacio = curso.isEmpty(); //Verifica si esta vacio
        System.out.println("esVacio = " + esVacio);

        String curso2 = " "; //En esta caso ya no es null ni vacio sino blank
        boolean esBlanco = curso2.isBlank();//Verifica si esta en blanco
        System.out.println("esBlanco = " + esBlanco);


    }
}
