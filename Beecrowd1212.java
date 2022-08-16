import java.lang.management.PlatformManagedObject;
import java.util.Scanner;

public class Beecrowd1212 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int contador = 0 ;
        int carry = 0;
        String palavra1 = Integer.toString(numero1);
        String palavra2 = Integer.toString(numero2);

        if(palavra1.length()>palavra2.length()){
            for (int i = palavra2.length()-1;i >= 0; i--) {
                if( (Character.getNumericValue(palavra1.charAt(i)) + Character.getNumericValue(palavra2.charAt(i)))  + carry > 10  ){
                    contador++;
                    carry=1;
                    System.out.println(i);
                }
            }
        }else{
            for (int i = palavra1.length()-1;i >= 0; i--) {
                if( (Character.getNumericValue(palavra1.charAt(i)) + Character.getNumericValue(palavra2.charAt(i)))  + carry > 10  ){
                    contador++;
                    carry=1;
                    System.out.println(i);
                }
            }
        }

        entrada.close();

        System.out.println(contador+" carry operation");
            
    }

    
}
