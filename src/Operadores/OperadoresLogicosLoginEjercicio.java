package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLoginEjercicio {
    public static void main(String[] args) {

        //Ejemplo de login usando operadores logicos

        //usuarios registrados
        String [] usernames = {"pedro","admin"};
        String [] passwords = {"12345","admin00"};



        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese sus credenciales para entrar\n");
        System.out.println("Ingrese nombre de usuario: ");
        String usuarioIngresado = scanner.next();
        System.out.println("Ingrese contrasenia");
        String contraseniaIngresada = scanner.next();

        boolean estaAutorizado = false;
        for (int i = 0; i< usernames.length;i++) {


            if (usernames[i].equals(usuarioIngresado) && passwords[i].equals(contraseniaIngresada) ) {
                estaAutorizado = true;
                break;
            }
        }

        if(estaAutorizado){
            System.out.println("Bienvenido usuario ".concat(usuarioIngresado));
        }
        else{
            System.out.println("Usuario o contrasenia incorrectos!!");
            System.out.println("Lo siento requiere autentificacion");
        }


    }
}
