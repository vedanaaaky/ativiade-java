import java.util.Locale;
import java.util.Scanner;

public class lista1atv4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double[] precos = new double[5];
        double total = 0;

           for (int i = 0; i < precos.length; i++){
            System.out.println("digite o preco do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            total += precos[i];
        }

          for (double preco : precos){
            System.out.printf("r$ %.2f\n", preco);
        }

          System.out.printf("total da compra: r$ %.2f\n", total);

                 sc.close();
    }
}