package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Bolao;
import negocio.Texte;

public class AcaoBotaoCadastro implements ActionListener{

	private JTextField caixaQueEscreveDentro; 
	private String nome;
	private Bolao bolao = new Bolao();
	
	public AcaoBotaoCadastro(JTextField caixaQueEscreveDentro) {
		this.caixaQueEscreveDentro = caixaQueEscreveDentro;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		nome = caixaQueEscreveDentro.getText();
		bolao.setNome(nome);
		new FrameQuartas();
	}

}
