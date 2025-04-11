package services;


import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilaTest  {

    private Pila pila;

    @Before
     public void setUp() throws Exception{
        pila = new Pila("PilaPalindromo");
    }
    @Test
    public void TestPilaIniciaVacia(){
        boolean esperado = true;
        boolean obtenido = pila.estaVacia();
        assertEquals(esperado, obtenido);
    }
    @Test
    public void testPush() {
        // Verificar que se puede insertar un elemento en la pila
        pila.push("Elemento 1");
        assertEquals("Lista: Elemento 1 -> null", pila.imprimir());


    }

    @Test
    public void testPop() throws ExceptionListaVacia {
        // Primero insertamos elementos
        Object resultado = pila.pop();
        assertEquals("Elemento 3", resultado);

        // Ahora pop elimina el "Elemento 2"
        resultado = pila.pop();
        assertEquals("Elemento 2", resultado);

        // Ahora pop elimina el "Elemento 1"
        resultado = pila.pop();
        assertEquals("Elemento 1", resultado);

        // Cuando la pila está vacía, pop debería lanzar una excepción
        ExceptionListaVacia exception = assertThrows(ExceptionListaVacia.class, () -> {
            pila.pop();
        });

        assertEquals("La lista Mi Pila está vacía.", exception.getMessage());
    }



    @Test
    public void testEstaVacia() {
        // Verificar que la pila esté vacía antes de insertar
        assertTrue(pila.estaVacia(), "La pila debería estar vacía al principio.");

        // Insertamos un elemento y verificamos que la pila no esté vacía
        pila.push("Elemento 1");
        assertFalse(pila.estaVacia(), "La pila no debería estar vacía después de insertar un elemento.");
    }

    @Test
    public void testImprimir() {
        // Verificar la impresión cuando la pila está vacía
        assertEquals("La lista está vacía.", pila.imprimir(), "La pila debería indicar que está vacía.");

        // Insertamos elementos y verificamos la impresión
        pila.push("Elemento 1");
        pila.push("Elemento 2");
        assertEquals("Lista: Elemento 2 -> Elemento 1 -> null", pila.imprimir(), "La pila no se imprimió correctamente después de hacer push.");
    }

    @Test
    public void testPopException() {
        // Verificar que se lance la excepción cuando intentamos hacer pop en una pila vacía
        assertThrows(ExceptionListaVacia.class, () -> {
            pila.pop();
        }, "Se esperaba una excepción al intentar hacer pop en una pila vacía.");
    }



}