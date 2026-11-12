import java.util.Locale;
import java.util.Scanner;

    public class lista1atv5 {

        static final int  quantidade = 5;
        static final double  percentual_desconto = 0.10;

        static double aplicarDesconto(double preco)
        {
            return preco - (preco * percentual_desconto);
        }

            static void exibirprodutos(int numero , double preco) {
                System.out.printf("Produto %d: R$ %.2f\n", numero, preco);
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in).useLocale(Locale.US);
                
                for (int i = 1; i < quantidade; i++) {
                    System.out.printf("Digite o preço do produto %d: ", i + 1);
                    double preco = sc.nextDouble();
                    double precoComDesconto = aplicarDesconto(preco);
                    exibirprodutos(i + 1, precoComDesconto);
                }

                sc.close();
            }

}   
