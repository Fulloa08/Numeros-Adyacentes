package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arreglo = {3, 6, -2, -5, 7, 3};
        int maxProducto = mayorAdyacente(arreglo);
        System.out.println("El mayor producto de números adyacentes es: " + maxProducto);
    }

    public static int mayorAdyacente(int[] arreglo) {
        if (arreglo.length < 2) {
            throw new IllegalArgumentException("El arreglo debe tener al menos dos elementos");
        }

        int maxProducto = arreglo[0] * arreglo[1];

        for (int i = 1; i < arreglo.length - 1; i++) {
            int producto = arreglo[i] * arreglo[i + 1];
            if (producto > maxProducto) {
                maxProducto = producto;
            }
        }
        return maxProducto;
    }
}
