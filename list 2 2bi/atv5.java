

import java.util.Scanner;

public class atv5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.println("digite um numero (nao negativo): ");
            numeros[i] = sc.nextInt();
        }

        exibirTabela(numeros);

        sc.close();
    }

    public static String paraBinario(int n){
        if (n == 0) return "0";

        String bin = "";
        while (n > 0){
            bin = (n % 2) + bin;
            n = n / 2;
        }
        return bin;
    }

    public static void exibirTabela(int[] v){
        for (int n : v){
            System.out.println(n + " = " + paraBinario(n));
        }
    }
}