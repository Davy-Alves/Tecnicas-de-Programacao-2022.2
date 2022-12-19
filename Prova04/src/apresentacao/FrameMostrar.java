package apresentacao;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;

import negocio.Agenda;
import persistencia.AgendaDAO;

public class FrameMostrar extends JFrame{

	public FrameMostrar() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(400, 400);
		setLocationRelativeTo(null);
		Organizador();
		setVisible(true);
	}

	public void Organizador() {
			setLayout(new FlowLayout());
		
		AgendaDAO agenda = new AgendaDAO();

		for (Agenda a : agenda.listar()) {
			add(new JLabel("[Data: " + a.getData())); 
			add(new JLabel("7:00h: " + a.getH7()));
			add(new JLabel("8:00h: " + a.getH8()));
			add(new JLabel("9:00h: " + a.getH9()));
			add(new JLabel("10:00h: " + a.getH10()));
			add(new JLabel("11:00h: " + a.getH11()));
			add(new JLabel("12:00h: " + a.getH12()));
			add(new JLabel("13:00h: " + a.getH13()));
			add(new JLabel("14:00h: " + a.getH14()));
			add(new JLabel("15:00h: " + a.getH15()));
			add(new JLabel("16:00h: " + a.getH16()));
			add(new JLabel("17:00h: " + a.getH17()));
			add(new JLabel("18:00h: " + a.getH18() + "]\n"));
		}
	

	}

}
