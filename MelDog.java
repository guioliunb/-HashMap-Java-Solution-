import java.util.HashMap;
import java.util.Map;


class Key{
    public int value = 0;
    public boolean visitado = false;

    public Key(int key1, int key2, int linha, int coluna){
        this.value = key1*linha + key2;
    }

    public void setVisitado(boolean visita){
        this.visitado = visita;
    }
    public boolean getVisitado(){
        return this.visitado;
    }

}

class Node {
    int value = Integer.MIN_VALUE;
    Node left = null;
    Node right = null;


    int[][] distancia;
    static Map<Integer, Integer> mapa =  new HashMap<Integer,Integer>();;
    Key key , keyDown, keyRight = null;
    int menor = Integer.MAX_VALUE ;
    int auxiliar ;


    Node(int[][] value){
        //inicializa o tamanho
        this.distancia = new int[value.length][value[0].length];
        
        for (int i = 0; i < value.length  ; i++) {
            for (int j = 0; j < value[0].length ; j++) {

                

                if(j < value[0].length-1 && mapa.containsKey(new Key(i, j + 1, value.length, value[0].length).value )){
                    auxiliar  = mapa.get(keyRight.value);
                }else if(j < value[0].length-1){
                    keyRight = new Key(i, j+1, value.length, value[0].length);
                    mapa.put(keyRight.value, value[i][j+1]);
                }
                    

                
                if(i < value.length-1 && mapa.containsKey(new Key(i + 1, j, value.length, value[0].length).value )){
                    auxiliar  = mapa.get(keyDown.value); 
                }else if(i < value.length-1){
                    keyDown = new Key(i+1, j, value.length, value[0].length);
                    mapa.put(keyDown.value, value[i+1][j]);
                }
            
                
                
            }
        }

        System.out.println(mapa.values());
        
    }

}



public class MelDog {    
     public static void main(String[] args) {


        int [][] caminho = { {4,-3,3},{-12,-8,2}, {15,25,-6}};
        Node root = new Node(caminho);


     }


}
