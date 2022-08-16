import java.util.Scanner;

public class Descontos {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int quantidade = 0;
        while(true){

            System.out.println("1 - Inserir novo produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Encerrar compras");

            numero = entrada.nextInt();


            //limpar terminal para melhor interação
            System.out.print("\033[H\033[2J");  
            System.out.flush();  

            if(numero == 1){
                quantidade++;
            }else if(numero == 2){
                quantidade--;
            }
            else{
                break;
            }

            System.out.println("Total de produtos: "+ quantidade);
        }

        entrada.close();

        int desconto  =  0;

        if(quantidade >= 5 && quantidade< 10){
            desconto = 5;
        }
        else if(quantidade >= 10 && quantidade< 15){
            desconto = 8;
        }
        else if (quantidade >= 15){
            desconto = 15;
        }

        System.out.println("O total de desconto é "+ desconto+"%");
    }
    
}
