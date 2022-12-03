package item04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class ActionOK implements ActionListener {

	private ArrayList<Integer> arrayDeNumeros;
	private JTextField caixaDeTexto;
	
	public ActionOK(ArrayList<Integer> arrayDeNumeros, JTextField caixaDeTexto) {
		this.arrayDeNumeros = arrayDeNumeros;
		this.caixaDeTexto = caixaDeTexto;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		int valor1 =  Integer.parseInt(caixaDeTexto.getText());

		arrayDeNumeros.add(valor1);
		
		System.out.println(arrayDeNumeros.get(0));
	}

	public ArrayList<Integer> getArrayDeNumeros() {
		return arrayDeNumeros;
	}
	

}
