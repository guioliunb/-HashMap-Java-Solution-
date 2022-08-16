import java.util.Scanner;

public class Array7 {

    public static void solucao(){

        
        String[] nomes = new String[5];
        int[] indices = new int[5];
        int contador = 0;
        float altura;
        float peso;
        
        Scanner entrada = new Scanner(System.in);

        for(int i=0; i< 5; i++){
            nomes[i] = entrada.nextLine();
            altura = entrada.nextFloat();
            peso = entrada.nextFloat();
            //capturar /n e nao gerar sobra para proxima leitura 
            entrada.nextLine();
            
            if( !(18.5 <= (peso/(altura*altura)) && (peso/(altura*altura)) <= 25) ){
                indices[contador] = i;
                contador++;
            }
        }

        for(int j = 0; j < contador; j++){
            System.out.println(nomes[indices[j]]+ " esta fora do peso.");
        }

        entrada.close();
    }
    public static void main(String[] args) {
        solucao();
    }
}
