import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String args[]) {
        ArrayList<String> exemplo = new ArrayList<>();
        exemplo.add("Exemplo 1");
        exemplo.add("Teste 2");
        exemplo.add("Objeto 3");

        System.out.println("Conteúdo do ArrayList:");
        System.out.println(exemplo);

        Iterator<String> it = exemplo.iterator();
        String text = it.next(); // capturando o próximo valor do ArrayList
        System.out.println("\nPróximo valor via Iterator");
        System.out.println(text);

        // hasNext() => retorna booleano se existe um próximo elemento no iterator
        System.out.println("\nElementos via hasNext:");
        while (it.hasNext()) {
            it.forEachRemaining((texto) -> System.out.printf(" %s, ", texto));
        }

        System.out.println();
    }
}
