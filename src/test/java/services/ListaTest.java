package services;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListaTest {
    private Lista lista;

    @Before
    public void setUp() throws Exception {
        lista = new Lista();
    }
    @Test
    public void testEstaVacia() {
        boolean esperando = true;
        boolean obtenido = lista.estaVacia();
        assertEquals(esperando, obtenido);
    }
    @Test
    public void testInsertaAlFrenteEnListaVacia() {
        lista.insertaAlFrente(10);
        String esperando = "Lista{ini=Nodo(data=10, sig=null), fin=Nodo(data=10, sig=null), nombre='Hola'}";
        String obtenido = lista.toString();
        assertEquals(esperando, obtenido);
    }
    @Test
    public void testInsertaAlFinalEnListaVacia() {
        lista.insertaAlFinal(40);
        String esperando = "Lista{ini=Nodo(data=40, sig=null), fin=Nodo(data=40, sig=null), nombre='Hola'}";
        String obtenido = lista.toString();
        assertEquals(esperando, obtenido);
    }

    @Test
    public void testElimanarDelFrente() throws ExceptionListaVacia {
        lista.insertaAlFrente(20);
        Object eliminado = lista.elimanarDelFrente();
        String esperado = "Lista{ini=null, fin=null, nombre='Hola'}";
        String obtenido = lista.toString();
        assertEquals(20, eliminado);
        assertEquals(esperado, obtenido);

    }
    @Test
    public void testEliminarDelFinal() throws ExceptionListaVacia {
        lista.insertaAlFrente(30);
        lista.insertaAlFinal(50);
        Object eliminado = lista.eliminarDelFinal();
        String esperado =  "Lista{ini=Nodo(data=30, sig=null), fin=Nodo(data=30, sig=null), nombre='Hola'}";
        String obtenido = lista.toString();

        assertEquals(50, eliminado);
        assertEquals(esperado, obtenido);
    }

}