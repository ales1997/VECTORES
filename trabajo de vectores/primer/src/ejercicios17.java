import java.util.Random;

public class ejercicios17 {
    public static void main(String[] args) {

        int[] grandes = new int[30];
        Random rand = new Random();
        
        // Llenar el arreglo con números aleatorios del 0 al 99
        for (int i = 0; i < grandes.length; i++) {
            grandes[i] = rand.nextInt(100);
        }

        int sumaPares = 0;
        for (int n : grandes) {
            if (n % 2 == 0) {
                sumaPares += n;
            }
        }

        System.out.println("Suma de pares: " + sumaPares);
    }
}
