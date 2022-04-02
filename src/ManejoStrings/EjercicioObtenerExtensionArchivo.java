package ManejoStrings;

public class EjercicioObtenerExtensionArchivo
{
    public static void main(String[] args) {
        String archivo = "alguna_imagen.js";
        System.out.println("archivo.length() = " + archivo.length());
        int punto = archivo.lastIndexOf('.');
        System.out.println("(archivo.substring(punto)+1 = " + archivo.substring(punto+1));

    }
}
