import java.util.Arrays;

public class ejercicios20 { 

    public static void main(String[] args) {
        
        // Dos arreglos ordenados
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        
        // Arreglo que contendrá la fusión ordenada
        int[] fusion = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        // Fusionar comparando elementos de ambos arreglos
        while (i < a.length && j < b.length) {
            fusion[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
        }

        // Copiar lo que quede en 'a' si 'b' se termina primero
        while (i < a.length) {
            fusion[k++] = a[i++];
        }

        // Copiar lo que quede en 'b' si 'a' se termina primero
        while (j < b.length) {
            fusion[k++] = b[j++];
        }

        // Imprimir el arreglo fusionado
        System.out.println("Fusionado: " + Arrays.toString(fusion));
    }
}
