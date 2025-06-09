import java.util.Scanner;

public class ejercicios08 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("\nIngrese un texto: ");

        String texto = sc.nextLine();
        System.out.print("Letra a contar: ");
        char letra = sc.next().charAt(0);
        int conteo = 0;
        for (char c : texto.toCharArray()) {
            if (c == letra) conteo++;
        }
        System.out.println("La letra '" + letra + "' aparece " + conteo + " veces.");
    }
}
