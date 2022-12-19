package apresentacao;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JLeJTF extends JPanel {

	private JTextField caixaQueEscreveDentro = new JTextField(10);

	public JLeJTF(String horario) {
		setLayout(new FlowLayout());
		
		JLabel textoHorario = new JLabel();
		textoHorario.setText(horario);
		textoHorario.setFont(new Font("arial", Font.BOLD, 15));
		add(textoHorario);
		
		caixaQueEscreveDentro.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		add(caixaQueEscreveDentro);
				
	}

	public JTextField getCaixaQueEscreveDentro() {
		return caixaQueEscreveDentro;
	}

	public void setCaixaQueEscreveDentro(JTextField caixaQueEscreveDentro) {
		this.caixaQueEscreveDentro = caixaQueEscreveDentro;
	}

}
