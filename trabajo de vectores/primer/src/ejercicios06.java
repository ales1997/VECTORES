import java.util.Arrays;
import java.util.Scanner;

public class ejercicios06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

         // Ejercicio 6: Rotar a la derecha un array
        int[] rotar = new int[5];
        for (int i = 0; i < rotar.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            rotar[i] = sc.nextInt();
        }
        int ultimo = rotar[rotar.length - 1];
        for (int i = rotar.length - 1; i > 0; i--) {
            rotar[i] = rotar[i - 1];
        }
        rotar[0] = ultimo;
        System.out.println("Array rotado: " + Arrays.toString(rotar));



    }

}
