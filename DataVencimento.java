import java.time.*;

public class DataVencimento {

    

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        Double valorTotal = 1500.0;
        int numeroParcelas = 12;

        Double valorParcela  = valorTotal/numeroParcelas;

        System.out.println("O valor das parcelas é: "+valorParcela);
        System.out.println();

        for (int i = 0; i < numeroParcelas; i++) {
            hoje = hoje.plusMonths(1);
            if(hoje.getDayOfWeek()== DayOfWeek.SATURDAY)
               { 
                System.out.println("    OBS: Adiamento de 2 dias - Sábado");
                hoje = hoje.plusDays(2);}
            else if(hoje.getDayOfWeek()== DayOfWeek.SUNDAY){

                System.out.println("    OBS:Adiamento de 1 dias - Domingo");
                hoje  = hoje.plusDays(1);
            }   

            //Saida: Numero da parcela - Data de vencimento - Valor parcela  

            System.out.println("Numero da parcela: "+i+" - Data de vencimento: "+hoje+" - Valor parcela :"+valorParcela);
        }   
    }
}
