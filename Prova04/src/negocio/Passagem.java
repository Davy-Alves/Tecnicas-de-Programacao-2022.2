package negocio;

import persistencia.AgendaDAO;

public class Passagem {

	public Passagem(String data, String h7, String h8, String h9, String h10, String h11, String h12, String h13,
			 String h14, String h15, String h16, String h17, String h18){
	
		AgendaDAO agenda = new AgendaDAO();
		
		Agenda ag = new Agenda();
		ag.setData(data);
		ag.setH7(h7);
		ag.setH8(h8);
		ag.setH9(h9);
		ag.setH10(h10);
		ag.setH11(h11);
		ag.setH12(h12);
		ag.setH13(h13);
		ag.setH14(h14);
		ag.setH15(h15);
		ag.setH16(h16);
		ag.setH17(h17);
		ag.setH18(h18);
			
		agenda.inserir(ag);
	
		
	}
}
