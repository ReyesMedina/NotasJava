package ManejoStrings;

public class EjerciciosCadenasConcatenacion
{
    public static void main(String[] args) {
        //Concatenacion de cadenas

        //Simple
        String nombre = "Pedro";
        String apellido = "reyes";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);

        //Ejemplo precedencia de operadores
        int numero =5;
        int numero2 = 10;

        System.out.println(nombre + numero + numero2);

        /*En esta caso se imprime Pedro510 debido a la precedencia de operadores
        * ya que al ejecutarlo primero encuentra la variable de tipo string
        * opera con el resto de la misma manera string, la precedencia siempre
        * se realiza de izquierda a derecha, por lo que concatena en lugar de hacer la suma
        * */

        //Para cambiar la precedencia utilizamos los parentesis
        System.out.println(nombre + (numero + numero2));
        //En este caso primero hara la operacion aritmetica
        //Tambien podriamos ordenar primero la suma y despues la concatenacion con la precedencia de
        // izquierda a derecha
        System.out.println(numero + numero2 + nombre);

        //Concatenacion con el metodo concat de string
        String variableConcatenada = nombre.concat(apellido);
        System.out.println("variableConcatenada = " + variableConcatenada);




    }
}
