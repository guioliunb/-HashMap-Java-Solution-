import java.math.BigDecimal;

class B extends Investimento{}


public class Investimento {

    public static void printInteresForUser(
    String userName,
    BigDecimal balance,
    double interesRate) {

    //Saída esperada o resultado deve ser: "O João irá receber R$ 125"
    //ou seja 0 casas decimais

    balance = BigDecimal.valueOf(balance.doubleValue()*interesRate/100);
    System.out.printf( "O João irá receber R$ "+ balance.setScale(0,BigDecimal.ROUND_HALF_DOWN)) ;
    
    }

    public static void main(String[] args) {

        // userName: String
        // balance - Recebe balance = 1000 padrão então não pode ser BigDecimal
        // Valor de investimento pode ser decimal: double
        // interestRate - utiliza casa decimal padrão: double 
        printInteresForUser("João", BigDecimal.valueOf(1000), 12.5);
        
    }
    
}
