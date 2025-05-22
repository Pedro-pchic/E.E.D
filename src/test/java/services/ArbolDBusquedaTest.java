package services;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class ArbolDBusquedaTest {
    private ArbolDBusqueda abb;

    @BeforeEach
    public void setUp() {
        abb = new ArbolDBusqueda();
        abb.insertar(50);
        abb.insertar(30);
        abb.insertar(70);
        abb.insertar(20);
        abb.insertar(40);
        abb.insertar(60);
        abb.insertar(80);
    }

    @Test
    public void testBuscarExistente() {
        assertTrue(abb.buscar(30));
        assertTrue(abb.buscar(70));
        assertTrue(abb.buscar(50));
    }

    @Test
    public void testBuscarNoExistente() {
        assertFalse(abb.buscar(90));
        assertFalse(abb.buscar(10));
    }

    @Test
    public void testInOrden() {
        String esperado = "20 30 40 50 60 70 80";
        assertEquals(esperado, abb.inOrden());
    }

    @Test
    public void testInsertarDuplicado() {
        abb.insertar(30);  // duplicado
        String esperado = "20 30 40 50 60 70 80"; // no cambia
        assertEquals(esperado, abb.inOrden());
    }


}