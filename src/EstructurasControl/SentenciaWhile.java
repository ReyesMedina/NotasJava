package EstructurasControl;

public class SentenciaWhile {
    //Como usar while
    public static void main(String[] args) {
        //Recordando que el ciclo while es pre prueba
        //Siempre evalua antes de ejecutar
        int i = 0;
        while(i<10){ //Condicion
            //Bloque a ejecutar
            System.out.println("i = " + i);
            i++;//Iterador
        }

        i = 0;
        boolean prueba = true;
        while(prueba){
            if(i==7){
                prueba=false;
            }
            System.out.println("i = " + i);
            i++;
        }
        //Como usar do while
        //A diferencia de while es pos prueba
        //por lo que ejecuta y despues comprueba

        prueba = false;
        do{
            System.out.println("Se ejecuta al menos una vez");
            //prueba = true;

        }while(prueba);

        //Otro ejemplo
        prueba = true;
        i = 0;
        do{
            if(i==10){
                prueba=false;
            }
            System.out.println("i = " + i);
            i++;
        }while(prueba);


    }
}
