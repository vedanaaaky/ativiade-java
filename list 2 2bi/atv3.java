

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < 8; i++){
            System.out.println("digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        exibirPrimos(numeros);
        System.out.println("primos encontrados: " + contarPrimos(numeros));

        sc.close();
    }

    public static boolean ehPrimo(int numero){
        if (numero < 2) return false;

        for (int i = 2; i < numero; i++){
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static int contarPrimos(int[] v){
        int cont = 0;
        for (int n : v){
            if (ehPrimo(n)) cont++;
        }
        return cont;
    }

    public static void exibirPrimos(int[] v){
        System.out.println("primos:");
        for (int n : v){
            if (ehPrimo(n)) System.out.println(n);
        }
    }
}