public class Array6{

    //métdo de ordenação dos arrays 
    private static int[] quicksort(int[] arrayConsolidado, int inicio, int fim) {
        
        int esquerda = inicio;
        int direita = fim;
        int troca;
        //escolha do pivo padrao (meio)
        int pivo = arrayConsolidado[(esquerda+direita)/2];
        


        while(esquerda <= direita){
            while(arrayConsolidado[esquerda] < pivo)
                esquerda++;
            
            while(arrayConsolidado[direita] > pivo)
                 direita--;
            

            if(esquerda <= direita){
                troca = arrayConsolidado[esquerda];
                arrayConsolidado[esquerda] = arrayConsolidado[direita];
                arrayConsolidado[direita] = troca;
                esquerda++;
                direita--;
            }
        }

        if(direita > inicio)
            quicksort(arrayConsolidado, inicio, direita);
        if(esquerda < fim)
            quicksort(arrayConsolidado, esquerda, fim);


        return arrayConsolidado;

    }

    //método de merge entre arrays
    // troca de void para
    public static void juntarArrays(int[] array1, int[] array2,
    int[] arrayConsolidado) {

        arrayConsolidado = new int[array1.length + array2.length];
        int maior = 0;

        //preenche o array com o número de passos do maior array

        maior = (array1.length > array2.length) ? array1.length : array2.length;
        
        for(int i = 0; i < maior; i++){
                
            if(i < array1.length)
                arrayConsolidado[i] = array1[i];

            if(i < array2.length)
                arrayConsolidado[i+ array1.length] = array2[i];

        }

        arrayConsolidado = quicksort(arrayConsolidado, 0, arrayConsolidado.length-1);

        System.out.print("Array unico/ordenado: ");

        for (int i : arrayConsolidado) {
            System.out.print(i+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        /* Arrays do exercicio 
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 12, 15}; */

        //arrays de exemplo pessoal
        int[] array1 = {1, 3, 5, 7,4,3,2,1,5,6,7,54,23,12,554,3232,54,23,23};
        int[] array2 = {2, 234334, 23,35, 4, 6, 8, 12, 15,5,6,7,3,2};
    
        //único array auxiliar 
        int[] arrayConsolidado = {};
        juntarArrays(array1, array2, arrayConsolidado);
        
    }
    
}
