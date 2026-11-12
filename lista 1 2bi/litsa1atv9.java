

import java.util.Scanner;

public class litsa1atv9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] codigos = {101, 205, 310, 420, 550};
        double[] precos = {4.50, 12.00, 7.90, 25.00, 3.20};

        System.out.println("digite o codigo do produto: ");
        var codigo = sc.nextInt();

        boolean achou = false;
        for (int i = 0; i < codigos.length; i++){
            if (codigos[i] == codigo){
                System.out.printf("preco: r$ %.2f\n", precos[i]);
                achou = true;
            }
        }

        if (!achou) System.out.println("produto nao encontrado");

        sc.close();
    }
}