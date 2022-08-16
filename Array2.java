import java.util.Scanner;

class Solucao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String palavra = entrada.nextLine();
        StringBuilder inverso = new StringBuilder(palavra);
        inverso = inverso.reverse();

        System.out.println(inverso);

        entrada.close();
    }
}