import java.util.TreeSet;

public class Main {
    public static void main(String args[]) {
        TreeSet<String> exemplo = new TreeSet<>();

        exemplo.add("Exemplo 1");
        exemplo.add("Teste 2");
        exemplo.add("Demonstrativo 3");

        System.out.println("Arvore atual:");
        System.out.println(exemplo);
        System.out.println();

        System.out.println("Removido elemento funcionou? " + exemplo.remove("Exemplo 1"));

        System.out.println();
        System.out.println("Após remover");
        System.out.println(exemplo);
    }
}
