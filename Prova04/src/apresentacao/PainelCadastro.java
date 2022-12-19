package apresentacao;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PainelCadastro extends JPanel {
	
	public  PainelCadastro() {
		setLayout(new FlowLayout());
		
		JLabel texto = new JLabel();
		texto.setText("Data:");
		texto.setFont(new Font("arial", Font.BOLD, 15));
		add(texto);
		
		JTextField caixaQueEscreveDentro = new JTextField(17);
		caixaQueEscreveDentro.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		add(caixaQueEscreveDentro);
		
		JButton enviar = new JButton();
		enviar.setText("ENVIAR");
		enviar.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		enviar.setPreferredSize(new Dimension(250, 28));
		enviar.addActionListener(new AcaoBotaoCadastro(caixaQueEscreveDentro));
		add(enviar);
	}
}
