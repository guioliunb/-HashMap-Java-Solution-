import java.util.ArrayList;
import java.util.List;

//solução para fatoração de 2 numeros
// byte >> short? +char >> int>> long>>  float double

class Soma {
        public static int[] somaDois(int[] nums, int alvo) {

        List<Integer> list= new ArrayList<>(nums.length);
        int index = 0;
        int[] soma = new int[2];
        
 
        for (int i: nums) 
            list.add(Integer.valueOf(i));

        for(int j: nums){
            index = list.indexOf(alvo-j);

            if(index != -1){
                
                soma[0] = j;
                soma[1] = list.get(index);
                return soma;
            }
        }

        return soma;
        }

        public static void main(String args[]){
            int[] somas = {2,4,7,8,12};
            int[] soma = new int[2];
            soma = somaDois(somas, 9);

            System.out.println(soma[0]+"+"+soma[1]);
            
            }
    }

    
    

