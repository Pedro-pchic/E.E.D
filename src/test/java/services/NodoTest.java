package services;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;
public class NodoTest  {

    public Nodo n;

    @Before
    public void setUp() throws Exception{
        n = new Nodo(Optional.of(1), null);
    }

    @Test
    public void tesToString(){
        String esperado = "nodo{data=1, sig=null}";
        String obtenido = n.toString().toLowerCase();
        assertEquals( esperado, obtenido);
    }
}