import java.util.Arrays;
import java.util.Random;

public class ejercicios04 {

    public static void main(String[] args) {

        // Ejercicio 4: Array aleatorio entre -10 y 10; contar positivos, negativos y ceros
        int[] aleatorio = new int[10];
        int pos = 0, neg = 0, cero = 0;

        Random rand = new Random();

        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = rand.nextInt(21) - 10; // Genera valores entre -10 y 10

            if (aleatorio[i] > 0) {
                pos++;
            } else if (aleatorio[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }

        System.out.println("Array aleatorio: " + Arrays.toString(aleatorio));
        System.out.println("Cantidad de positivos: " + pos);
        System.out.println("Cantidad de negativos: " + neg);
        System.out.println("Cantidad de ceros: " + cero);
    }
}
