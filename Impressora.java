public class Impressora {
    
    public static void main(String[] args) { 

        //chamada de métodos segundo exemplo do desafio
        Calculadora calculadora = new CalculadoraImpressora( new CalculadoraSimples());
        calculadora.iniciar(5.5).operacao(OperadorType.SUBTRACAO)
        .calcular(2).operacao(OperadorType.SOMA).calcular(10.3456).
        iniciar(20).operacao(OperadorType.DIVISAO).calcular(10).
        operacao(OperadorType.MULTIPLICACAO).calcular(3).concluir();;
    }
}
