package ManejoStrings;


public class EjerciciosCadenasComparacion {
    public static void main(String[] args) {
        //Comparacion
        String str = "Hola";
        String str2 = new String("Hola");
        //Chequea si son el mismo objeto
        System.out.println("str == str2: " + (str == str2));

        //Chequea si tiene el mismo valor
        System.out.println("str.equals(str2): " + str.equals(str2));

        //Chequea si tiene el mismo valor ignorando mayusculas o minusculas
        System.out.println("str.equalsIgnoreCase(str2): " + str.equalsIgnoreCase(str2));
        
        //Otro caso
        String str3 = "Hola";
        System.out.println("(str3==str): " + (str3==str));

        /*Cuando se crea un objeto en la literal de tipo string y despues se crea otro objeto
        * de tipo string que contiene el mismo valor de un objeto que ya esta creado en nuestra
        * aplicacion  en este caso str y str3 lo que hace es no crear un nuevo objeto para optimizar
        * sino asignar la referencia de la variable que ya existe entonces str3 sera igual a str y
        * no se creara otra instancia, es el mismo objeto que se guarda en distintas variables
        * */

        /* Nota: siempre que queramos comparar nuestros Strings se debe emplear el metodo
        * equals()*/



    }
}
