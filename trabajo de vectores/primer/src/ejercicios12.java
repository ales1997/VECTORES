import java.util.Arrays;

public class ejercicios12 {

    public static void main(String[] args) {
        
          // Ejercicio 12: Rotar derecha (función)
        int[] originalRotar = {1, 2, 3, 4};
        int temp = originalRotar[originalRotar.length - 1];
        for (int i = originalRotar.length - 1; i > 0; i--) {
            originalRotar[i] = originalRotar[i - 1];
        }
        originalRotar[0] = temp;
        System.out.println("Rotado: " + Arrays.toString(originalRotar));
    }
}
