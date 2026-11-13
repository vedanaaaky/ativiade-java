public class atv4 {
    public static void main(String[] args) {

        int[][] matriz = new int[2][3];
        int pares = 0;

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {

                System.out.print("Digite um numero: ");
                matriz[linha][coluna] = Integer.parseInt(IO.readln());
            }
        }

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {

                int valor = matriz[linha][coluna];

                if (valor % 2 == 0) {
                    pares = pares + 1;
                }
            }
        }

        System.out.println("\nQuantidade de numeros pares: " + pares);
    }
}