//solução para fatoração de 2 numeros

class SomaDois {
    public static int[] somaDois(int[] nums, int alvo) {
    int[] soma = new int[2];
    soma[0] = -1;
    soma[1] = -1;
    
    // {2,4,7,8,12};
    for(int i = 0; i < nums.length; i++){

        for(int j=i ; j < nums.length; j++){
            if(nums[j]==(alvo-nums[i])){
                soma[0] = i;
                soma[1] = j;
                return soma;
            }
        }
    }

    return soma;

    }

    public static void main(String args[]){
        int[] somas = {2,4,7,8,12};
        int[] soma = new int[2];
        soma = somaDois(somas, 9);

        System.out.println("{"+soma[0]+", "+soma[1]+"}");
        
        }
}




