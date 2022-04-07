package ClaseWrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    //Ejemplo usar el metodo getClass para obtener informacion de las clases de Java

    public static void main(String[] args) {

        String strText = "Clase string";
        Class strClass = strText.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackage() = " + strClass.getPackage());
        System.out.println("strClass = " + strClass);

        for(Method metodo : strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());

        }
    }
}
