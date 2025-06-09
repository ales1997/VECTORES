import java.util.Scanner;

public class ejercicios09 { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String[] productos = new String[3];
        int[] cantidades = new int[3];
        double[] precios = new double[3];
        double totalFactura = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Producto " + (i + 1) + ": ");
            productos[i] = sc.next();
            System.out.print("Cantidad: ");
            cantidades[i] = sc.nextInt();
            System.out.print("Precio unitario: ");
            precios[i] = sc.nextDouble();
            totalFactura += cantidades[i] * precios[i];
        }
        System.out.println("\nFactura:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s x%d = %.2f\n", productos[i], cantidades[i], cantidades[i] * precios[i]);
        }
        System.out.printf("Total: %.2f\n", totalFactura);
    }

}
