import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ejercicios11 {
 
    public static void main(String[] args) {
        

         // Ejercicio 11: menorElemento para int[], double[] y String[]
        int[] enteros = {5, 1, 9};
        double[] reales = {3.5, 0.2, 9.9};
        String[] palabras = {"casa", "sol", "montaña"};
        System.out.println("Menor int: " + Arrays.stream(enteros).min().getAsInt());
        System.out.println("Menor double: " + Arrays.stream(reales).min().getAsDouble());
        String menorStr = Arrays.stream(palabras).min(Comparator.comparingInt(String::length)).get();
        System.out.println("Cadena más corta: " + menorStr);

    }
}
