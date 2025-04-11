package model;
import services.ExceptionListaVacia;
import services.Pila;

public class PalindromoModel {
    public boolean estoPalindromo(String frase) {
        if (frase == null)  return false;
        if (frase.isEmpty()) return true;

        String limpia = limpiarPalindromo(frase);
        Pila pila = new Pila("PilaPalindromo");

        for (int i = 0; i < limpia.length(); i++) {
            pila.push(limpia.charAt(i));
        }

        for (int i = 0; i < limpia.length(); i++) {
            try {
                char desdePila = (char) pila.pop();
                if (desdePila != limpia.charAt(i)) {
                    return false;
                }
            } catch (ExceptionListaVacia e) {
                e.printStackTrace();
                return false;
            }
        }

        return true;
    }


    // Nos ayuda a limpiar la cade cuando una vocal trae coma, espacios, .;
    private String limpiarPalindromo(String frase) {
        return frase
                .toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace("ü", "u")
                .replaceAll("[\\s.,;]", "");
    }
}
