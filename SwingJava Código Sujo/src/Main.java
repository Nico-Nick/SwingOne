import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        // Criando uma janela, objeto= JFrame
        JFrame janela = new JFrame();

        //Add um texto imutavel
        JLabel labelUsuario = new JLabel("Usuario");
        //Definindo o tamanho da label
        labelUsuario.setBounds(150, 150, 100, 30);

        JLabel labelSenha = new JLabel("Senha");
        //Definindo o tamanho da label
        labelSenha.setBounds(150, 250, 100, 30);

        // Campo de texto editavel / JTextArea -> para texto com quebra de linha
        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(150, 200,130, 30);

        JPasswordField campoSenha= new JPasswordField();
        campoSenha.setBounds(150, 300, 130, 30);

        // Adicionar um Button
        JButton botaoLogar = new JButton("Login");

        // Configurar as dimensoes do botaoLogar
        botaoLogar.setBounds(101, 400, 200, 30);

        // Para executar alguma coisa se meu botaoLogar for clicado, ex: add interface
        botaoLogar.addActionListener(new ActionListener() {
            @Override
            //Metodo que irá gerar um evento após a açao de clicar no botaoLogar
            public void actionPerformed(ActionEvent e) {

                System.out.println("teste teste");

                //Pegando o usuário e senha
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());
                System.out.printf("Usuário: %s%n Senha: %s", usuario, senha);

                //Limpando o campo de usuario e senha após login
                campoUsuario.setText("");
                campoSenha.setText("");
            }
        });

	// add
        // Adicionando o botaoLogar na janela
        janela.add(botaoLogar);

        janela.add(labelUsuario);
        janela.add(labelSenha);
	
        janela.add(campoUsuario);

        janela.add(campoSenha);

        // liberdade para definir o layout manualmente da janela
        janela.setLayout(null);

        // Definir o tamanho da janela (int x, int y, width, int height)
        janela.setBounds(0, 0, 400, 600);

        // Encerrar o programa após apertar no "X" da janela, ".EXIT_ON_CLOSE" é uma constante
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ativar a visibilidade da janela
        janela.setVisible(true);






    }
}