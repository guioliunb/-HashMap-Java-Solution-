import java.util.Scanner;

public class Ordem {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int soma = 0 ;

        entrada.close(); 
        
        if(numero1 > numero2){

            for (int i = numero2; i <= numero1; i++) {

                if(i == numero1){
                    System.out.println(i);
                }else{
                    System.out.print(i+",");               
                }
                    
                soma += i;
            }
        }
        else{

            for (int i = numero1; i <= numero2; i++) {

                if(i == numero2){
                    System.out.println(i);
                    
                }else{
                    System.out.print(i+",");
                }
                    
                soma += i;
            }

        }

        System.out.println("Soma: "+soma);

    }
    
}
