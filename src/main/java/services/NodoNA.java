package services;

import java.util.ArrayList;
import java.util.List;

public class NodoNA {
    int valor;
    List<NodoNA> hijos;

    public NodoNA(int valor) {
        this.valor = valor;
        this.hijos = new ArrayList<>();
    }

    public void agregarHijo(NodoNA hijo){
        this.hijos.add(hijo);
    }


}
