package apresentacao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import negocio.Passagem;

public class FrameCompromissos extends JFrame {

	private String data;
	
	public FrameCompromissos(String data) {
		this.data = data;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 375);
		setLocationRelativeTo(null);
		Organizador();
		setVisible(true);
	}
	
	public void Organizador() {
		setLayout(new BorderLayout());

		JLabel texto = new JLabel();
		texto.setText("                                   Compromisso data " + data);
		texto.setFont(new Font("arial", Font.BOLD, 15));
		add(BorderLayout.NORTH, texto);
		
		PainelCompromissos painelcompromissos = new PainelCompromissos(data);
		add(BorderLayout.CENTER, painelcompromissos);
		
		

	}
}