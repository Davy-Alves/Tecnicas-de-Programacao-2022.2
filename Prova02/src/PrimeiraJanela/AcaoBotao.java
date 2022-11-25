package PrimeiraJanela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import SegundaJanela.AreaGol;
import SegundaJanela.Jogo;



public class AcaoBotao implements ActionListener {

	private JTextField caixaDeTexto;
	
	public AcaoBotao(JTextField caixaDeTexto) {
		
		this.caixaDeTexto = caixaDeTexto;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String nome = caixaDeTexto.getText();
		
		new Jogo();
		JOptionPane.showMessageDialog(null,"O nome selecionado foi : " + nome);
	}
	
	

}
