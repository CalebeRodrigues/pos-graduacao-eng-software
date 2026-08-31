import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main (String args[]) {
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(3);
        numeros.add(5);

        Iterator<Integer> it = numeros.iterator();

        while(it.hasNext()) {
            it.forEachRemaining((num) -> System.out.println(num));
        }
    }
}