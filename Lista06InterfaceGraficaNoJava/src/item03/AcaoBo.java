package item03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;





public class AcaoBo implements ActionListener {

	private JTextField caixaDeTexto;
	
	public AcaoBo(JTextField caixaDeTexto) {
		
		this.caixaDeTexto = caixaDeTexto;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String nome = caixaDeTexto.getText();
		
		
		JOptionPane.showMessageDialog(null,"A palavra escrita foi : " + nome);

	}
	
	

}
