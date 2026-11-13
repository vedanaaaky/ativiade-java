

import java.util.Scanner;

public class atv1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] tamanhos = new int[3];

        System.out.println("Desenho de Triangulos");

        for (int contador = 0; contador < 3; contador++) {
            System.out.print("Digite a altura do triangulo " + (contador + 1) + ": ");
            tamanhos[contador] = teclado.nextInt();
        }

        System.out.println("\nTriangulos desenhados:");

        for (int contador = 0; contador < 3; contador++) {
            mostrarTriangulo(tamanhos[contador]);
            System.out.println();
        }

        teclado.close();
    }

    public static void mostrarTriangulo(int altura) {

        for (int linha = 1; linha <= altura; linha++) {

            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
