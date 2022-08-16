import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Listas{

    public static void main(String[] args) {
        unirListas();
        
    }

    private static void unirListas() {

        //comparator utilizado para leitura e inserção no conjunto com ordem inversa
        Comparator<String> reverso = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                
                //problema aq
                int numero1 = Integer.valueOf(o1);
                int numero2 = Integer.valueOf(o2);
                return Integer.compare(numero2, numero1);
            }
            
        };

       
        //leitura das linhas e inserção para arraylist
        /*Scanner entrada = new Scanner(System.in);
        String numeros = entrada.nextLine(); */
        
        String numeros = "1,2,3,4";
        Set<String> repeticao = new TreeSet<String>(reverso);
        ArrayList<String> lista1 = new ArrayList<String>(Arrays.asList(numeros.split(",")) );
        numeros = "2,5";
        ArrayList<String> lista2 = new ArrayList<String>(Arrays.asList(numeros.split(",")) );

        lista1.addAll(lista2);
        lista1.sort(reverso);
        repeticao.addAll(lista1);
        System.out.println("Saída : "+ repeticao);
    }

}
