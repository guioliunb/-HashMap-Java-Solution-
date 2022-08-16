import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.function.Consumer;
import java.util.function.Supplier;

/*     interface A{
        //public static FINAL
        int TAMANHO = 5;

        //public abstract
        void autentica(String mensagem);
        } 
        
        package, import, tipos + comentarios
        
        int -> 0
        char/string -> 0 unicode
        boolean false

        valores padrões e conversão por carcteres
        int x = 15 (literal) (int)
        double d = 10.2 (ponto natural é double)
        long l = 13l
        float f = 13.1f (normalmente seria doubls) 

        int octal = 0123 (0 ate 7)
        int hexadecimal = 0x123 ou 0X12_F3 (0 ate F ou 0 ate 15)
        int binary = 0b101
        double exp = 10.5E2 (notacao cientifica elevado a 10^2)
        float exp = 7.2E3f = 7200
        long minhaConta = 7_123_324_342l

        casting tem possivel perca de precisao 

        int $ricão
        boolean _ricao$bonito

         pré-incrementos/decrementos, depois multiplicação/divisão/mod, passando para soma/subtração, depois os shifts (<<, >>, >>>) e, por último, os pós-incrementos/decrementos.

        varargs
        - Deve ser o último argumento;
        - Todos serão definidos como o mesmo tipo.

        Sabendo que numeros é um array, não poderemos simplesmente escrever int[] ao invés de int..., pois um varargs é um array, mas um array não é um varargs.

        */
        

    /* No caso de variáveis static, não precisamos ter uma referência para usá-las e podemos acessá-las diretamente a partir da classe, desde que respeitando as regras de visibilidade da variável. */

    /*  propriedades para o programa
     java -Dnome=valor main.java */

     /* mudar diretorio das classes
     java -cp . package.file
     or
     java -classpath . package.file 

     byte -> short -> int -> long -> float -> double

     opreacoes unarias atualziam a variavel apos execução 

     Já sabemos que não precisamos chamar o método toString() de um método necessariamente,
      pois há uma variação de System.out.println()
      que recebe somente object e chama este método sem precisarmos escrevê-lo./

      operadores de curto circuito ||; |; &&, &

              
        a += ++a + a + ++a;
        a = a + ++a + a + ++a;
        a = 10 + 11 + 11 + 12;
        a = 44; => System.out.println(a);

        double i2 = 3/2; (divisao inteira)
        double i3 = 3/2.0;

        //inicialização deve ser no mesmo escopo
        int y;
         for(int x = 0; x<10; ++x) {
           y = x % 5 + 2;
         }
         System.out.println(y);

         Não compila, não há comparação entre boolean e números.

         concatenação de dois literais resulta em outro literal 
         concatenacao que possua referencia cria uma nova referencia 
         metodos criam nova referencia nao utilizando os literais
         porem se o metodo nao modifica a string entao o objeto de 
         retorno é igual o parametro

         String h = new String("hello ") // 2 obj
         String h1 = "hello " //0
         String w = "world" // 1 

         System.out.println("hello ") //0
         System.out.println(h1+"world") //1
         System.out.println("Hello " == h1) //1


        Unreachable Code
         return;
        System.out.println("Quando isso será executado?");


        Apesar de não estarmos retornando nada caso o if seja falso, o Java percebe que nesse caso uma exceção será disparada. A regra é: todos os caminhos possíveis devem retornar o tipo indicado pelo método, ou lançar exceção. 
     
     
     Labeled statements

     externo : for(int i = 0; i< 5;i++){
        interno : for(int j =0 ; j < 6 ; j++){
          if(j ==2)
            break interno;
          if(i == 4)
            continue externo;  
        }
      }

      http://www.caelum.com.br
      for(int y = 1; y < 10; y++){
        
      }

      http://www.google.com.br
        for(int x = 1; x < 10; x++){
            break http;
        }

Podemos adicionar ::labels:: (rótulos) a algumas estruturas de código, e usá-los posteriormente para referenciarmos essas estruturas. Para declarar um label usamos um nome qualquer (mesma regra de nomes de variáveis etc.) seguido de dois pontos (:). Por exemplo, podemos dar um label para um for como o que segue:
        
Um rótulo ou label pode estar presente antes de um ::statement:: qualquer, mas só podemos utilizar um ::statement:: de break ou continue caso o rótulo esteja referenciando um for, while ou switch:


//modificadores
synchronized - lock da instância;
native - não cai nesta prova. Permite a implementação do método em código nativo (JNI);
strictfp - não cai nesta prova. Ativa o modo de portabilidade matemática para contas de ponto flutuante.

<MODIFICADORES> <TIPO_RETORNO> <NOME> (<PARÂMETROS>) <THROWS_EXCEPTIONS>

parametro nao pode ser modificado dps da chamada
void teste (final int a) {
        a = 10; // não compila
    }

    recorde :for(int i = 0; i < 4; i++) {
        System.out.println("Estou antes do switch");
        mario:
        guilherme: switch(i) {
            case 0:
            case 1:
                System.out.println("Caso " + i);
                for(int j = 0; j < 3; j++) {
                    System.out.println(j);
                    if(j==1) break mario;
                }
            case 2:
                System.out.println("Estou em i = " + i);
                break recorde;
            case 3:
                System.out.println("Cheguei no 3");
                break mario;
            default:
                System.out.println("Estranho...");
                continue recorde;
        } 
        System.out.println("Estou apos o switch");
    }


    // switch case deve receber constantes ou variavel com valor final em case
    // alem disso o return vazio nao é permitudo para classes comr retorno int
    static int x(int l) {
        for(int i=0;i<100;i++) {
            switch(i) {
                case l:
                    System.out.println(l);
                    if(l==i) return;
                case 0:
                    System.out.println(0);
            }
        }
        System.out.println("Fim");
        return -1;
    } -- case tem que ser definido em tempo de compilação 

    O código não compila pois tenta acessar this dentro de um contexto estático.
*/


/**
 * Study
 * 
 *
 */
public class Study {


static <G> void pick(G array) {
    System.out.println(array); 
    }

final String n;
int x = 2;

Study() {
    a();
    n = "aprendendo";
}

void a(){

}

public static void main(String[] args) {
    int[] i = {150, 151};
    i = s(i);

    Supplier<String> st = () -> TimeZone.getDefault().getDisplayName();
    List<String> la = new ArrayList<String>();
    la.stream();

    System.out.println(st.get());

    Consumer<String> ct = System.out::println;
    ct.accept("junin");

}
static int[] s(int[] i) {
    int[] j = {i[0], i[1]};
    i[1]++;
    return j;
}
}

