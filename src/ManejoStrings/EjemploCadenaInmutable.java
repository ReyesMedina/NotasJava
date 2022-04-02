package ManejoStrings;

public class EjemploCadenaInmutable
{
    public static void main(String[] args) {
        //Como sabemos los string son inmutables

        /*El estado del objeto nunca cambia, cuando cambiamos el valor lo que sucede es que se
        * crea una nueva instancia, los metodos no modifican el valor del string sino que
        * retornan una nueva instancia*/

        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        curso.concat(profesor);
        System.out.println("curso = " + curso);
        /*En esta caso como se puede observar curso sigue manteniendo su valor ya que concat no modifica
        Sino retorna una nueva instancia*/

        //Entonces necesitamos almacenar la concatenacion en una nueva instancia
        String concatenacion = curso.concat(profesor);
        System.out.println("concatenacion = " + concatenacion);
    }
}
