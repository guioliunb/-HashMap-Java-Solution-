public interface Calculadora  {

    public void somar(double numero);
    public void subtrair(double numero);
    public void multiplicar(double numero);
    public void dividir(double numero);
    public void imprimir();
    public Calculadora iniciar(double numero);
    public void setValor(double numero);
    public double getValor();
    public Calculadora operacao(OperadorType operador);
    public Calculadora calcular(double numero);
    public void concluir();
    

}
