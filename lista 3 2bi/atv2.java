public class atv2 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int total = 0;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {

                System.out.print("Digite um numero: ");
                matriz[linha][coluna] = Integer.parseInt(IO.readln());

                total = total + matriz[linha][coluna];
            }
        }

        System.out.println("\nResultado da soma: " + total);
    }
}