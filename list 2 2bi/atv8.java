

import java.util.Scanner;

public class atv8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();

        String[] palavras = frase.trim().split("\\s+");

        String maior = "";

        System.out.println("\n=== Palavras da frase ===");

        for (int i = 0; i < palavras.length; i++) {

            System.out.println((i + 1) + " - " + palavras[i]);

            if (palavras[i].length() > maior.length()) {
                maior = palavras[i];
            }
        }

        System.out.println("\nTotal de palavras: " + palavras.length);
        System.out.println("Maior palavra: " + maior);

        teclado.close();
    }
}
