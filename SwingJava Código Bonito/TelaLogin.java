import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {

    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JButton botaoLogar;

    public TelaLogin() {
        this.setTitle("Tela de Login");
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null); // centraliza na tela

        inicializarComponentes();
        setVisible(true);
    }

    private void inicializarComponentes() {
        JLabel labelUsuario = new JLabel("Usuário");
        labelUsuario.setBounds(150, 150, 100, 30);
        add(labelUsuario);

        campoUsuario = new JTextField();
        campoUsuario.setBounds(150, 200, 130, 30);
        add(campoUsuario);

        JLabel labelSenha = new JLabel("Senha");
        labelSenha.setBounds(150, 250, 100, 30);
        add(labelSenha);

        campoSenha = new JPasswordField();
        campoSenha.setBounds(150, 300, 130, 30);
        add(campoSenha);

        botaoLogar = new JButton("Login");
        botaoLogar.setBounds(100, 400, 200, 30);
        botaoLogar.addActionListener(new LoginListener());
        add(botaoLogar);
    }

    private class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String usuario = campoUsuario.getText();
            String senha = new String(campoSenha.getPassword());

            System.out.printf("Usuário: %s%nSenha: %s%n", usuario, senha);

            campoUsuario.setText("");
            campoSenha.setText("");
        }
    }
}
