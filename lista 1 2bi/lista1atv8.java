import java.util.Locale;
import java.util.Scanner;

public class lista1atv8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double[] notas = new double[10];

        int aprovados = 0;
        int reprovados = 0;
        int recuperacao = 0;

        for (int i = 0; i < notas.length; i++){
            System.out.printf("Digite a nota %d: ", i + 1);
            notas[i] = sc.nextDouble();

            if (notas[i] >= 7.0) {
                aprovados++;
            } else if (notas[i] >= 5.0) {
                recuperacao++;
            } else {
                reprovados++;
            }

            System.out.printf("A nota %.2f é: %s\n", notas[i], (notas[i] >= 7.0) ? "Aprovado" : (notas[i] >= 5.0) ? "Recuperação" : "Reprovado");
        }

        System.out.printf("Aprovados: %d\nRecuperação: %d\nReprovados: %d\n", aprovados, recuperacao, reprovados);

        sc.close();
    } 


}  