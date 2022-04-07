package TareasProyectos;

import java.util.Scanner;

public class MultiplicacionNumerosCicloFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int num2 = scanner.nextInt();
        int total = 0;
        if(num1>0 && num2 > 0){
            for(int i=0;i<num1;i++){
                total+=num2;
            }}
         else if(num1<0 && num2<0){
             for(int i=num1;i<0;i++){
                 total += -(num2);
             }

            }
         else{
             if(num1<0){
                 for(int i = 0;i<num2;i++){
                     total+=-(num1);
                 }
                 total=-(total);

             }
             else{
                 for(int i = 0;i<num1;i++){
                     total+=-(num2);
                 }
                 total=-(total);

             }

        }
        System.out.println("total " + total);

    }
}
