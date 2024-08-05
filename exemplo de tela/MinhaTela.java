import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MinhaTela {
    public static void main(String[] args) {
        // Define as dimensões da janela
        int windowHeight = 700;
        int windowWidth = 700;

        // Cria uma nova janela (frame)
        JFrame frame = new JFrame("Minha Primeira Tela");

        // Define o tamanho da janela
        frame.setSize(windowWidth, windowHeight);

        // Define o comportamento de fechamento da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um painel para adicionar componentes
        JPanel panel = new JPanel();
        
        // Adiciona o painel à janela
        frame.add(panel);
        placeComponents(panel);

        // Torna a janela visível
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        // Define o layout do painel como null
        panel.setLayout(null);

        // Cria um rótulo (label)
        JLabel label = new JLabel("Calcular IMC");
        label.setBounds(150, 10, 80, 25);
        panel.add(label);

        JLabel lAltura = new JLabel("Altura: ");
        lAltura.setBounds(100, 40, 80, 30);
        panel.add(lAltura);

        JTextField tfAltura = new JTextField("");
        tfAltura.setBounds(150, 40, 80, 30);
        panel.add(tfAltura);

        JLabel lPeso = new JLabel("Altura: ");
        lPeso.setBounds(100, 70, 80, 30);
        panel.add(lPeso);

        JTextField tfPeso = new JTextField("");
        tfPeso.setBounds(150, 70, 80, 30);
        panel.add(tfPeso);

        // Cria um botão (button)
        JButton button = new JButton("Calcular");
        button.setBounds(150, 100, 150, 25);
        panel.add(button);
    }
}
