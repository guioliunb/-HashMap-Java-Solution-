

public class SAVE {  
    public static boolean conferir(char[][] terrenos, boolean [][] visitado, int linha, int coluna){

            int line = linha ;
            int column = coluna;
            int contador = 0;
            boolean n,s,l,w;

           n = s =l = w = false;
           n = linha >  0 ? visitado[linha-1][coluna] : false ;
           s = linha < terrenos.length-1 ? visitado[linha+1][coluna] : false ;
           l = coluna > 0 ? visitado[linha][coluna-1] : false ;
           w = coluna < terrenos.length-1 ? visitado[linha][coluna+1] : false ;

           while(coluna < terrenos[0].length && terrenos[linha][coluna] == '1'  && visitado[linha][coluna] == false){
               visitado[linha][coluna] = true;
               coluna++;
               contador++;
              

               if(coluna >= terrenos[0].length)
                   break;
               System.out.println("coluna "+ linha +" "+ coluna);
           }
          
           linha++;

           if(linha == terrenos.length)
               linha--;

           coluna = column; 
           while( linha < terrenos.length && terrenos[linha][coluna] == '1' && visitado[linha][coluna] == false ){

               visitado[linha][coluna] = true;
               linha++;
               contador++;
              
               if(linha >= terrenos.length)
                   break;
               System.out.println("linha "+ linha + " "+ coluna);
           }

          /*{{'1'  ,'0'  ,'0'  ,'0'  ,'1'}, 
           {'1'  ,'0'  ,'0'  ,'0'  ,'1'}, 
           {'1'  ,'0'  ,'0'  ,'0'  ,'1'}, 
           {'1'  ,'1'  ,'1'  ,'1'  ,'1'}}; */

           if(contador > 0){

               //casos gerais 
               if(line > 0){
                   if(terrenos[line-1][column] == '1' && n == true)
                       return false;
               }
               else if(line < terrenos.length-1){
                   if(terrenos[line+1][column] == '1' && s == true)
                       return false;
               }
               else if(column > 0){
                   if(terrenos[line][column-1] == '1' && l == true)
                       return false;
               }
               else if(column < terrenos[0].length-1){
                   if(terrenos[line][column+1] == '1' && w == true )
                       return false;
               }

               return true;
           }
           else
               return false;

   }

   public static int numTerrenos(char[][] terrenos) {

       boolean [][] visitado = new boolean[terrenos.length][terrenos[0].length];
       int contador = 0;
       int linha = 0;
       int coluna = 0;


       for (int i=0; i< terrenos.length; i++) {
           for (int j=0; j< terrenos[0].length; j++) {

               if(terrenos[i][j] == '1' && visitado[i][j] == false){
                   if(conferir(terrenos, visitado, i , j)){

                       System.out.println(i+" "+j);
                       contador++;
                   }
               }
           }
       }
       return contador;

   }
   public static void main(String[] args) {

       char [][] matrizTerrenos = 
       {{'1'  ,'0'  ,'1'  ,'0'  ,'1'}, 
       {'1'  ,'0'  ,'0'  ,'0'  ,'1'}, 
       {'1'  ,'0'  ,'0'  ,'0'  ,'1'}, 
       {'1'  ,'1'  ,'1'  ,'1'  ,'1'}};

       int contagem = numTerrenos(matrizTerrenos);
       System.out.println("Numero de terrenos na matriz: "+contagem);
   }
}




            //int [] = var [linha];
/* 


            while (i++) {

                var.length

                if(i%entrada )

               if(maior > MAIO)
               AMIO = maior

               Sum+= var[i]


               i = 1 - x    i
                1 2 3 4 5 6
                1 0 1 0 1 0
                1 2 0 1 2 0
               var[i - tamanho]
                1 2 3 0 1 2
           }
           % entrada-1
               i+ */