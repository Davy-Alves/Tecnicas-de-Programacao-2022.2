package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Agenda;

public class AcaoBotaoCadastro implements ActionListener{

	private JTextField caixaQueEscreveDentro; 
	private String data;
	private Agenda agenda = new Agenda();
	
	public AcaoBotaoCadastro(JTextField caixaQueEscreveDentro) {
		this.caixaQueEscreveDentro = caixaQueEscreveDentro;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		data = caixaQueEscreveDentro.getText();
		agenda.setData(data);
		new FrameCompromissos(data);
		
	}
	
}
