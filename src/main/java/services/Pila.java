package services;


public class Pila extends Lista {
    private Lista listaPila;
    public Pila(String pilaPalindromo){
        this.listaPila = new Lista();
    }//fin del constructor de gherenciaPila sin argumentos



    //push= apilar
    //agregar objetos a la pila
    public void push(Object elemento) {
        listaPila.insertaAlFrente(elemento);
    }

    //eliminar objeto de la pila
    public Object pop() throws ExceptionListaVacia{
         return listaPila.elimanarDelFrente();
    }

    //determina si la pila esta vacia
    @Override
    public boolean estaVacia(){
        return listaPila.estaVacia();
    }


    public String imprimir(){
       return listaPila.imprimir();
    }


    @Override
    public String toString() {
       return listaPila.toString();
    }


}
