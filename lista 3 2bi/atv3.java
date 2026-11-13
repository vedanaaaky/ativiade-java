public class atv3 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {

                System.out.print("Digite um numero: ");
                matriz[linha][coluna] = Integer.parseInt(IO.readln());
            }
        }

        int maiorValor = matriz[0][0];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {

                int numero = matriz[linha][coluna];

                if (numero > maiorValor) {
                    maiorValor = numero;
                } 
            }
        }

        System.out.println("\nO maior valor digitado foi: " + maiorValor);
    }
}