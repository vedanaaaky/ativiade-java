

import java.util.Scanner;

public class atv4 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número: ");
            numeros[i] = entrada.nextInt();
        }
        exibir(numeros);
        System.out.println("Ordenado antes: " + estaOrdenado(numeros));
        ordenar(numeros);
        exibir(numeros);
        System.out.println("Ordenado depois: " + estaOrdenado(numeros));
    }

    public static void ordenar(int[] v) {
        for (int passada = 0; passada < v.length - 1; passada++) {
            for (int i = 0; i < v.length - 1 - passada; i++) {
                if (v[i] > v[i + 1]) {
                    int auxiliar = v[i]; v[i] = v[i + 1]; v[i + 1] = auxiliar;
                }
            }
        }
    }

    public static boolean estaOrdenado(int[] v) {
        for (int i = 0; i < v.length - 1; i++) if (v[i] > v[i + 1]) return false;
        return true;
    }

    public static void exibir(int[] v) {
        for (int numero : v) System.out.print(numero + " ");
        System.out.println();
    }
}