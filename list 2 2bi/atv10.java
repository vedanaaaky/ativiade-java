
import java.util.Scanner;

public class atv10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 30: ");
        int quantidade = teclado.nextInt();

        if (quantidade < 1 || quantidade > 30) {
            System.out.println("Quantidade invalida!");
        } else {

            int[] fibonacci = new int[quantidade];

            for (int i = 0; i < quantidade; i++) {

                if (i == 0) {
                    fibonacci[i] = 0;
                } else if (i == 1) {
                    fibonacci[i] = 1;
                } else {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }
            }

            int soma = 0;

            System.out.println("\nSequencia de Fibonacci");

            for (int i = 0; i < quantidade; i++) {
                System.out.print(fibonacci[i] + " ");
                soma = soma + fibonacci[i];
            }

            System.out.println("\nSoma: " + soma);
        }

        teclado.close();
    }
}
