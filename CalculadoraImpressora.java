import java.text.DecimalFormat;

public class CalculadoraImpressora extends CalculadoraSimples{

    public CalculadoraImpressora(CalculadoraSimples calculadoraSimples) {

    }

    @Override
    public Calculadora iniciar(double numero) {
        // TODO Auto-generated method stub
        this.setValor(numero);
        return this;
        
    }

    @Override
    public Calculadora operacao(OperadorType operacao) {
        // TODO Auto-generated method stub
        this.operacao = operacao;
        return this;
        
    }

    @Override
    public Calculadora calcular(double numero) {
        char op = '.';
        double valorAntigo = getValor();

        //definição do caracter de operação 
        if(this.operacao == OperadorType.SOMA){
            somar(numero);
            op = '+';
        } else if(this.operacao == OperadorType.SUBTRACAO){
            subtrair(numero);
            op = '-';
        } else if(this.operacao == OperadorType.MULTIPLICACAO){
            multiplicar(numero);
            op = '*';
        }
        else if(this.operacao == OperadorType.DIVISAO){
            dividir(numero);
            op = '/';
        }


        // conferir se o número double pode ser escrito como inteiro 
        if(valorAntigo % 1 == 0){
            System.out.print(new DecimalFormat("#").format(valorAntigo)+" "+op+" ");
        }else{
            System.out.print(valorAntigo+" "+op+" ");
        }

        if(numero% 1 == 0 ){

            System.out.print(new DecimalFormat("#").format(numero)+" = ");

        }else{
            System.out.print(numero +" = ");
        }

        if(getValor() %1 == 0){
            System.out.println(new DecimalFormat("#").format(getValor()));
        }else{
            System.out.println(getValor());
        }

        
        //System.out.println(new DecimalFormat("#").format(valorAntigo)+" "+op+" "+new DecimalFormat("#").format(numero)+" = "+getValor());
        setValor(getValor());
        return this;
    }

    @Override
    public void concluir(){

        // conferir se o número double pode ser escrito como inteiro 
        // Retorna o último valor armazenado no objeto calculadora

        if(getValor() %1 == 0){
            System.out.println("Resultado final "+new DecimalFormat("#").format(getValor()));
        }else{
            System.out.println("Resultado final "+getValor());
        }
        
        return;
    }


}
