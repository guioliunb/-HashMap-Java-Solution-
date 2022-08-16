import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ChapaMetalica4 {

    private static final double erroInicial = 5.0;
    private static final double media = 0.25;
    private static double ultimaLinha ;
    private static double primeiraLinha ;
    private static double ultimaColuna ;
    private static double primeiraColuna ;
    private static int casaDecimal;


    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        //inicialização do problema
        System.out.println("Digite a dimensão de linha da chapa: ");
        int numeroLinha = entrada.nextInt();
        System.out.println("Digite a dimensão de coluna da chapa: ");
        int numeroColuna = entrada.nextInt();

        System.out.println("Digite a temperatura da primeira coluna (°C): ");
        primeiraColuna = entrada.nextDouble();
        System.out.println("Digite a temperatura da ultima coluna (°C): ");
        ultimaColuna = entrada.nextDouble();
        System.out.println("Digite a temperatura da primeira linha (°C): ");
        primeiraLinha = entrada.nextDouble();
        System.out.println("Digite a temperatura da ultima linha (°C): ");
        ultimaLinha = entrada.nextDouble();

        Double[][] matrizPrincipal = new Double[numeroLinha][numeroColuna];
        Double[][] matrizAuxiliar = new Double[numeroLinha][numeroColuna];
        int iteracao=0;
        Double error = erroInicial;
        ChapaMetalica4.inicializar(matrizPrincipal);
        ChapaMetalica4.inicializar(matrizAuxiliar);
        ChapaMetalica4.temperaturasConstantes(matrizPrincipal);
        ChapaMetalica4.temperaturasConstantes(matrizAuxiliar);


        System.out.println("Entre com o número máximo de iterações: ");
        int maximoIteracao = entrada.nextInt();
        System.out.println("Entre com o número de erro máximo: ");
        double maximoErro = entrada.nextDouble();
        System.out.println("Digite o número de casas decimais: ");
        casaDecimal = entrada.nextInt();
        entrada.close();


        while (error > maximoErro && iteracao < maximoIteracao ) {

            ChapaMetalica4.propagacao(matrizPrincipal, matrizAuxiliar);
            error = ChapaMetalica4.erro(matrizPrincipal, matrizAuxiliar);
            ChapaMetalica4.salvaMatrizAntiga(matrizPrincipal, matrizAuxiliar);

            
            iteracao++;
        }
        
        System.out.println("Número de iterações :"+ iteracao);
    }

    static void inicializar(Double[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                array[i][j] = 0.0;
            }
        }
    }

    static void propagacao(Double[][] matrizPrincipal, Double[][] matrizAuxiliar) {

        System.out.println();

        BigDecimal formato;
        
        for (int j = 1; j < matrizPrincipal[0].length - 1; j++) {
            for (int i = 1; i < matrizPrincipal.length - 1; i++) {
                matrizPrincipal[i][j] = media * 
                (matrizAuxiliar[i-1][j]+ matrizAuxiliar[i][j-1]+matrizAuxiliar[i+1][j]+matrizAuxiliar[i][j+1]);

                formato = new BigDecimal(matrizPrincipal[i][j]).setScale(casaDecimal, RoundingMode.UP);

                System.out.print(" "+formato+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }

    static void temperaturasConstantes(Double[][] matrizPrincipal) {
        
        for (int j = 0; j < matrizPrincipal[0].length; j++) 
            matrizPrincipal[0][j] = primeiraColuna;
        
        for (int j = 0; j < matrizPrincipal[0].length; j++) 
            matrizPrincipal[matrizPrincipal.length-1][j] = ultimaColuna;
        
        for (int i = 0; i < matrizPrincipal.length; i++) 
            matrizPrincipal[i][0] = primeiraLinha;
        
        for (int i = 0; i < matrizPrincipal.length; i++) 
            matrizPrincipal[i][matrizPrincipal[0].length-1] = ultimaLinha;
        
    }

    static void salvaMatrizAntiga(Double[][] matrizPrincipal, Double[][] matrizAuxiliar) {
        for (int j = 0; j < matrizPrincipal[0].length; j++) {
            for (int i = 0; i < matrizPrincipal.length; i++) {
                matrizAuxiliar[i][j] = matrizPrincipal[i][j];
            }
        }
    }

    static double erro(Double[][] matrizPrincipal, Double[][] matrizAuxiliar) {
        Double temp = 0.0;
        for (int j = 0; j < matrizPrincipal[0].length; j++) {
            for (int i = 0; i < matrizPrincipal.length; i++) {
                if (Math.abs(matrizAuxiliar[i][j] - matrizPrincipal[i][j]) > temp)  
                    temp = Math.abs(matrizAuxiliar[i][j] - matrizPrincipal[i][j]);
            }
        }
        return temp;
    }
}
