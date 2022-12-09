package apresentacao;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import negocio.Bolao;

public class FrameCadastro extends JFrame {
	
	public FrameCadastro() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(350, 250);
		setLocationRelativeTo(null);
		Organizador();
		setVisible(true);
	}

	public void Organizador() {
		setLayout(new BorderLayout());

		JLabel texto = new JLabel();
		texto.setText("       Informacoes do participante do Bolao");
		texto.setFont(new Font("arial", Font.BOLD, 15));
		add(BorderLayout.NORTH, texto);
		
		PainelCadastro painelcadastro = new PainelCadastro();
		add(BorderLayout.CENTER, painelcadastro);
		
		

	}

}
