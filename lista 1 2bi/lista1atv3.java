import java.util.Locale;
import java.util.Scanner;

public class lista1atv3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double[] notas = new double[4];
        double soma = 0;
  
        for (int i = 0; i < notas.length; i++){
                System.out.printf("Digite a nota %d: ", i + 1);
                notas[i] = sc.nextDouble();
                soma += notas[i];
            }

            double media = soma / notas.length;
            System.out.printf("A média das notas é: %.2f\n", media);   

            if (media >= 7.0) {
                System.out.println("Aprovado");
            } else if (media >= 5.0) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }

            sc.close();
    }

 }