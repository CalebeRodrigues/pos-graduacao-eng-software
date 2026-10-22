import java.util.LinkedList;

public class Main {
    public static void main(String args[]) {
        LinkedList<String> animais = new LinkedList<>();

        animais.add("Cachorro");
        animais.add("Galinha");
        animais.add("Vaca");

        System.out.println(animais);

        animais.add(1, "Lebre");

        System.out.println(animais);
    }
}
