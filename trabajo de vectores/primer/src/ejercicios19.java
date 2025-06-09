import java.util.Arrays;

public class ejercicios19 { 
    public static void main(String[] args) {
        
        // Arreglo original
        int[] datos18 = {1, 2, 3, 4, 5};

        // Índice a eliminar
        int posEliminar = 2;

        // Validar que la posición esté dentro del rango
        if (posEliminar < 0 || posEliminar >= datos18.length) {
            System.out.println("Índice fuera de rango.");
            return;
        }

        // Nuevo arreglo con un elemento menos
        int[] redu = new int[datos18.length - 1];

        // Copiar todos los elementos excepto el que se desea eliminar
        for (int i = 0, j = 0; i < datos18.length; i++) {
            if (i != posEliminar) {
                redu[j++] = datos18[i];
            }
        }

        // Mostrar resultado
        System.out.println("Sin el índice " + posEliminar + ": " + Arrays.toString(redu));
    }
}

