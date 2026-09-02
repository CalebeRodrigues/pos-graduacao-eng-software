import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linguagens = new ArrayList<>();
        String stop = "";

        while (stop != "0") {
            System.out.print("Digite uma linguagem de programação (0 para parar): ");
            String entrada = scanner.next();

            if (entrada.equals("0"))
                stop = "0";
            else
                linguagens.add(entrada);

            System.out.println();
        }

        scanner.close();

        System.out.println("ArrayList: " + linguagens);
        System.out.println();

        String[] arr = new String[linguagens.size()];
        linguagens.toArray(arr);

        System.out.println("Array:");
        for (String valor : arr)
            System.out.print(valor + ", ");

        System.out.println();
    }
}
