package services;


public class Pila extends Lista {
    public Pila(){
        super("pila");
    }//fin del constructor de gherenciaPila sin argumentos

   //push= apilar
    //agregar objetos a la pila
    public void push( Object objecto) {
        insertaAlFrente(objecto);
    }

    //eliminar objeto de la pila
    public Object pop() throws ExceptionListaVacia{
        return elimanarDelFrente();
    }

    //determina si la pila esta vacia
    @Override
    public boolean estaVacia(){
        return super.estaVacia();
    }


    public String imprimir(){
        String salida = super.toString();
        System.out.println("salida");
        return salida;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
