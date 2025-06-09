import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicios03 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
     // Ejercicio 3: Leer 8 números, indicar si es par o impar, mostrar primero los pares
        int[] nums = new int[8];
        List<Integer> paresList = new ArrayList<>();
        List<Integer> imparesList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
            if (nums[i] % 2 == 0) paresList.add(nums[i]);
            else imparesList.add(nums[i]);
        }
        System.out.println("\nPares:");
        for (int n : paresList) System.out.print(n + " ");
        System.out.println("\nImpares:");
        for (int n : imparesList) System.out.print(n + " ");
}
}
