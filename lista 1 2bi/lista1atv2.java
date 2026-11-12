public class lista1atv2 {
    public static void main(String[] args){
        double[] precos = new double[3];
         precos[0] = 12.90;
            precos[1] = 5.50;
          precos[2] = 30.00;

               for (int i = 0; i < precos.length; i++){
                       System.out.printf("produto %d: r$ %.2f\n", i + 1, precos[i]);
        }
    }
}