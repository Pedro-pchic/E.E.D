package services;

public class NodoArbol {
    int valor;
    NodoArbol izquierdo;
    NodoArbol derecho;

    public NodoArbol(int valor) {
        this.valor = valor;
        this.izquierdo =null;
        this.derecho = null;
    }
}
