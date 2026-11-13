public class atv5 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {

                System.out.print("Digite um numero: ");
                matriz[linha][coluna] = Integer.parseInt(IO.readln());
            }
        }

        System.out.println("\nNumeros da diagonal principal:");

        for (int posicao = 0; posicao < 3; posicao++) {
            System.out.print(matriz[posicao][posicao] + " ");
        }

        System.out.println();
    }
}