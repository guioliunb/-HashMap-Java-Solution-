import java.util.ArrayList;

public class TerrenoIterativo {  
    

   public static int numTerrenos(char[][] terrenos) {

        int[] deltaLinha = new int[terrenos.length];
        int[] deltaColuna = new int[terrenos[0].length];
        int contador = 0;
        int linha = 0;
        int coluna = 0;

        //inicialização das listas de vizinhos 
        //inicialmente duplicado
        // dps 01 02 igual 02 01
        ArrayList<ArrayList<Integer>> vizinhosLinhas = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> vizinhosColunas = new ArrayList<ArrayList<Integer>>();

        for(int i= 0; i< terrenos.length; i++){
            vizinhosLinhas.add(new ArrayList<Integer>());
        }
        for(int i= 0; i< terrenos[0].length; i++){
            vizinhosColunas.add(new ArrayList<Integer>());
        }

        boolean up,down,left,right;

       for (linha = 0; linha< terrenos.length; linha++) {
           for (coluna = 0; coluna < terrenos[0].length; coluna++) {

            if(terrenos[linha][coluna] == '1'){

                //INICIALIZALÇÃO DAS DIREÇÕES 
                up = down = left = right = false;


/*              {{'1'  ,'0'  ,'1'  ,'0'  ,'1'}, 
                {'1'  ,'0'  ,'1'  ,'0'  ,'1'}, 
                {'1'  ,'0'  ,'0'  ,'0'  ,'1'}, 
                {'1'  ,'1'  ,'1'  ,'1'  ,'1'}}; */
;

                //TODO: duplicacao 
                if(right = coluna < terrenos[0].length-1 ? terrenos[linha][coluna+1] == '1' : false){

                   // if(!vizinhosLinhas.get(linha).contains(coluna+1)){
                        vizinhosLinhas.get(linha).add(coluna);
                    vizinhosLinhas.get(linha).add(coluna+1);
                    //}

                    
                
                } else if(left = coluna == terrenos[0].length ? terrenos[linha][coluna-1] == '1' : false){

                    // if(!vizinhosLinhas.get(linha).contains(coluna-1)){
                         vizinhosLinhas.get(linha).add(coluna);
                         vizinhosLinhas.get(linha).add(coluna-1);
                   //  }
                     
                 }
                 
                 if(down = linha < terrenos.length-1 ? terrenos[linha+1][coluna] == '1': false){

                    //if(!vizinhosColunas.get(coluna).contains(linha+1)){
                        vizinhosColunas.get(coluna).add(linha);
                        vizinhosColunas.get(coluna).add(linha+1);
                    //}

                    

                }else if(up = linha == terrenos.length ? terrenos[linha-1][coluna] == '1' : false){

                   // if(!vizinhosColunas.get(coluna).contains(linha-1)){
                        vizinhosColunas.get(coluna).add(linha);
                        vizinhosColunas.get(coluna).add(linha-1);
                   // }
                    
                    
                }
                
                // Uso do delta @s == 1
                // @s = @x + @y
                /// @if @s == 2 entao 2 deslocamentos logo nao podendo ser vizinho diretamente        
            }

               
            }
           
       }

       int i=0;
       System.out.println("            LINHAS COM LIGACAO");
       for (ArrayList<Integer> arrayList : vizinhosColunas) {
        if(arrayList.size()>0)
            System.out.println("Coluna :"+i+" "+arrayList.toString());

            i++;
       }

       int j = 0 ;
       System.out.println("           COLUNAS COM LIGACAO");
       for (ArrayList<Integer> arrayList2 : vizinhosLinhas) {
        if(arrayList2.size()>0)
            System.out.println("Linha :"+j+" "+arrayList2.toString());

            j++;
       }
       return contador;

   }
   public static void main(String[] args) {

       char [][] matrizTerrenos = 
       {{'1' ,'0'  ,'1'  ,'0' ,'0','1'}, 
       {'1'  ,'0'  ,'1'  ,'1' ,'1','1'},
       {'1'  ,'0'  ,'1'  ,'0' ,'0','1'}, 
       {'1'  ,'0'  ,'1'  ,'0' ,'0','1'}, 
       {'1'  ,'1'  ,'0'  ,'0' ,'1','1'}};


       int contagem = numTerrenos(matrizTerrenos);
       System.out.println("Numero de terrenos na matriz: "+contagem);
   }
}

