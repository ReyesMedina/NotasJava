package TareasProyectos;

import java.util.Scanner;

public class MenuSwitchDoWhile {
    //Ejemplo de menu con switch y case
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu \nPor favor introduce una opcion\n1.Agregar" +
                "\n2. Eliminar \n3.Actualizar\n4.Salir");
        int opcionElegida;
        do {
            System.out.println("Introduce la opcion deseada: ");
            opcionElegida= scanner.nextInt();
            switch (opcionElegida){
                case 1:
                    System.out.println("Agregado");
                    break;
                case 2:
                    System.out.println("Eliminado");
                    break;
                case 3:
                    System.out.println("Actualizado");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }


        }while(opcionElegida!=4);
        System.out.println("Salir");
    }
}
