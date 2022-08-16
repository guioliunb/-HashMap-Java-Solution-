
public class ChapaMetalica {

    private static final double erroMinimo = 1e-7;
    private static final double erroInicial = 5.0;
    private static final double media = 0.25;
    private static final double ultimaLinha = 20.0;
    private static final double primeiraLinha = 20.0;
    private static final double ultimaColuna = -3.0;
    private static final double primeiraColuna = 100.0;

    public static void main(String[] args) throws Exception {
        
        Double[][] matrizPrincipal = new Double[6][5];
        Double[][] matrizAuxiliar = new Double[6][5];
        
        int iteracao=0;
        Double error = erroInicial;


        ChapaMetalica.inicializar(matrizPrincipal);
        ChapaMetalica.inicializar(matrizAuxiliar);
        ChapaMetalica.temperaturasConstantes(matrizPrincipal);
        ChapaMetalica.temperaturasConstantes(matrizAuxiliar);

        while (error >= erroMinimo) {

            ChapaMetalica.propagacao(matrizPrincipal, matrizAuxiliar);
            error = ChapaMetalica.erro(matrizPrincipal, matrizAuxiliar);
            ChapaMetalica.salvaMatrizAntiga(matrizPrincipal, matrizAuxiliar);

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
        
        for (int j = 1; j < matrizPrincipal[0].length - 1; j++) {
            for (int i = 1; i < matrizPrincipal.length - 1; i++) {
                matrizPrincipal[i][j] = media * 
                (matrizAuxiliar[i-1][j]+ matrizAuxiliar[i][j-1]+matrizAuxiliar[i+1][j]+matrizAuxiliar[i][j+1]);

                System.out.print(" "+matrizPrincipal[i][j]+" ");
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
