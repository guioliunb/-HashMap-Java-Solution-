import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Feriados {

    public static void main(String[] args) {
        
        LocalDate anoAtual = LocalDate.now();
        int ano = anoAtual.getYear();
        LocalDate data1 = LocalDate.of(ano-1, 9, 07);
        LocalDate data2 = LocalDate.of(ano-1, 10, 12);
        LocalDate data3 = LocalDate.of(ano-1, 11, 2);
        LocalDate data4 = LocalDate.of(ano-1, 11, 15);
        LocalDate data5 = LocalDate.of(ano-1, 1, 1);
        

        for (int i = ano-1; i <= ano+1; i++, data1 = data1.plusYears(1),
         data2 = data2.plusYears(1), data3 = data3.plusYears(1),
          data4 = data4.plusYears(1) , data5 = data5.plusYears(1)) {
            System.out.print("#Ano :"+ i+ " ");

            display(data1);
            
            display(data2);
            

            display(data3);

            display(data4);

            display(data5);

           
            System.out.println();
        }

    }

    private static void display(LocalDate data1) {

        Locale locale = new Locale("pt", "BR");
        String dia = "0";
        String mes = "0";

        if(data1.getDayOfMonth() < 10){
            dia = dia + Integer.toString(data1.getDayOfMonth()) ;
        }else
            dia =  Integer.toString(data1.getDayOfMonth()) ;

        if(data1.getMonthValue() < 10){
            mes = mes + Integer.toString(data1.getMonthValue());
        }else
            mes = Integer.toString(data1.getMonthValue()) ;

        if(data1.getDayOfWeek() == DayOfWeek.TUESDAY ||  data1.getDayOfWeek() == DayOfWeek.THURSDAY)
            System.out.print("#"+dia+"/"+mes+" - Dia da semana: "+data1.getDayOfWeek().getDisplayName(TextStyle.FULL, locale)+ " feriado prolongado ");
        else
            System.out.print("#"+dia+"/"+mes+" - Dia da semana: "+data1.getDayOfWeek().getDisplayName(TextStyle.FULL, locale)+ " ");
    }
}