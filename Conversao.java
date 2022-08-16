import java.util.HashMap;
import java.util.Map;
public class Conversao {
    public static void main(String[] args) {

        HashMap<String,HashMap<String,Double>> mapa  = inicializacao();
        String entrada = "GBP - USD";
        String tag1, tag2;
        tag1 = entrada.substring(0, 3);
        tag2 = entrada.substring(6, 9);

        System.out.println(mapa.toString());

        HashMap<String,Double> iteracao  = mapa.get(tag1);
        System.out.println(iteracao);
        String itera = new String();

        while (iteracao.containsKey(tag2)) {
            itera = tag1;
        }
    }

    private static HashMap<String,HashMap<String,Double>> inicializacao() {
        String[] conversoes = {"USD - AUD: 1.44", "USD - BRL: 5.15", "BRL - EUR: 0.18", "EUR - GBP: 0.86","USD - EUR: 5.15","USD - FRA: 5.15"};
        String tag1, tag2;
        Double valor = 0.0;
        HashMap<String,Double> mapeamento1 =  new HashMap<String,Double>();
        
        HashMap<String,Double> mapeamento2 =  new HashMap<String,Double>();
        HashMap<String,HashMap<String,Double>> map = new HashMap<String,HashMap<String,Double>>();

        for (int i = 0; i < conversoes.length; i++, mapeamento1 =  new HashMap<String,Double>(), mapeamento2 =  new HashMap<String,Double>()) {
            tag1 = conversoes[i].substring(0, 3);
            tag2 = conversoes[i].substring(6, 9);
            valor = Double.parseDouble( conversoes[i].substring(11, 15));
            mapeamento1.put(tag1, valor);
            mapeamento2.put(tag2, valor);
            
            map.put(tag1, mapeamento2);
            map.put(tag2, mapeamento1);

        }

        return map;
    }
}
