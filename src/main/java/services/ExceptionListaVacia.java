package services;

public class ExceptionListaVacia extends RuntimeException {
    public ExceptionListaVacia() {this("Lista");}
        public ExceptionListaVacia(String  nombre){super(nombre + "esta vacia");
    }
}
