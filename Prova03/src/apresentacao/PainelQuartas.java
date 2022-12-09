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

public class PainelQuartas extends JPanel {

	public PainelQuartas() {
		setLayout(new FlowLayout());
		
		SelecaoEPlacar time1 = new SelecaoEPlacar();
		add(time1);
		
		add(new JLabel("X"));
		
		SelecaoEPlacar time2 = new SelecaoEPlacar();
		add(time2);
				
		SelecaoEPlacar time3 = new SelecaoEPlacar();
		add(time3);
		
		add(new JLabel("X"));

		SelecaoEPlacar time4 = new SelecaoEPlacar();
		add(time4);
		
		SelecaoEPlacar time5 = new SelecaoEPlacar();
		add(time5);
		
		add(new JLabel("X"));

		SelecaoEPlacar time6 = new SelecaoEPlacar();
		add(time6);
		
		SelecaoEPlacar time7 = new SelecaoEPlacar();
		add(time7);
		
		add(new JLabel("X"));

		SelecaoEPlacar time8 = new SelecaoEPlacar();
		add(time8);

		JButton enviar = new JButton();
		enviar.setText("ENVIAR");
		enviar.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		enviar.setPreferredSize(new Dimension(250, 28));
		enviar.addActionListener(new AcaoBotaoQuartas(time1.getSelecao(), time1.getPlacar()));
		add(BorderLayout.SOUTH, enviar);
	}
	
}
