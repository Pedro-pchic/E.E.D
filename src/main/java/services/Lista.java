package services;


import lombok.Data;
import lombok.Setter;

@Data
public class Lista {
    private Nodo ini;
    private Nodo fin;

    @Setter
    private String nombre;

    public Lista(String nombre){
        ini = fin = null;
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Lista (){this("Hola");}

    public boolean estaVacia(){return null == ini; }


    //funcion para insertar adelante
    public void insertaAlFrente(Object d) {
        if (estaVacia()) {
            ini = fin = new Nodo(d);
        } else {
            ini = new Nodo(d, ini);
        }
    }
    //funcion para insertar al final
    public void insertaAlFinal(Object d){
        if(estaVacia())
            ini = fin = new Nodo (d);
        else
            fin = new Nodo(d, fin);
    }
    public Object elimanarDelFrente() throws ExceptionListaVacia{
        if(estaVacia())
            throw new ExceptionListaVacia(nombre); //lanza expecion si la lista esta vacia
        Object delete = ini.data;
       if (ini == fin) {
           ini = fin = null;
       } else {
           ini = ini.sig;
       }
        return delete;
    }

    public Object eliminarDelFinal() throws ExceptionListaVacia {
        if (estaVacia()) {
            throw new ExceptionListaVacia(nombre);
        }

        Object delete = fin.data;

        if (ini == fin) { // Caso de un solo nodo
            ini = fin = null;
        } else {
            Nodo actual = ini;
            while (actual.sig != null && actual.sig != fin) {
                actual = actual.sig;
            }
            actual.sig = null;
            fin = actual; // Actualiza el final correctamente
        }
        return delete;
    }


    public String imprimir () {
        if (estaVacia()) {
            return "La lista está vacía.";
        }

        StringBuilder resultado = new StringBuilder("Lista: ");
        Nodo actual = ini; // Se inicia desde el primer nodo

        while (actual != null) {
                resultado.append(actual.data).append(" -> ");
                actual = actual.sig;
        }

        resultado.append("null"); // Indica el final de la lista

        return resultado.toString();
    }

    @Override
    public String toString() {
        return "Lista{" +
                "ini=" + ini +
                ", fin=" + fin +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}
