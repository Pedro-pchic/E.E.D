package services;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColaTest  {
    private Cola cola;

    @Before
    public void setUp() throws Exception {
        cola = new Cola();
    }

    @Test
    public void testEstaVacia(){
        boolean esperando = true;
        boolean obtenido = cola.estaVacia();
        assertEquals(esperando, obtenido);
    }
    //agregar una nueva cola
    @Test
    public void testEncola() {
        cola.encola(10);
        String esperado = "Lista{ini=Nodo(data=10, sig=null), fin=Nodo(data=10, sig=null), nombre='cola'}";
        String obtenido = cola.toString();
        assertEquals(esperado, obtenido);
    }
    // eliminar cola
    public void testDescolar() throws ExceptionListaVacia {
        cola.descolar();



    }
    // imprimir cola
    public void testImprimir() {
    }
}