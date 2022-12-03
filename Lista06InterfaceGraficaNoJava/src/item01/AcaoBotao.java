package item01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoBotao implements ActionListener{

	private Color cor;
	private PainelTrocaDeCor paineltrocadecor;
	
	public AcaoBotao(Color cor, PainelTrocaDeCor paineltrocadecor) {
		this.cor = cor;
		this.paineltrocadecor = paineltrocadecor;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		paineltrocadecor.setBackground(cor);
	
	}
	
}
