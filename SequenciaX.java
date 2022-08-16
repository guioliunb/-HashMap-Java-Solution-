public class SequenciaX {

    public static final int valor = 8;

    public static void main(String[] args) {

        //Ocorrência: 7xXx1
        String sequencia = "3xxxts2XXXs7xXxbl2XXXeeexxx5";
        System.out.println("Resultado : "+contagem(sequencia));
    }

    private static boolean contagem(String sequencia) {
        int tamanho = 0;

        for (int i = 0; i < sequencia.length(); i++) {

            if(sequencia.charAt(i) == 'X'|| sequencia.charAt(i) == 'x')
                tamanho++;
            else if(tamanho == 3){
                boolean retorno = Character.getNumericValue(sequencia.charAt(i)) +
                Character.getNumericValue(sequencia.charAt(i - tamanho - 1)) == 8 ? true : false;

                if(retorno)
                    return true;

                tamanho = 0;
            }
            else{
                tamanho = 0;
            }
        }

        return false;
    }
}



