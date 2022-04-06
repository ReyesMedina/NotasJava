package EstructurasControl;

public class SentenciaSwitchCase {
    //Como usar sentencia switch case
    public static void main(String[] args) {
        int num = 3;
        //Nota switch Solo admite 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum
        switch (num){ //Dato a evaluar

            case 0: //Dato es igual a 0
                System.out.println("El numero es 0");//Sentencia a ejecutar
                break;// Establecer fin de sentencia
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;

            default://En caso de no cumplir con un caso se ejecuta este
                System.out.println("Numero desconocido");



        }
    }
}
