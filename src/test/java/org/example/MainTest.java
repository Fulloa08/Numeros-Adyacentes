package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testArregloConResultado10() {
        int[] arreglo = {1, -4, 2, 2, 5, -1};
        int resultado = Main.mayorAdyacente(arreglo);
        assertEquals(10, resultado); // 2 * 5 = 10
    }

    @Test
    public void testArregloNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Main.mayorAdyacente(null);
        });
        assertEquals("El arreglo no puede ser null", exception.getMessage());
    }

    @Test
    public void testArregloConUnElemento() {
        int[] arreglo = {5};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Main.mayorAdyacente(arreglo);
        });
        assertEquals("El arreglo debe tener al menos dos elementos", exception.getMessage());
    }

    @Test
    public void testDesbordamientoEntero() {
        int[] arreglo = {Integer.MAX_VALUE, 2};

        assertThrows(IllegalArgumentException.class, () -> {
            Main.mayorAdyacente(arreglo);
        });
    }


    @Test
    public void testArregloValido() {
        int[] arreglo = {3, 6, -2, -5, 7, 3};
        int resultado = Main.mayorAdyacente(arreglo);
        assertEquals(21, resultado); // 7 * 3 = 21 es el mayor producto adyacente
    }

    @Test
    public void testValoresFueraDeRango(){
        int[] arreglo = {3, 1500, -2, -5, 7, 3 };
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{Main.mayorAdyacente(arreglo);});
        assertEquals("Los valores deben estar en el rango de -1000 a 1000", exception.getMessage());
    }

}