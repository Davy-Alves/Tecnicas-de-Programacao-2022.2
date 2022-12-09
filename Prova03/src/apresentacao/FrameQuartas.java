package apresentacao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameQuartas extends JFrame {

	public FrameQuartas() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(850, 300);
		setLocationRelativeTo(null);
		Organizador();
		setVisible(true);
	}
	
	public void Organizador() {
		setLayout(new BorderLayout());

		JLabel texto = new JLabel();
		texto.setText("                                              "
				+ "                          "
				+ "                  Quartas de Final");
		texto.setFont(new Font("arial", Font.BOLD, 15));
		add(BorderLayout.NORTH, texto);
		
		PainelQuartas painelquartas = new PainelQuartas();
		add(BorderLayout.CENTER, painelquartas);
		
		
		

	}
}