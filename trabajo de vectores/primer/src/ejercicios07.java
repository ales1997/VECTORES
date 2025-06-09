import java.util.Scanner;

public class ejercicios07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[6];
        int sumaPos = 0, sumaNeg = 0, cPos = 0, cNeg = 0;
        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
            if (valores[i] > 0) { sumaPos += valores[i]; cPos++; }
            else if (valores[i] < 0) { sumaNeg += valores[i]; cNeg++; }
        }
        System.out.println("Media positivos: " + (cPos > 0 ? (sumaPos / cPos) : 0));
        System.out.println("Media negativos: " + (cNeg > 0 ? (sumaNeg / cNeg) : 0));
    }

}
