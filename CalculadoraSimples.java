public class CalculadoraSimples implements Calculadora {

    public double valor = 0;
    public OperadorType operacao = OperadorType.SOMA; 

    public void somar(double numero){
        setValor(getValor()+numero);
    }
    public void subtrair(double numero){
        setValor(getValor()-numero);
    }
    public void multiplicar(double numero){
        setValor(getValor()*numero);
    }
    public void dividir(double numero){
        setValor(getValor()/numero);
    } 
    public void imprimir(){
        System.out.println(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Calculadora iniciar(double numero) {
        // TODO Auto-generated method stub

        return this;
        
    }

    public Calculadora operacao(OperadorType operador) {
        
        // TODO Auto-generated method stub
        return this;
        
    }

    public Calculadora calcular(double numero) {
        // TODO Auto-generated method stub
        return null;
    }
   
    public void concluir() {
        // TODO Auto-generated method stub
        
    }


}
