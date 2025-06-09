public class ejercicios14 { 

    public static void main(String[] args) {

           // Ejercicio 14: Paridad del array
         int[] arr = {2, 3, 4, 5, 6};
        int cP = 0, cI = 0;
        for (int n : arr) {
            if (n % 2 == 0) cP++;
            else cI++;
        }
        System.out.println("Paridad: " + (cP > cI ? 2 : (cI > cP ? 1 : 0)));

    }

}
