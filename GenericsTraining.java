import java.util.ArrayList;
import java.util.List;
/* 
interface PayloadList<E,P> extends List<E> {
    void setPayload(int index, P val);
    ...
  }
  
  The following parameterizations of PayloadList are subtypes of List<String>:
  
      PayloadList<String,String>
      PayloadList<String,Integer>
      PayloadList<String,Exception>

    List<String> are subtypes of Collection<String>
 */  

interface Pair<K, V>{
    public K getKey();
    public V getValue();
}


interface T { /* ... */ }
interface C { /* ... */ }

class A implements E , T , C{ /* ... */ }


public class GenericsTraining<K , V>{

    private K t;

    public static <j extends Comparable<j>> int countGreaterThan(j[] anArray, j elem) {
        int count = 0;
        for (j e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }

    public boolean compare(K e1){

        
        return false;
    }

    public GenericsTraining createObject(){

        return new GenericsTraining<A, Integer>();

    }

    public void set(){

        System.out.println("SADA");
    }


    public static void main(String[] args) {

        List<Number> numerico = new ArrayList<>();
        List<Integer> inteiro = new ArrayList<>();
        List<Object> object = new ArrayList<>();

        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number>  numList = new ArrayList<>();;  

        List<? super Integer> superInt = new ArrayList<>();
        List<? super Number>  superList = new ArrayList<>();;  

        List<?> list = new ArrayList<>();

        
        superInt = object;
        

    }


    /**
     * @return K return the t
     */
    public K getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(K t) {
        this.t = t;
    }


}
