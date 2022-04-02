package ManejoStrings;

public class EjemplosStringMetodos
{
    public static void main(String[] args) {
        //Recordar que estos metodos no modifican sino retornan una nueva instancia
        String nombre = "Pedro";
        System.out.println("nombre.length() = " + nombre.length());//Verificar el tamanio del string
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); //Cambiar a mayusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); //Cambiar a minusculas
        System.out.println("nombre.equals(\"Pedro\") = " + nombre.equals("Pedro")); // Comparar
        System.out.println("nombre.equalsIgnoreCase(\"pedro\") = " + nombre.equalsIgnoreCase("pedro"));//Ignorar mayusculas
        System.out.println("nombre.compareTo() = " + nombre.compareTo("Pedro"));//comparacion sobre el orden numerico de cada codigo que esta en Unicode
        //Si retorna 0 son identicos
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2)); //Retorna el caracter en la posicion especificada
        System.out.println("nombre.substring(1,2) = " + nombre.substring(1,3)); //obtener un conjunto de la cadena sin incluir el ultimo parametro
        System.out.println("nombre.substring(0) = " + nombre.substring(0)); //En este caso es del valor especificado hasta el final
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1)); // ultimo caracter

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace('a','.') = " + trabalenguas.replace('a','.')); //Remplazar los caracteres especificados
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //Retorna donde se encuentra el primer caracter especificado
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); //En esta caso la ultimna incidencia encontrada
        //Si no lo encuentra retorna un valor negativo
        System.out.println("trabalenguas.contains(\"tr\") = " + trabalenguas.contains("tr")); // Retorna true si contiene la cadena
        System.out.println("trabalenguas.startsWith(\"t\") = " + trabalenguas.startsWith("t"));// Retorna true si comienza con la cadena especificada
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));//Retorna true si termina con la cadena especificada
        System.out.println("  Trabalenguas  ".trim());//Elimina los espacios que se encuentren en el inicio o final




    }
}
