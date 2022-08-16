import java.util.Scanner;

public class TicTacToe {

    // empate e overflow devem soconfugruados 


    public static char[][] matrix = {{'.','.','.'},{'.','.','.'},{'.','.','.'}};

    public static void imprimirTabuleiro(){

        System.out.println("  0 1 2");

        int i = 1;
        for(char[] linha: TicTacToe.matrix){
            System.out.print(i==1? "0 ": i==2? "1 ": "2 ");
            for(char coluna: linha){
            System.out.print(coluna);
            System.out.print(' ');
            }
            System.out.println();
            i++;
        }
    }

    public static boolean conferirLinha(int escolhaLinha,  char c){

        Integer pontuacao = 0; 

        for(int j = 0; j< 3; j++){
            if(TicTacToe.matrix[escolhaLinha][j] != c)
                continue;
            else
                pontuacao++;
            }

        if(pontuacao == 3){
            return true;
        }
        else
            return false;
    }

    public static boolean conferirColuna(int escolhaColuna, char c){

        int pontuacao = 0;
        for(int k = 0; k< 3; k++){
            if(TicTacToe.matrix[k][escolhaColuna] != c)
                continue;
            else
                pontuacao++;
            }
            

        if(pontuacao == 3){
            return true;
        }
        else
            return false;
    }

    public static boolean conferirDiagonal(char c){
        if(TicTacToe.matrix[1][1]!= c)
            return false;
        else if((TicTacToe.matrix[0][0]== c && TicTacToe.matrix[2][2]== c) || (TicTacToe.matrix[0][2]== c && TicTacToe.matrix[2][0]== c) )
            return true;
        else
            return false;

    }

    public static void jogador1Ganhou(){
        imprimirTabuleiro();
        System.out.println("Jogador 1 ganhou a partida");
    }

    public static void jogador2Ganhou(){
        imprimirTabuleiro();
        System.out.println("Jogador 2 ganhou a partida");
    }

    public static void ticTacToe(){
        Scanner leitura = new Scanner(System.in);
        Integer escolhaLinha = 0;
        Integer escolhaColuna = 0;
        int i;

        for(i = 0;  i < 9 ; i++){

            //Jogada do primeiro player 
            if(i%2 ==0){
                try {
                    imprimirTabuleiro();
                    System.out.println("Jogador 1, escolha sua linha :)");
                    escolhaLinha = leitura.nextInt();

                    System.out.println("Jogador 1, escolha sua coluna :)");
                    escolhaColuna = leitura.nextInt();
               
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println("Jogada não permitida");
                    i--;
                    
                }
                

                if(!(escolhaColuna > 2 || escolhaLinha > 2) && (TicTacToe.matrix[escolhaLinha][escolhaColuna] == '.') ){
                    TicTacToe.matrix[escolhaLinha][escolhaColuna] = 'X';
                    if(conferirLinha(escolhaLinha, 'X') || conferirColuna(escolhaColuna, 'X') || conferirDiagonal('X')){
                        jogador1Ganhou();
                        break;
                    }
                }
                else{
                    System.out.println("Jogada não permitida");
                    i--;
                }
                
            }
            //Jogada do segundo player 
            else{

                try {
                    imprimirTabuleiro();
                    System.out.println("Jogador 2, escolha sua linha :)");
                    escolhaLinha = leitura.nextInt();

                    System.out.println("Jogador 2, escolha sua coluna :)");
                    escolhaColuna = leitura.nextInt();

                    if(escolhaColuna > 2 || escolhaLinha > 2)
                        throw new Exception();


                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println("Jogada não permitida");
                    i--;
                }
                

                if(!(escolhaColuna > 3 || escolhaLinha > 3) && TicTacToe.matrix[escolhaLinha][escolhaColuna] == '.'){
                    TicTacToe.matrix[escolhaLinha][escolhaColuna] = 'O';
                    if(conferirLinha(escolhaLinha, 'O') || conferirColuna(escolhaColuna, 'O') || conferirDiagonal('O')){
                        jogador2Ganhou();
                        break;
                    }
                }
                else{
                    System.out.println("Jogada não permitida");
                    i--;
                }

            }

            if(i == 8)
              System.out.println("Jogo empatou :|");

        }

        

        leitura.close();

        
      }

    public static void main(String args[]){
       
    ticTacToe();
    
    }

}

