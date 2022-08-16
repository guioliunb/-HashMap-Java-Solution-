public class Gerente extends Funcionario {
    
    @Override
    public void calcularPLR(){
        setPlr(this.getSalario() * 4);

    }

    @Override
    public void calcularFerias(){

        int ferias = 40;
        setDiasFerias(ferias);

    }
}
