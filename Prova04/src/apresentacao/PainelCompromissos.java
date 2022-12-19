package apresentacao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelCompromissos extends JPanel {

	private String data;
	
	public PainelCompromissos(String data) {
		setLayout(new FlowLayout());
		this.data = data;
		
		JLeJTF hora1 = new JLeJTF("07:00h");
		add(hora1);
				
		JLeJTF hora2 = new JLeJTF("08:00h");
		add(hora2);
				
		JLeJTF hora3 = new JLeJTF("09:00h");
		add(hora3);
		
		JLeJTF hora4 = new JLeJTF("10:00h");
		add(hora4);
		
		JLeJTF hora5 = new JLeJTF("11:00h");
		add(hora5);
		
		JLeJTF hora6 = new JLeJTF("12:00h");
		add(hora6);
		
		JLeJTF hora7 = new JLeJTF("13:00h");
		add(hora7);
		
		JLeJTF hora8 = new JLeJTF("14:00h");
		add(hora8);

		JLeJTF hora9 = new JLeJTF("15:00h");
		add(hora9);

		JLeJTF hora10 = new JLeJTF("16:00h");
		add(hora10);

		JLeJTF hora11 = new JLeJTF("17:00h");
		add(hora11);

		JLeJTF hora12 = new JLeJTF("18:00h");
		add(hora12);

		JButton enviar = new JButton();
		enviar.setText("ENVIAR");
		enviar.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		enviar.setPreferredSize(new Dimension(250, 28));
		enviar.addActionListener(new AcaoBotaoCompromissos(data, hora1.getCaixaQueEscreveDentro(),
				hora2.getCaixaQueEscreveDentro(),
				hora3.getCaixaQueEscreveDentro(),
				hora4.getCaixaQueEscreveDentro(),
				hora5.getCaixaQueEscreveDentro(),
				hora6.getCaixaQueEscreveDentro(),
				hora7.getCaixaQueEscreveDentro(),
				hora8.getCaixaQueEscreveDentro(),
				hora9.getCaixaQueEscreveDentro(),
				hora10.getCaixaQueEscreveDentro(),
				hora11.getCaixaQueEscreveDentro(),
				hora12.getCaixaQueEscreveDentro()));
		add(BorderLayout.SOUTH, enviar);
		
	}
	
}
