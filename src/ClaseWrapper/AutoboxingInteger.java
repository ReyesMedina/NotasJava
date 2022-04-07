package ClaseWrapper;

public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer[] numeros = {Integer.valueOf(1),2,3,4,5,6,7,8,9,10};

        int suma = 0 ;
        //Boxing forma explicita
        for(Integer i : numeros){
            if(i.intValue()%2==0){
                suma+=i.intValue(); 
            }
           
        }
        System.out.println("suma = " + suma);
        suma = 0;
        //Autoboxing implicita
        for(Integer i : numeros){
            if(i%2==0){
                suma+=i;
            }

        }
        System.out.println("suma = " + suma);
    }
}
