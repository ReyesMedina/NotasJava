package ManejoStrings;

public class EjemploStringTestRendimiento {
    public static void main(String[] args) {
        //Haremos un analisis de rendimiento de los procesos de concatenacion
        //Operador (+) vs Concat() vs StringBuilder

        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a);
        /*String builder nos permite anexar elementos con el metodo append
        * una diferencia es que StringBuilder es mutable
        * es necesario crear el string con el metodo toString()
        * es mas eficiente para concatenar grandes cantidades de strings*/
        long tiempoInicial = System.currentTimeMillis();
        for (int i =0; i< 500 ; i++){
            //c.concat(a).concat(b).concat("\n"); // 500 => 2ms
           // c+=a+b+"\n"; // 500 =>18ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms


        }
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Tiempo de demora: " + (tiempoFinal - tiempoInicial));
       // System.out.println("sb.toString() = " + sb.toString());

    }
}
