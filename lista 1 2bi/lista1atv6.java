import java.util.Locale;
import java.util.Scanner;

public class lista1atv6 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double[] meses = new double[12];

        System.out.println("Digite o valor de cada mês: ");
        double valor = sc.nextDouble();
        System.out.println("Digite o valor do reajuste: ");
        double reajuste = sc.nextDouble();

        for (int i = 0; i < meses.length; i++){
            meses[i] = valor;
            valor += valor * reajuste / 100;
        }
         
        for (int i = 0; i < meses.length; i++){
            System.out.printf("Mês %d: R$ %.2f\n", i + 1, meses[i]);
        }
        sc.close();
} 
}
