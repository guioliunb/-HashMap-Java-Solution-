public class MaiorString {

    //A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z.
    public static void maiorString(String[] sequencia){

        int contador = 1;
        int maior = 1;
        int index = 0;
        String substring = new String();

        for (String palavra : sequencia) {

            for (int i = 0; i < palavra.length()-1; i++) {
                if(palavra.charAt(i+1) >= palavra.charAt(i)){
                    contador++;


                    if(contador > maior){
                        maior = contador;
                        substring = palavra;
                        index = i+1;
                    }
                }
                else{
                    contador = 1;
                }   
            }
            contador = 0;
        }

        System.out.println("Maior sequência crescente: "+maior+ ". Substring: "+ substring.substring(index-maior+1, index+1));
    }
    public static void main(String[] args) {

        String[] listaString = {"acbda", "fasdlkh", "poiwqd", "zxcqwtop", "qfgophl"};

        /* System.out.println(listaString[0].charAt(1) < 'g');
        System.out.println(Character.getNumericValue(listaString[0].charAt(1)) <Character.getNumericValue('g')); */
        maiorString(listaString);
    }
}
