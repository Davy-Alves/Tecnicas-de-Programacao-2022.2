package Main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {

		//CALENDAR
		Calendar calendar = Calendar.getInstance();

		//CLIENTE
		Cliente cliente1 = new Cliente("123.456.789-71");
		cliente1.setId(1);
		cliente1.setNome("Davy Alves");
		
		Cliente cliente2 = new Cliente("234.567.89-72");
		cliente2.setId(2);
		cliente2.setNome("Zezin doce de leite");
		
		Cliente cliente3 = new Cliente("345.678.90-73");
		cliente3.setId(3);
		cliente3.setNome("Bianca Lopes");
		
		//CABELEIREIRO
		Cabeleireiro cabeleireiro1 = new Cabeleireiro("Joao maos de tesoura", "456.789.012-89");
		cabeleireiro1.setId(4);
		
		Cabeleireiro cabeleireiro2 = new Cabeleireiro("Dona Cleide", "567.890.121-90");
		cabeleireiro2.setId(5);
		
		Cabeleireiro cabeleireiro3 = new Cabeleireiro("Joao maos de tesoura", "456.789.011-11");
		cabeleireiro3.setId(6);

		//SERVIÇO 
		ArrayList<Servico> servico = new ArrayList();
		
		Servico servico1 = new Servico();
		servico1.setDescricao("Massagem no corpo");
		servico1.setId(7);
		servico1.setNome("Massagem");
		servico1.setValor(57.99);
		
		Servico servico2 = new Servico();
		servico2.setDescricao("Depilacao no corpo");
		servico2.setId(8);
		servico2.setNome("Depilacao");
		servico2.setValor(100.45);
		
		Servico servico3 = new Servico();
		servico3.setDescricao("Lavagem de cabelo");
		servico3.setId(9);
		servico3.setNome("Lavagem");
		servico3.setValor(88.2);
		
		servico.add(servico1);
		servico.add(servico2);
		servico.add(servico3);

		
		//AGENDAMENTO
		Agendamento agendamento1 = new Agendamento(calendar.getInstance(), cliente1, cabeleireiro1);
		agendamento1.setId(10);
		agendamento1.setHora(10);
		agendamento1.setMinuto(20);
		
		Agendamento agendamento2 = new Agendamento(calendar.getInstance(), cliente2, cabeleireiro2);
		agendamento2.setId(11);
		agendamento2.setHora(11);
		agendamento2.setMinuto(21);
	
		Agendamento agendamento3 = new Agendamento(calendar.getInstance(), cliente3, cabeleireiro3);
		agendamento3.setId(12);
		agendamento3.setHora(2);
		agendamento3.setMinuto(23);
	
		//ATENDIMENTO
		Atendimento atendimento1 = new Atendimento(cliente1, calendar.getInstance());
		atendimento1.setServico(servico);
		atendimento1.setCabeleireiro(cabeleireiro1);

		Atendimento atendimento2 = new Atendimento(cliente2, calendar.getInstance());
		atendimento2.setServico(servico);
		atendimento2.setCabeleireiro(cabeleireiro2);

		Atendimento atendimento3 = new Atendimento(cliente3, calendar.getInstance());
		atendimento3.setServico(servico);
		atendimento3.setCabeleireiro(cabeleireiro3);
	
		//##################################INTERACAO COM O USUARIO###############################################
		String cpf;
		String nome;
		int id;
		String descricao;
		double valor;
		int hora;
		int minuto;
		
		//CLIENTE
		Scanner sc = new Scanner(System.in);
		Scanner scLine = new Scanner(System.in);
		
		System.out.println("Insira o cpf do cliente:");
		cpf = sc.next();
		
		Cliente cliente4 = new Cliente(cpf);
		
		System.out.println("Insira o id do cliente:");
		id = sc.nextInt();
		cliente4.setId(id);
		
		System.out.println("Insira o nome do cliente:");
		nome = scLine.nextLine();
		cliente4.setNome(nome);
		
		System.out.println();
		
		//CABELEIREIRO
		System.out.println("Insira o cpf do cabeleireiro:");
		cpf = sc.next();
		
		System.out.println("Insira o nome do cabeleireiro:");
		nome = scLine.nextLine();
		
		Cabeleireiro cabeleireiro4 = new Cabeleireiro(nome, cpf);
		cabeleireiro4.setId(4);
		
		System.out.println("Insira o id do cabeleireiro:");
		id = sc.nextInt();
		cabeleireiro4.setId(id);
		
		System.out.println();
		
		//SERVIÇO 
		Servico servico4 = new Servico();
		
		System.out.println("Insira a descricao do servico:");
		descricao = scLine.nextLine();
		servico4.setDescricao(descricao);
		
		System.out.println("Insira o id do servico:");
		id = sc.nextInt();
		servico4.setId(id);
		
		System.out.println("Insira o nome do servico");
		nome = scLine.nextLine();
		servico4.setNome(nome);
		
		System.out.println("Insira o valor do servico:");
		valor = sc.nextDouble();
		servico4.setValor(valor);
		
		servico.add(servico4);
		
		System.out.println();
		
		//AGENDAMENTO
		Agendamento agendamento4 = new Agendamento(calendar.getInstance(), cliente4, cabeleireiro4);
		
		System.out.println("Insisra o id do agendamento:");
		id = sc.nextInt();
		agendamento4.setId(id);
		
		System.out.println("Insira a hora:");
		hora = sc.nextInt();
		agendamento4.setHora(hora);
		
		System.out.println("Insira o minuto:");
		minuto = sc.nextInt();
		agendamento4.setMinuto(minuto);
		
		//ATENDIMENTO
		Atendimento atendimento4 = new Atendimento(cliente1, calendar.getInstance());
		atendimento4.setServico(servico);
		atendimento4.setCabeleireiro(cabeleireiro1);
		
		//############################MOSTRAR TODOS OS DADOS CADASTRADOS##########################################
		
		System.out.println();
		System.out.println("Cliente 1:");
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("CPF: " + cliente1.getCpf());
		System.out.println("Id: " + cliente1.getId());
		
		System.out.println();
		System.out.println("Cliente 2:");
		System.out.println("Nome: " + cliente2.getNome());
		System.out.println("CPF: " + cliente2.getCpf());
		System.out.println("Id: " + cliente2.getId());
		
		System.out.println();
		System.out.println("Cliente 3:");
		System.out.println("Nome: " + cliente3.getNome());
		System.out.println("CPF: " + cliente3.getCpf());
		System.out.println("Id: " + cliente3.getId());

		System.out.println();
		System.out.println("Cliente 4:");
		System.out.println("Nome: " + cliente4.getNome());
		System.out.println("CPF: " + cliente4.getCpf());
		System.out.println("Id: " + cliente4.getId());
		
		System.out.println();
		System.out.println("Cabeleireiro 1:");
		System.out.println("Nome: " + cabeleireiro1.getNome());
		System.out.println("CPF: " + cabeleireiro1.getCpf());
		System.out.println("Id: " + cabeleireiro1.getId());
		
		System.out.println();
		System.out.println("Cabeleireiro 2:");
		System.out.println("Nome: " + cabeleireiro2.getNome());
		System.out.println("CPF: " + cabeleireiro2.getCpf());
		System.out.println("Id: " + cabeleireiro2.getId());
		
		System.out.println();
		System.out.println("Cabeleireiro 3:");
		System.out.println("Nome: " + cabeleireiro3.getNome());
		System.out.println("CPF: " + cabeleireiro3.getCpf());
		System.out.println("Id: " + cabeleireiro3.getId());
		
		System.out.println();
		System.out.println("Cabeleireiro 4:");
		System.out.println("Nome: " + cabeleireiro4.getNome());
		System.out.println("CPF: " + cabeleireiro4.getCpf());
		System.out.println("Id: " + cabeleireiro4.getId());

		System.out.println();
		int cont = 1;
		for(Servico s : servico) {
			System.out.println("Servico " + cont + ":\nNome: " + s.getNome() + "\nDescricao: " + s.getDescricao()
			+ "\nId: " + s.getId() + "\nValor: " + s.getValor());
			System.out.println();
			cont++;
		}
		
		System.out.println("Agendamento 1");
		System.out.println("Id: " + agendamento1.getId());
		System.out.println("Data: " + agendamento1.getData());
		System.out.println("Cliente: " + agendamento1.getCliente().getNome());
		System.out.println("Cabeleireiro: " + agendamento1.getCabeleireiro().getNome());
		System.out.println("Hora: " + agendamento1.getHora());
		System.out.println("Minuto: " + agendamento1.getMinuto());
		
		System.out.println();
		System.out.println("Agendamento 2");
		System.out.println("Id: " + agendamento2.getId());
		System.out.println("Data: " + agendamento2.getData());
		System.out.println("Cliente: " + agendamento2.getCliente().getNome());
		System.out.println("Cabeleireiro: " + agendamento2.getCabeleireiro().getNome());
		System.out.println("Hora: " + agendamento2.getHora());
		System.out.println("Minuto: " + agendamento2.getMinuto());
		
		System.out.println();
		System.out.println("Agendamento 3");
		System.out.println("Id: " + agendamento3.getId());
		System.out.println("Data: " + agendamento3.getData());
		System.out.println("Cliente: " + agendamento3.getCliente().getNome());
		System.out.println("Cabeleireiro: " + agendamento3.getCabeleireiro().getNome());
		System.out.println("Hora: " + agendamento3.getHora());
		System.out.println("Minuto: " + agendamento3.getMinuto());
		
		System.out.println();
		System.out.println("Agendamento 4");
		System.out.println("Id: " + agendamento4.getId());
		System.out.println("Data: " + agendamento4.getData());
		System.out.println("Cliente: " + agendamento4.getCliente().getNome());
		System.out.println("Cabeleireiro: " + agendamento4.getCabeleireiro().getNome());
		System.out.println("Hora: " + agendamento4.getHora());
		System.out.println("Minuto: " + agendamento4.getMinuto());
		
		System.out.println();
		System.out.println("Atendimento 1");
		System.out.println("Cliente: " + atendimento1.getCliente().getNome());
		System.out.println("Cabeleireiro: " + atendimento1.getCabeleireiro().getNome());
		System.out.println("Data: " + atendimento1.getData());
		
		System.out.println();
		System.out.println("Atendimento 2");
		System.out.println("Cliente: " + atendimento2.getCliente().getNome());
		System.out.println("Cabeleireiro: " + atendimento2.getCabeleireiro().getNome());
		System.out.println("Data: " + atendimento2.getData());
		
		System.out.println();
		System.out.println("Atendimento 3");
		System.out.println("Cliente: " + atendimento3.getCliente().getNome());
		System.out.println("Cabeleireiro: " + atendimento3.getCabeleireiro().getNome());
		System.out.println("Data: " + atendimento3.getData());
		
		System.out.println();
		System.out.println("Atendimento 4");
		System.out.println("Cliente: " + atendimento4.getCliente().getNome());
		System.out.println("Cabeleireiro: " + atendimento4.getCabeleireiro().getNome());
		System.out.println("Data: " + atendimento4.getData());
	}
}
