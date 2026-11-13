
import java.util.Scanner;

public class atv7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] nomes = new String[4];

        for (int pessoa = 0; pessoa < 4; pessoa++) {
            System.out.print("Digite o nome completo do aluno " + (pessoa + 1) + ": ");
            nomes[pessoa] = teclado.nextLine().trim();
        }

        System.out.println("\nLista de Chamada");

        for (int pessoa = 0; pessoa < 4; pessoa++) {

            String[] partesNome = nomes[pessoa].split("\\s+");
            String iniciais = "";

            for (int parte = 0; parte < partesNome.length; parte++) {
                iniciais += partesNome[parte].toUpperCase().charAt(0) + ".";
            }

            System.out.println((pessoa + 1) + ". " + nomes[pessoa] + " (" + iniciais + ")");
        }

        teclado.close();
    }
}
