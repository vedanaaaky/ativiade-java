


import java.util.Scanner;

public class atv9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] bases = new int[5];

        System.out.print("Digite o expoente: ");
        int expoente = teclado.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a base " + (i + 1) + ": ");
            bases[i] = teclado.nextInt();
        }

        System.out.println("\nResultado das Potencias");

        for (int i = 0; i < 5; i++) {

            long resultado = 1;

            for (int contador = 0; contador < expoente; contador++) {
                resultado = resultado * bases[i];
            }

            System.out.println(bases[i] + "^" + expoente + " = " + resultado);
        }

        teclado.close();
    }
}
