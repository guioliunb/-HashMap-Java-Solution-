public class Funcionario {

    String nome;
    String chaveAcesso;
    int idade;
    double salario;
    double plr;
    int mesesContribuicao = 0;
    int diasFerias;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setPlr(double plr) {
        this.plr = plr;
    }
    public void setMesesContribuicao(int mesesContribuicao) {
        this.mesesContribuicao = mesesContribuicao;
    }
    public void setDiasFerias(int diasFerias) {
        this.diasFerias = diasFerias;
    }

    public String getNome() {
        return nome;
    }
    public String getChaveAcesso() {
        return chaveAcesso;
    }
    public int getIdade() {
        return idade;
    }
    public double getSalario() {
        return salario;
    }
    public double getPlr() {
        return plr;
    }
    public int getMesesContribuicao() {
        return mesesContribuicao;
    }

    public int getDiasFerias() {
        return diasFerias;
    }

    public void calcularPLR(){
        setPlr(this.getSalario() * 3);
    }

    public void calcularFerias(){
        int ferias = 30;
        setDiasFerias(ferias);
    }

    
}
