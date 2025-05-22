package services;

public class ArbolNA {
    private NodoNA raiz;

    public ArbolNA(int valorRaiz) {
        this.raiz = new NodoNA(valorRaiz);
    }

    public NodoNA getRaiz() {
        return raiz;
    }

    public int alturaMaxima() {
        return alturaMaximaRecursiva(raiz);
    }

    private int alturaMaximaRecursiva(NodoNA nodo) {
        if (nodo == null) return 0;
        if (nodo.hijos.isEmpty()) return 1;

        int maxAltura = 0;
        for (NodoNA hijo : nodo.hijos) {
            maxAltura = Math.max(maxAltura, alturaMaximaRecursiva(hijo));
        }
        return maxAltura + 1;
    }


}
