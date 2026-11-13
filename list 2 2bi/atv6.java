import java.util.Scanner;

public class atv6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < 3; i++){
            System.out.println("digite uma frase: ");
            frases[i] = sc.nextLine();
        }

        exibirContagem(frases);

        sc.close();
    }

    public static int contarVogais(String texto){
        texto = texto.toLowerCase();
        int cont = 0;

        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                cont++;
            }
        }
        return cont;
    }

    public static void exibirContagem(String[] frases){
        String maisVogais = frases[0];

        for (String frase : frases){
            System.out.println(frase + " -> " + contarVogais(frase) + " vogais");

            if (contarVogais(frase) > contarVogais(maisVogais)){
                maisVogais = frase;
            }
        }

        System.out.println("frase com mais vogais: " + maisVogais);
    }
}