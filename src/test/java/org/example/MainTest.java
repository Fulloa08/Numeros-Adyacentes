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
        int resultado = Main.mayorAdyacente(arreglo);
        // Este test verifica si hay desbordamiento, no lanza error, pero el resultado es negativo
        assertTrue(resultado < 0, "Se esperaba un desbordamiento de int que cause valor negativo");
    }

    @Test
    public void testArregloValido() {
        int[] arreglo = {3, 6, -2, -5, 7, 3};
        int resultado = Main.mayorAdyacente(arreglo);
        assertEquals(21, resultado); // 7 * 3 = 21 es el mayor producto adyacente
    }

}