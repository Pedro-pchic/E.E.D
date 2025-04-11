package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class PalindromoModelTest {
    private  PalindromoModel palindromo;
    @Before
    public void setUp() throws Exception {
        palindromo = new PalindromoModel();
    }

    @Test
    public void TestesPalindromo() {
        boolean esperando = true;
        boolean obtenido = palindromo.estoPalindromo("Radar");
        assertEquals(esperando, obtenido);
    }

    @Test
    public void TestesPalindromoConEspacio() {
        boolean esperado = true;
        boolean obtenido = palindromo.estoPalindromo("Acaso hubo búhos acá");
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testNoPalindromo(){
        boolean esperando = false;
        boolean obtenido = palindromo.estoPalindromo("Hola mundo");
        assertEquals(esperando, obtenido);
    }

    @Test
    public void testPalindromoVacio(){
        boolean esperado = true;
        boolean obtenido = palindromo.estoPalindromo("");
        assertEquals(esperado, obtenido);
    }
}