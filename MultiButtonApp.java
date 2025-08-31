import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiButtonApp {
    public static void main(String[] args) {
        // Criação do frame (janela)
        JFrame frame = new JFrame("Exemplo de Aplicação com Botões");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout()); // Define o layout como FlowLayout

        // Criação de botões
        JButton button1 = new JButton("Botão 1");
        JButton button2 = new JButton("Botão 2");
        JButton button3 = new JButton("Botão 3");

        // Adicionando eventos para os botões
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão 1 clicado!");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão 2 clicado!");
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão 3 clicado!");
            }
        });

        // Adicionando os botões ao frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Torna o frame visível
        frame.setVisible(true);
    }
}
