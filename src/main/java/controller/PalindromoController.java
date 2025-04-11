package controller;
import model.PalindromoModel;
public class PalindromoController {

    public interface PalindromoView {
        void mostrarResultado(String frase, boolean esPalindromo);
    }

    private PalindromoModel model;
    private PalindromoView view;

    public PalindromoController(PalindromoModel model, PalindromoView view) {
        this.model = model;
        this.view = view;
    }

    public void ejecutar(String frase) {
        boolean resultado = model.estoPalindromo(frase);
        view.mostrarResultado(frase, resultado);
    }
}
