package view;
import model.PalindromoModel;
import controller.PalindromoController;
import javax.swing.*;
import java.awt.*;
public class PalindromoView extends JFrame {
    private JTextField inputFrase;
    private JButton btnVerificar;
    private JLabel lblResultado;

    public PalindromoView() {
        setTitle("Verificador de Palíndromos");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        inputFrase = new JTextField();
        btnVerificar = new JButton("Verificar");
        lblResultado = new JLabel("Ingresa una frase y presiona verificar.");
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);

        btnVerificar.addActionListener(e -> verificarPalindromo());

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.add(inputFrase, BorderLayout.NORTH);
        panel.add(btnVerificar, BorderLayout.CENTER);
        panel.add(lblResultado, BorderLayout.SOUTH);

        add(panel);
    }

    private void verificarPalindromo() {
        String frase = inputFrase.getText();
        PalindromoModel modelo = new PalindromoModel();
        PalindromoController controlador = new PalindromoController(modelo, (f, r) -> {
            String resultado = r ? "✅ Sí, es un palíndromo" : "❌ No es un palíndromo";
            lblResultado.setText("<html><b>Frase:</b> " + f + "<br><b>Resultado:</b> " + resultado + "</html>");
        });

        controlador.ejecutar(frase);
    }
}
