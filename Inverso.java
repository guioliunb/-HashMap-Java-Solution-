/* ENTRADA 1 98765
SAIDA 1 56789

Entrada 2 -8674
SAIDA 2 -4768
Os códigos variam de -2^31 a 2^31-1 */

public class Inverso {

    //divisão por 10 para evitar overflow
    static int MAXIMO = Integer.MAX_VALUE/10;
    static int MINIMO = Integer.MIN_VALUE/10;

    public static int inverter(int numero) {

        int divisao = numero;
        int resto = 0;
        int resultado = 0;
        StringBuilder inverso = new StringBuilder();

        if(numero > 0){
        
            while(divisao > 10){
                resto = divisao % 10;
                inverso.append(resto);
                divisao /= 10;
            }
            inverso.append(divisao);
            resultado = Integer.parseInt(inverso.toString());

            return resultado;

        }
        else{

            divisao = -numero;
            while(divisao > 10){
                resto = divisao % 10;
                inverso.append(resto);
                divisao /= 10;
            }
            inverso.append(divisao);
            resultado = Integer.parseInt(inverso.toString());

            return -resultado;

        }
    }

    public static void main(String args[]){
        
        System.out.println(inverter(MAXIMO));
        System.out.println(inverter(MINIMO));

        }
}
