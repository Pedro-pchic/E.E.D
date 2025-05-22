package services;

public class ArbolDBusqueda {
    private NodoArbol raiz;

    public ArbolDBusqueda() {
        this.raiz = null;
    }

    public void insertar(int valor){
        raiz =  busqueda(raiz, valor);
    }

    private NodoArbol busqueda(NodoArbol actual, int valor){
        if(actual == null){
            return  new NodoArbol(valor);
        }
        if (valor < actual.valor) {
            actual.izquierdo = busqueda(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = busqueda(actual.derecho, valor);
        }
        // Si el valor ya existe, no se inserta (sin duplicados)
        return actual;
    }
    public boolean buscar(int valor){
        return  busquedaR(raiz, valor);
    }
    public boolean busquedaR(NodoArbol actual, int valor){
        if(actual == null) return  false;
        if (valor == actual.valor) return true;
        return valor < actual.valor
                ? busquedaR(actual.izquierdo, valor)
                : busquedaR(actual.derecho, valor);
    }

    public String inOrden() {
        StringBuilder sb = new StringBuilder();
        inOrdenRecursivo(raiz, sb);
        return sb.toString().trim();
    }

    private void inOrdenRecursivo(NodoArbol nodo, StringBuilder sb) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.izquierdo, sb);
            sb.append(nodo.valor).append(" ");
            inOrdenRecursivo(nodo.derecho, sb);
        }
    }

    public NodoArbol getRaiz() {
        return raiz;
    }



}
