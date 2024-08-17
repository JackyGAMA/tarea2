import java.util.ArrayList;
import java.util.List;

public class Combinaciones {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        List<String> combinaciones = generarCombinaciones(numeros);

        // Imprimir todas las combinaciones generadas
        for (String combinacion : combinaciones) {
            System.out.println(combinacion);
        }

        // Imprimir el total de combinaciones
        System.out.println("Final: " + combinaciones.size());
    }

    // Método para generar todas las combinaciones posibles
    public static List<String> generarCombinaciones(int[] numeros) {
        // Lista para almacenar las combinaciones
        List<String> combinaciones = new ArrayList<>();

        // Primer bucle for (O(n)): Recorre todos los elementos del arreglo
        for (int i = 0; i < numeros.length; i++) {
            // Segundo bucle for anidado (O(n)): Recorre todos los elementos del arreglo
            for (int j = 0; j < numeros.length; j++) {
                // O(1): Agregar cada combinación a la lista
                combinaciones.add(numeros[i] + " " + numeros[j]);
            }
        }

        // T(n) = O(n) * O(n) + O(1)
        // T(n) = O(n^2) + O(1)
        // T(n) = O(n^2)  (El término dominante es O(n^2), por lo que los otros se omiten)

        return combinaciones;
    }
}

