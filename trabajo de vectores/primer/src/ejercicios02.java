import java.util.Arrays;

public class ejercicios02 {
 public static void main(String[] args) {


    // Ejercicio 2: Guardar los primeros 20 números pares en un array
        int[] pares = new int[20];
        for (int i = 0; i < pares.length; i++) {
            pares[i] = i * 2;
        }
        System.out.println("Primeros 20 números pares:");
        System.out.println(Arrays.toString(pares));

 }
}
