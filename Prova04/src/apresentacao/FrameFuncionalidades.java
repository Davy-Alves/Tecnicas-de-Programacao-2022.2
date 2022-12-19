package apresentacao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class FrameFuncionalidades extends JFrame{

	public FrameFuncionalidades() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 250);
		setLocationRelativeTo(null);
		Organizador();
		setVisible(true);
	}
	
	public void Organizador() {
		setLayout(new BorderLayout());
				
		JLabel texto = new JLabel();
		texto.setText("                  Agenda de compromissos");
		texto.setFont(new Font("arial", Font.BOLD, 15));
		add(BorderLayout.NORTH, texto);
		
		PainelFuncionalidades painelbotoesfuncionalidades = new PainelFuncionalidades();
		add(BorderLayout.CENTER, painelbotoesfuncionalidades);
	}
}
