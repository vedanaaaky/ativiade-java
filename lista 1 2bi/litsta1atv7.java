import java.util.Locale;
import java.util.Scanner;

public class litsta1atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double[] salarios = new double[5];
        double soma = 0;

        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = sc.nextDouble();
            soma += salarios[i];
        }

        double maior = salarios[0];
        double menor = salarios[0];
        for (double salario : salarios) {
            if (salario > maior) {
                maior = salario;
            }
            if (salario < menor) {
                menor = salario;
            }
        }

        double media = soma / salarios.length;
        int acima = 0;

        for (double salario : salarios) {
            if (salario > media) {
                acima++;
            }
        }

        System.out.printf("Maior salário: R$ %.2f\n", maior);
        System.out.printf("Menor salário: R$ %.2f\n", menor);
        System.out.printf("Média salarial: R$ %.2f\n", media);
        System.out.printf("Quantidade de salários acima da média: %d\n", acima);

        sc.close();
    }
}
