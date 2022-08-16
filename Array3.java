import java.util.Scanner;

public class Array3 {

    public static void paridade(){
        //alocação de memória para não necessidade de ordenação
        int[] numeros = new int[10];
        int numero = 0 ;
        int par, impar;
        Scanner entrada = new Scanner(System.in);

        for(par  = 0, impar = 0 ; par+impar < 5 ;  /* atualização condicional*/ ){
            numero = entrada.nextInt();
            if(numero % 2 == 0){
                numeros[par + 4] = numero;
                par++;
            }
            else{
                numeros[impar] = numero;
                impar++;
            }
        }

        entrada.close();

        int contador = 0;

        System.out.print("IMPARES: ");
        while(impar>0){
            System.out.print(numeros[contador]+ " ");
            impar--;
            contador++;
        }

        System.out.print("PARES: ");
        contador = 0;
        while(par>0){
            System.out.print(numeros[contador + 4] + " ");
            par--;
            contador++;
        }
    }

    public static void main(String[] args) {
        

        int zyx[][]=new int[3][10];
        int[]x=new int[20];
        int[]y=new int[10];
        int[]z=new int[30];
        zyx[0]=x;
        zyx[1]=y;
        zyx[2]=z;
        System.out.println(zyx[2].length);
    }
    
}
