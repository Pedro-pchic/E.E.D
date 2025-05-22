package services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ArbolNATest {

    @Test
    public void testAlturaMaxima() {
        // Crear el árbol con raíz 1
        ArbolNA arbol = new ArbolNA(1);
        NodoNA raiz = arbol.getRaiz();

        // Agregar hijos
        NodoNA nodo2 = new NodoNA(2);
        NodoNA nodo3 = new NodoNA(3);
        NodoNA nodo4 = new NodoNA(4);
        raiz.agregarHijo(nodo2);
        raiz.agregarHijo(nodo3);
        raiz.agregarHijo(nodo4);

        // Agregar nietos
        NodoNA nodo5 = new NodoNA(5);
        NodoNA nodo6 = new NodoNA(6);
        nodo2.agregarHijo(nodo5);
        nodo5.agregarHijo(nodo6); // Altura máxima: 4

        int alturaEsperada = 4;
        int alturaCalculada = arbol.alturaMaxima();

        assertEquals(alturaEsperada, alturaCalculada, "La altura máxima del árbol debe ser 4");
    }


}