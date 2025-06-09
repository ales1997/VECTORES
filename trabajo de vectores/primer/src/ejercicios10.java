public class ejercicios10 { 
    public static void main(String[] args) {


        // Ejercicio 10: Función que detecta duplicados
        
        int[] datos = {4, 2, 7, 4, 9};
        boolean duplicado = false;
        for (int i = 0; i < datos.length; i++) {
            for (int j = i + 1; j < datos.length; j++) {
                if (datos[i] == datos[j]) {
                    duplicado = true;
                    break;
                }
            }
        }
        System.out.println("¿Hay duplicados?: " + duplicado);

    }

}
