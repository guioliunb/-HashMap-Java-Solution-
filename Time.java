import java.util.List;

public class Time {
    String nome;
    List<Jogador> elenco;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Jogador> getElenco() {
        return elenco;
    }
    public void setElenco(List<Jogador> elenco) {
        this.elenco = elenco;
    }
    public Time(String nome, List<Jogador> elenco) {
        this.nome = nome;
        this.elenco = elenco;
    }

    
}
