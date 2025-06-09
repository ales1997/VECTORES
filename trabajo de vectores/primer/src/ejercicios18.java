import java.util.Arrays;

public class ejercicios18 { 
    public static void main(String[] args) {
        
        // Arreglo original
        int[] datos18 = {1, 2, 3, 4, 5};
        
        // Nuevo arreglo con espacio adicional para insertar el valor
        int[] nuevo18 = new int[6];

        // Copiar los primeros 3 elementos (índices 0 a 2)
        System.arraycopy(datos18, 0, nuevo18, 0, 3);
        
        // Insertar el valor 99 en la posición 3
        nuevo18[3] = 99;
        
        // Copiar el resto de los elementos del arreglo original (desde índice 3 en adelante)
        System.arraycopy(datos18, 3, nuevo18, 4, 2);
        
        // Mostrar el nuevo arreglo
        System.out.println("Insertado: " + Arrays.toString(nuevo18));
    }
}
