public class Recursao {

    public static void buscarTerreno(char[][] matrizTerrenos, int linha, int coluna, int linhaInicial, int colunaInicial, boolean[][] visitado) {
        if (linha < 0 || linha == linhaInicial || coluna < 0 || coluna == colunaInicial || visitado[linha][coluna] == true || matrizTerrenos[linha][coluna] == '0') 
            return;

        visitado[linha][coluna] = true;

        //Mesma ordem do for 
        buscarTerreno(matrizTerrenos,linha+1, coluna, linhaInicial, colunaInicial, visitado);
        buscarTerreno(matrizTerrenos,linha, coluna+1, linhaInicial, colunaInicial, visitado);
        buscarTerreno(matrizTerrenos,linha-1, coluna, linhaInicial, colunaInicial, visitado);
        buscarTerreno(matrizTerrenos,linha, coluna-1, linhaInicial, colunaInicial, visitado);
        
    }

    public static int numTerrenos(char [][] matrizTerrenos){

        boolean [][] visitado = new boolean[matrizTerrenos.length][matrizTerrenos[0].length];;
        int numero = 0;
        
        for(int linha = 0 ; linha < matrizTerrenos.length; linha++){
            for(int coluna = 0 ; coluna < matrizTerrenos[0].length; coluna++){
                if(matrizTerrenos[linha][coluna] == '0')
                    visitado[linha][coluna] = true;
                else if(visitado[linha][coluna] == true){
                    continue;
                }else{
                    buscarTerreno(matrizTerrenos, linha, coluna, matrizTerrenos.length, matrizTerrenos[0].length, visitado);
                    numero++;
                    }
                }
            }

            return numero;
        }
    
    
    public static void main(String[] args) {
        char [][] matrizTerrenos = 
        {{'1' ,'0'  ,'1'  ,'0' ,'0','1'}, 
        {'1'  ,'0'  ,'0'  ,'1' ,'1','1'},
        {'1'  ,'1'  ,'1'  ,'0' ,'0','1'}, 
        {'1'  ,'0'  ,'1'  ,'0' ,'0','1'}, 
        {'1'  ,'1'  ,'0'  ,'1' ,'0','1'}};

        int contagem = numTerrenos(matrizTerrenos);

        System.out.println("O número de terrenos é: "+contagem);


    }
}
