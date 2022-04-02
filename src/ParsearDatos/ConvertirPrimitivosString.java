package ParsearDatos;
//Ahora lo haremos viceversa
//Veremos como convertir datos primitivos como float,double,int,long,boolean a cadena
public class ConvertirPrimitivosString {
    public static void main(String[] args) {
        //En esta caso existen 2 formas

        int variableInt=123;
        System.out.println("variableInt = " + variableInt);
        //Usando el envolvente del dato primitivo
        String variableStr = Integer.toString(variableInt);
        System.out.println("variableStr = " + variableStr);
        //Usando valueof de la clase string
        String variableStr2 = String.valueOf(variableInt);
        System.out.println("variableStr2 = " + variableStr2);

        //Podemos replicar lo mismo usando la clase envolvente acorde al dato primitivo que queremos convertir
        float variableFloat=123.32f;
        System.out.println("variableFloat = " + variableFloat);
        //Usando el envolvente del dato primitivo
        String variableStr3 = Float.toString(variableFloat);
        System.out.println("variableStr3 = " + variableStr3);
        //Usando valueof de la clase string
        String variableStr4 = String.valueOf(variableFloat);
        System.out.println("variableStr4 = " + variableStr4);





    }
}
