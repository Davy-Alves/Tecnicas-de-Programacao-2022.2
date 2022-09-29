package Main;

import java.util.Calendar;
import java.util.Date;

public class Agendamento {

	private int id;
	private Calendar data;
	private Cliente cliente;
	private Cabeleireiro cabeleireiro;
	private int hora;
	private int minuto;
	
	public Agendamento(Calendar data, Cliente cliente, Cabeleireiro cabeleireiro) {

		this.data = data;
		this.cliente = cliente;
		this.cabeleireiro = cabeleireiro;
	}

	public Date getData() {
		return data.getTime();
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Cabeleireiro getCabeleireiro() {
		return cabeleireiro;
	}
	
	
}
