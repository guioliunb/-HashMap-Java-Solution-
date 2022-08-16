import java.util.Scanner;

public class Formatacao {

    public static void formatar(){
        Scanner entrada = new Scanner(System.in);
        int dia;
        int mes;
        int ano;


        dia = entrada.nextInt();
        mes = entrada.nextInt();
        ano = entrada.nextInt();

        if( (dia >= 1 && dia <= 30) &&  (mes >= 1 && mes <= 12) && (ano >= 2000  && mes <= 2030 ) ){
            System.out.printf("O dia escolhido é: %d/%d/%d.", dia, mes, ano);
        }
        else{
            System.out.println("Data inválida. Tente novamente.");
        }
    }


    public static void main(String args[]){
        
        formatar();

    }
}
