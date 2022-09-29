package Main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Atendimento {

	private Cliente cliente;
	private Cabeleireiro cabeleireiro;
	private ArrayList<Servico> servico;
	private Calendar data;
	
	public Atendimento(Cliente cliente, Calendar data) {

		this.cliente = cliente;
		this.data = data;
	}

	public Date getData() {
		return data.getTime();
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Cabeleireiro getCabeleireiro() {
		return cabeleireiro;
	}

	public void setCabeleireiro(Cabeleireiro cabeleireiro) {
		this.cabeleireiro = cabeleireiro;
	}

	public ArrayList<Servico> getServico() {
		return servico;
	}

	public void setServico(ArrayList<Servico> servico) {
		this.servico = servico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
