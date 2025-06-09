import java.util.Random;

public class ejercicios16 {
    public static void main(String[] args) {
        
        int[] grandes = new int[30];
        int contP = 0, contI = 0;
        Random rand = new Random(); // Se declara y se instancia el objeto rand

        for (int i = 0; i < 30; i++) {
            grandes[i] = rand.nextInt(100); // Números aleatorios entre 0 y 99
            if (grandes[i] % 2 == 0)
                contP++;
            else
                contI++;
        }

        System.out.println("Cantidad de pares: " + contP);
        System.out.println("Cantidad de impares: " + contI);
    }
}

