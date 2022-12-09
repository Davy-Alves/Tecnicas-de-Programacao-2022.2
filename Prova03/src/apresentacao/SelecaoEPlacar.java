package apresentacao;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SelecaoEPlacar extends JPanel {

	private JTextField selecao;
	private JTextField placar;
	
	public SelecaoEPlacar() {
		setLayout(new FlowLayout());
		
		JLabel textoSelecao = new JLabel();
		textoSelecao.setText("Selecao:");
		textoSelecao.setFont(new Font("arial", Font.BOLD, 15));
		add(textoSelecao);
		
		JTextField caixaQueEscreveDentroSelecao = new JTextField(10);
		selecao = caixaQueEscreveDentroSelecao;
		caixaQueEscreveDentroSelecao.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		add(caixaQueEscreveDentroSelecao);
				
		JLabel textoPlacar = new JLabel();
		textoPlacar.setText("Placar:");
		textoPlacar.setFont(new Font("arial", Font.BOLD, 15));
		add(textoPlacar);
		
		JTextField caixaQueEscreveDentroPlacar = new JTextField(2);
		placar = caixaQueEscreveDentroPlacar;
		caixaQueEscreveDentroPlacar.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		add(caixaQueEscreveDentroPlacar);
	}

	public JTextField getSelecao() {
		return selecao;
	}

	public void setSelecao(JTextField selecao) {
		this.selecao = selecao;
	}

	public JTextField getPlacar() {
		return placar;
	}

	public void setPlacar(JTextField placar) {
		this.placar = placar;
	}
	
}
