public class Combinacao {

    public static void main(String[] args) {
        int [] array = {15,30,100,50,23};

        int entrada  = 3;
        int soma = 0 ;
        int maximo = 0;

        if (entrada > array.length) {
            System.out.println("-1");
            return;
        }

        for(int i=0; i< array.length; i++){
            if(i < entrada ){
                soma += array[i];
            }
            if(i >= entrada){
                soma += array[i];
                soma -= array[i- entrada];

            if (soma >= maximo) maximo = soma;
        }
        
        }   

        System.out.println("O máximo é: " + maximo);
    }
}
