import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1: Leer 5 notas y mostrar las que están por encima o igual a la media
        double[] notas = new double[5];
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        double media = suma / notas.length;

        System.out.printf("\nMedia: %.2f\n", media);
        System.out.println("Notas mayores o iguales a la media:");

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= media) {
                System.out.printf("Nota %d: %.2f\n", (i + 1), notas[i]);
            }
        }

    }
}
