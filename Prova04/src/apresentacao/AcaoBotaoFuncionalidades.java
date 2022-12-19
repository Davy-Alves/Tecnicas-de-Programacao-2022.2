package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AcaoBotaoFuncionalidades implements ActionListener{

	private int numero;
	
	public AcaoBotaoFuncionalidades(int numero) {
		this.numero = numero;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(numero == 1) {
			new FrameCadastro();
		}else if(numero == 2) {
			new FrameMostrar();
		}
	}

}
