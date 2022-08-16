import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Jogador {
    PosicaoCampo posicao;
    String nome;


    public Jogador(String nome, PosicaoCampo posicao) {
        this.posicao = posicao;
        this.nome = nome;
    }


    public PosicaoCampo getPosicao() {
        return posicao;
    }


    public void setPosicao(PosicaoCampo posicao) {
        this.posicao = posicao;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public static void main(String[] args) {
        
        List<Time> times = new ArrayList<>() {{
            add(new Time (
                "Gremio",
                new ArrayList<>() {{
                    add(new Jogador("Gabriel Granco", PosicaoCampo.GOLEIRO));
                    add(new Jogador("Rafinha", PosicaoCampo.LATERAL));
                    add(new Jogador("Bruno Cortez", PosicaoCampo.LATERAL));
                    add(new Jogador("Pedro Geromel", PosicaoCampo.ZAGUEIRO));
                    add(new Jogador("Ruan", PosicaoCampo.ZAGUEIRO));
                    add(new Jogador("Tiago Santos", PosicaoCampo.VOLANTE));
                    add(new Jogador("Lucas Silva", PosicaoCampo.VOLANTE));
                    add(new Jogador("Ferreira", PosicaoCampo.MEIA));
                    add(new Jogador("Jaminton Campaz", PosicaoCampo.MEIA));
                    add(new Jogador("Jhonata Robert", PosicaoCampo.MEIA));
                    add(new Jogador("Diego Souza", PosicaoCampo.ATACANTE));
                }}
            ));
            add(new Time (
                    "Flamengo",
                    new ArrayList<>() {{
                        add(new Jogador("Hugo Souza", PosicaoCampo.GOLEIRO));
                        add(new Jogador("Rodinel", PosicaoCampo.LATERAL));
                        add(new Jogador("Renê", PosicaoCampo.LATERAL));
                        add(new Jogador("Gustavo Henrique", PosicaoCampo.ZAGUEIRO));
                        add(new Jogador("Léo Pereira", PosicaoCampo.ZAGUEIRO));
                        add(new Jogador("Thiago Maia", PosicaoCampo.VOLANTE));
                        add(new Jogador("João Gomes", PosicaoCampo.VOLANTE));
                        add(new Jogador("Kenedy", PosicaoCampo.MEIA));
                        add(new Jogador("Diego", PosicaoCampo.MEIA));
                        add(new Jogador("Vitinho", PosicaoCampo.MEIA));
                        add(new Jogador("Vitor Gabriel", PosicaoCampo.ATACANTE));
                    }}
            ));
        }};

        Consumer<Jogador> consumidor2 = k ->{ 
            if(PosicaoCampo.MEIA.equals(k.posicao)){
                System.out.println("Jogador: "+k.nome+"\nPosicao: "+k.posicao);
            }
        
        };
        Consumer<Time> consumidor = k -> {
            System.out.println("Time: "+k.nome);
            System.out.println();
            k.elenco.stream().forEach(consumidor2);

            System.out.println();
        };
        Predicate<Jogador> verificaPosicao =  g -> PosicaoCampo.MEIA.equals(g.posicao);
        
        times.stream().forEach(consumidor);
        
    }
}
