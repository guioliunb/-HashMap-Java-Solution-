import java.util.Scanner;

public class Array4 {

    public static void solucao(){

        int[] numeros = new int[10];
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE , media = 0;
        Scanner entrada = new Scanner(System.in);

        for(int i=0; i< 5; i++){
            numeros[i] = entrada.nextInt();

            if(numeros[i] > maior)
                maior = numeros[i];

            if(numeros[i] < menor)
                menor = numeros[i];

            media += numeros[i];
            
        }

        if(media != 0)
            media /= 5;

        System.out.println("MEDIA: "+ media);
        System.out.println("MAIOR: "+ maior);
        System.out.println("MENOR: "+ menor);

        entrada.close();
    }
    public static void main(String[] args) {
        solucao();
    }
}
