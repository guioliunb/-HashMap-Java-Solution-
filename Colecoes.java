import java.text.Normalizer;
import java.util.Scanner;

public class Colecoes {

    public static String semAcento(String str) {
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        return nfdNormalizedString.replaceAll("\\p{M}", "");
    }
    public static void main(String... args) {
      String email = new String();
      int opcao=0;

      Scanner entrada = new Scanner(System.in);

      email = "āăąēîïĩíĝġńñšŝśûůŷ estou escrevendo um email";

    laço : while(true)
    {
      System.out.println("Selecione a formatacao desejada\n");

      System.out.println("1 - Formatar tudo em maiúsculo");
      System.out.println("2 - Formatar tudo em minúsculo");
      System.out.println("3 - Formatar em camelCase");
      System.out.println("4 - Remover acentuação");
      System.out.println("5 - Finalizar formatacao");

      opcao = entrada.nextInt();
      StringBuilder auxiliar =  new StringBuilder(email);

      switch (opcao) {
        case 1:
            email = email.toUpperCase();
            System.out.println(email);
            break;
        case 2:
            email = email.toLowerCase();
            System.out.println(email);
            break;
        case 3:
            String[] palavras = email.split(" ");

            auxiliar =  new StringBuilder();
           
            auxiliar.append(palavras[0]);
            for (int i = 1; i < palavras.length; i++) {
                auxiliar.append(Character.toUpperCase(palavras[i].charAt(0))) ;
                auxiliar.append(palavras[i].substring(1, palavras[i].length()));
            }
            
            System.out.println(auxiliar);
            email = auxiliar.toString();

            break;
        case 4:

            
            email = semAcento(email);
            System.out.println(email);
            
            break;
        default:
            break laço;
      }
    }

    entrada.close();

    }
}
