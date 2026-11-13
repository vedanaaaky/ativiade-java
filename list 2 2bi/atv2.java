


import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        double[] pesos = new double[4], alturas = new double[4];
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = Entrada.decimal("Peso em kg da pessoa " + (i + 1) + ": ");
            alturas[i] = Entrada.decimal("Altura em metros: ");
            if (pesos[i] <= 0 || alturas[i] <= 0) {
                System.out.println("Peso e altura devem ser positivos.");
                return;
            }
        }
        exibirRelatorio(pesos, alturas);
    }

    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarImc(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25) return "Peso normal";
        if (imc < 30) return "Sobrepeso";
        return "Obesidade";
    }

    public static void exibirRelatorio(double[] pesos, double[] alturas) {
        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);
            System.out.printf(java.util.Locale.forLanguageTag("pt-BR"),
                "Pessoa %d: IMC %.2f - %s%n", i + 1, imc, classificarImc(imc));
        }
    }

    static class Entrada {
        private static final Scanner scanner = new Scanner(System.in);

        public static double decimal(String mensagem) {
            System.out.print(mensagem);
            while (true) {
                try {
                    return Double.parseDouble(scanner.nextLine().replace(',', '.'));
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido. Digite novamente.");
                    System.out.print(mensagem);
                }
            }
        }
    }
}