

import java.util.Locale;
import java.util.Scanner;

public class lista1atv10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite a quantidade de itens: ");
        int n = sc.nextInt();

        if (n < 1){
            System.out.println("quantidade invalida");
            sc.close();
            return;
        }

        double[] precos = new double[n];
        int[] qtds = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("digite o preco do item " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();

            System.out.println("digite a quantidade do item " + (i + 1) + ": ");
            qtds[i] = sc.nextInt();
        }

        double total = 0;
        for (int i = 0; i < n; i++){
            double subtotal = precos[i] * qtds[i];
            total += subtotal;

            System.out.printf("item %d: r$ %.2f\n", i + 1, subtotal);
        }

        System.out.printf("total: r$ %.2f\n", total);

        double desconto = 0;
        if (total > 200){
            desconto = total * 0.05;
        }

        System.out.printf("desconto: r$ %.2f\n", desconto);
        System.out.printf("valor final: r$ %.2f\n", total - desconto);

        sc.close();
    }
}