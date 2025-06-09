import java.util.Arrays;
import java.util.Scanner;

public class ejercicios05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

         // Ejercicio 5: Copiar en otro array invertido
        int[] original = new int[5];
        int[] invertido = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            original[i] = sc.nextInt();
            invertido[4 - i] = original[i];
        }
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Invertido: " + Arrays.toString(invertido));
    }

}
