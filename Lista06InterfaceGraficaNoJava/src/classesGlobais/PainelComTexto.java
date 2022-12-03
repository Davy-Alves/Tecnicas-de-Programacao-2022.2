package classesGlobais;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelComTexto extends JPanel {

	private JLabel texto;
	private String mensagem;
	
	public PainelComTexto(String mensagem, Color corFundo) {
		texto = new JLabel();
		texto.setFont(new Font("arial", Font.BOLD, 20));
		texto.setText(mensagem);
		setBackground(corFundo);
		add(texto);
		
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public JLabel getTexto() {
		return texto;
	}

	public void setTexto(JLabel texto) {
		this.texto = texto;
	}
	
	
}
