package Main;

import java.util.ArrayList;

public class CadastroDeGoleiros {

	private ArrayList<Goleiro> goleiro = new ArrayList<Goleiro>();

	
		public String incializarGoleiros() {
		
		Goleiro goleiro1 = new Goleiro(1, "Pratik Skaggs", 5, 7, 8, 9, 6, 6); goleiro.add(goleiro1);
		Goleiro goleiro2 = new Goleiro(2, "Uehudah Hack", 9, 6, 8, 8, 7, 10); goleiro.add(goleiro2);
		Goleiro goleiro3 = new Goleiro(3, "Edison Drye", 5, 8, 5, 8, 10, 7); goleiro.add(goleiro3);
		Goleiro goleiro4 = new Goleiro(4, "Ajani Harding", 6, 6, 5, 7, 6, 6); goleiro.add(goleiro4);
		Goleiro goleiro5 = new Goleiro(5, "Orazio Hart", 5, 8, 7, 9, 9, 10); goleiro.add(goleiro5);
		Goleiro goleiro6 = new Goleiro(6, "Tristan Karns", 9, 7, 10, 7, 7, 6); goleiro.add(goleiro6);
		Goleiro goleiro7 = new Goleiro(7, "Niven Glaser", 10, 9, 7, 6, 5, 8); goleiro.add(goleiro7);
		Goleiro goleiro8 = new Goleiro(8, "Derwyn Devers", 10, 7, 9, 5, 9, 5); goleiro.add(goleiro8);
		Goleiro goleiro9 = new Goleiro(9, "Tod Phan", 10, 7, 7, 5, 5, 6); goleiro.add(goleiro9);
		Goleiro goleiro10 = new Goleiro(10, "Eddie Hulse", 7, 6, 5, 9, 7, 5); goleiro.add(goleiro10);
		Goleiro goleiro11 = new Goleiro(11, "Welford Yepez", 5, 8, 8, 7, 7, 8); goleiro.add(goleiro11);
		Goleiro goleiro12 = new Goleiro(12, "Rishley Snyder", 6, 5, 6, 5, 7, 6); goleiro.add(goleiro12);
		Goleiro goleiro13 = new Goleiro(13, "Milo Mccurdy", 10, 9, 8, 6, 10, 9); goleiro.add(goleiro13);
		Goleiro goleiro14 = new Goleiro(14, "Carden Justus", 8, 5, 8, 5, 10, 7); goleiro.add(goleiro14);
		Goleiro goleiro15 = new Goleiro(15, "Carlyon Gorby", 8, 5, 8, 8, 8, 6); goleiro.add(goleiro15);
		Goleiro goleiro16 = new Goleiro(16, "Mungo Spangler", 8, 10, 9, 8, 9, 5); goleiro.add(goleiro16);
		Goleiro goleiro17 = new Goleiro(17, "Whitmore Squires", 9, 10, 7, 9, 9, 10); goleiro.add(goleiro17);
		Goleiro goleiro18 = new Goleiro(18, "Pedrog Mccurdy", 8, 5, 10, 5, 7, 7); goleiro.add(goleiro18);
		Goleiro goleiro19 = new Goleiro(19, "Ridgley Leo", 8, 8, 8, 9, 9, 9); goleiro.add(goleiro19);
		Goleiro goleiro20 = new Goleiro(20, "Bolton Tarin", 9, 8, 7, 6, 9, 10); goleiro.add(goleiro20);
		Goleiro goleiro21 = new Goleiro(21, "Edison Loy", 7, 7, 5, 10, 10, 7); goleiro.add(goleiro21);
		Goleiro goleiro22 = new Goleiro(22, "Delling Herndon", 7, 5, 5, 8, 9, 9); goleiro.add(goleiro22);
		Goleiro goleiro23 = new Goleiro(23, "Senichi Lorio", 7, 7, 5, 8, 10, 5); goleiro.add(goleiro23);
		Goleiro goleiro24 = new Goleiro(24, "Albin Kerner", 6, 7, 8, 8, 9, 9); goleiro.add(goleiro24);
		Goleiro goleiro25 = new Goleiro(25, "Jivin Justus", 9, 10, 8, 7, 7, 5); goleiro.add(goleiro25);
		Goleiro goleiro26 = new Goleiro(26, "Clement Fleisher", 10, 9, 10, 5, 7, 8); goleiro.add(goleiro26);
		
		String saida = "";
		int i = 1;
		int j = 1;
		int z = 5;
		for(Goleiro g : goleiro) {
			if(i == z) {
				j++;
				z = z + 5;
			}
			i++;
			saida += "Nome: " + g.getNome() + "\nSelecao: " 
			+ j + "\nGols defendidos: ??? "  + "\nGols tomados: ???"  + "\nAGG: " + g.CalculoAAG() + "\n\n";
			
		}
		return saida;

	}
		
}
