package negocio;

import javax.swing.JTextField;

public class Duelo {

	public Duelo(JTextField timeA) {

		int a = Integer.parseInt(timeA.getText());
		System.out.println(a + 1);
	}
}
