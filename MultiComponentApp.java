import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiComponentApp implements ActionListener {
    private JFrame frame;
    private JButton button;
    private JCheckBox checkBox;
    private JTextField textField;
    private JLabel label;

    public MultiComponentApp() {
        // Criação do frame (janela)
        frame = new JFrame("Exemplo de Múltiplos Componentes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Criação dos componentes
        button = new JButton("Clique aqui");
        checkBox = new JCheckBox("Opção");
        textField = new JTextField(15);
        label = new JLabel("Digite algo e pressione Enter");

        // Adicionando o ActionListener aos componentes
        button.addActionListener(this);
        checkBox.addActionListener(this);
        textField.addActionListener(this);

        // Adicionando os componentes ao frame
        frame.add(button);
        frame.add(checkBox);
        frame.add(textField);
        frame.add(label);

        // Torna o frame visível
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Verifica qual componente gerou o evento
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(frame, "Você clicou no botão!");
        } else if (e.getSource() == checkBox) {
            if (checkBox.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Checkbox selecionado!");
            } else {
                JOptionPane.showMessageDialog(frame, "Checkbox desmarcado!");
            }
        } else if (e.getSource() == textField) {
            String text = textField.getText();
            label.setText("Você digitou: " + text);
        }
    }

    public static void main(String[] args) {
        // Criação e execução da aplicação
        SwingUtilities.invokeLater(() -> new MultiComponentApp());
    }
}
