package services;

public class Cola {
    private Lista listaCola;


    public  Cola(){
        this.listaCola = new Lista("cola");
    }

    //agregar un objeto de cola
    public boolean estaVacia(){
        return listaCola.estaVacia();
    }
    //agregar objecto a la cola
    public  void encola(Object object){
        listaCola.insertaAlFrente(object);
    }
    //eliminar objecto
    public void descolar() throws ExceptionListaVacia{
         listaCola.elimanarDelFrente();
    }

    public void imprimir(){
        listaCola.imprimir();
    }

    @Override
    public String toString() {
        return listaCola.toString();
    }


}
