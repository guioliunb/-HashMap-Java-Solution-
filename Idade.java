import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;


class PessoaIdade {
    
    String nome;
    LocalDate nascimento;


    
    public PessoaIdade(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getNascimento() {
        return nascimento;
    }
    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
    
}

public class Idade {

    public static void main(String[] args) {
        
        List<PessoaIdade> lista = new ArrayList<PessoaIdade>();

        
        PessoaIdade roberto = new PessoaIdade("Roberto", LocalDate.of(2021, 9, 8));
        PessoaIdade ricardo = new PessoaIdade("Ricardo", LocalDate.of(2020, 7, 8));
        PessoaIdade robert = new PessoaIdade("Robert", LocalDate.of(1955, 12, 4));
        PessoaIdade marcelina = new PessoaIdade("Marcelina", LocalDate.of(1970, 10, 11));
        PessoaIdade laura = new PessoaIdade("Laura", LocalDate.of(1970, 7, 12));
        PessoaIdade guilherme = new PessoaIdade("Guilherme", LocalDate.of(2022, 8, 15));
        Locale locale = new Locale("pt", "BR");

        lista.add(robert);
        lista.add(roberto);
        lista.add(ricardo);
        lista.add(marcelina);
        lista.add(laura);
        lista.add(guilherme);

        Consumer<PessoaIdade> consumidor = k -> {
            String day = k.nascimento.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
            Period periodo = Period.between(  k.nascimento, LocalDate.now());
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            if(periodo.getYears() < 2)
                System.out.println(k.nome+" - "+k.nascimento.format(formato)+" - "+day+ " - "+ periodo.getYears()+ " ano");
            else
                System.out.println(k.nome+" - "+k.nascimento.format(formato)+" - "+day+ " - "+ periodo.getYears()+ " anos");
        };


        lista.forEach(consumidor);
    }
}
