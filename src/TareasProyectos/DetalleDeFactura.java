package TareasProyectos;

import java.util.Scanner;

//Tarea 2
/*La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura,
se requiere desarrollar un programa que reciba datos de la factura utilizando la clase
Scanner de la siguiente manera:
Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el
nombre de la factura con espacios.
Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener
precios con decimales (,).
Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

-Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto),
el impuesto y el monto total neto incluyendo impuesto.
Por ejemplo, el resultado podría ser algo así:
La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y
el monto después de impuesto es de 160.3882
*/
public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca descripcion o nombre de factura: ");
        String descripcionFactura = scanner.nextLine();
        System.out.println("Introduzca el precio del producto 1: ");
        double precioProducto1 = scanner.nextDouble();
        System.out.println("Introduzca el precio del producto 2: ");
        double precioProducto2 = scanner.nextDouble();

        double totalBruto = precioProducto1 + precioProducto2;
        double impuestoFactura = totalBruto * .19;
        double totalFactura = totalBruto + impuestoFactura;

        String detalleFactura= "La factura " + descripcionFactura + " tiene un total bruto de "
                + totalBruto + " con un impuesto de " + impuestoFactura + " y el monto total" +
                " despues de impuesto es de " + totalFactura;

        System.out.println(detalleFactura);

    }
}
