import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

    //search iterate
    public static void carrinho() {
        Scanner entrada = new Scanner(System.in);
        String[] carrinhoCompras = new String[5]; 

        for(int i=0;i<5;i++){
            carrinhoCompras[i] = entrada.nextLine();
        }

        System.out.println(Arrays.toString(carrinhoCompras)); 

        entrada.close();
        
    }

    public static void main(String args[]) {
        carrinho();
    }
    
}
