public class Estagiario extends Funcionario {

    @Override
    public void calcularPLR(){
        setPlr(this.getSalario() * 2);

    }

    @Override
    public void calcularFerias(){

        int ferias = 15;
        setDiasFerias(ferias);

    }
    
}
