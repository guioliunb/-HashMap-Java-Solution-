
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BEECROWD1244{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Comparator stringComparator = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(), o1.length());
            } 
            
        };

        int casos = entrada.nextInt();
        entrada.nextLine();
        ArrayList<ArrayList<String>> strings = new ArrayList<ArrayList<String>>(casos);


        for (int i = 0; i < casos; i++) 
            strings.add(new ArrayList<String>(Arrays.asList(entrada.nextLine().split(" "))) );

        for (int i = 0; i < casos; i++)
            Collections.sort(strings.get(i), stringComparator);

        for (int i = 0; i < casos; i++)
            for (int j = 0; j < strings.get(i).size(); j++) {

                if(j ==  strings.get(i).size()-1)
                    System.out.println(strings.get(i).get(j));
                else
                System.out.print(strings.get(i).get(j)+ " ");

            }
        }

    }

