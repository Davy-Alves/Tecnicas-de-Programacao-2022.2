package negocio;

import apresentacao.AcaoBotaoCadastro;
import apresentacao.FrameCadastro;

public class Bolao {

	private int id;
	
	private String nome;
	
	private String selecao1Quartas;
	private int placar1Quartas;
	private String selecao2Quartas;
	private int placar2Quartas;
	private String selecao3Quartas;
	private int placar3Quartas;
	private String selecao4Quartas;
	private int placar4Quartas;
	private String selecao5Quartas;
	private int placar5Quartas;
	private String selecao6Quartas;
	private int placar6Quartas;
	private String selecao7Quartas;
	private int placar7Quartas;
	private String selecao8Quartas;
	private int placar8Quartas;

	private String selecao1Semifinal;
	private int placar1Semifinal;
	private String selecao2Semifinal;
	private int placar2Semifinal;
	private String selecao3Semifinal;
	private int placar3Semifinal;
	private String selecao4Semifinal;
	private int placar4Semifinal;
	
	private String selecao1Final;
	private int placar1Final;
	private String selecao2Final;
	private int placar2Final;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSelecao1Quartas() {
		return selecao1Quartas;
	}
	public void setSelecao1Quartas(String selecao1Quartas) {
		this.selecao1Quartas = selecao1Quartas;
	}
	public int getPlacar1Quartas() {
		return placar1Quartas;
	}
	public void setPlacar1Quartas(int placar1Quartas) {
		this.placar1Quartas = placar1Quartas;
	}
	public String getSelecao2Quartas() {
		return selecao2Quartas;
	}
	public void setSelecao2Quartas(String selecao2Quartas) {
		this.selecao2Quartas = selecao2Quartas;
	}
	public int getPlacar2Quartas() {
		return placar2Quartas;
	}
	public void setPlacar2Quartas(int placar2Quartas) {
		this.placar2Quartas = placar2Quartas;
	}
	public String getSelecao3Quartas() {
		return selecao3Quartas;
	}
	public void setSelecao3Quartas(String selecao3Quartas) {
		this.selecao3Quartas = selecao3Quartas;
	}
	public int getPlacar3Quartas() {
		return placar3Quartas;
	}
	public void setPlacar3Quartas(int placar3Quartas) {
		this.placar3Quartas = placar3Quartas;
	}
	public String getSelecao4Quartas() {
		return selecao4Quartas;
	}
	public void setSelecao4Quartas(String selecao4Quartas) {
		this.selecao4Quartas = selecao4Quartas;
	}
	public int getPlacar4Quartas() {
		return placar4Quartas;
	}
	public void setPlacar4Quartas(int placar4Quartas) {
		this.placar4Quartas = placar4Quartas;
	}
	public String getSelecao5Quartas() {
		return selecao5Quartas;
	}
	public void setSelecao5Quartas(String selecao5Quartas) {
		this.selecao5Quartas = selecao5Quartas;
	}
	public int getPlacar5Quartas() {
		return placar5Quartas;
	}
	public void setPlacar5Quartas(int placar5Quartas) {
		this.placar5Quartas = placar5Quartas;
	}
	public String getSelecao6Quartas() {
		return selecao6Quartas;
	}
	public void setSelecao6Quartas(String selecao6Quartas) {
		this.selecao6Quartas = selecao6Quartas;
	}
	public int getPlacar6Quartas() {
		return placar6Quartas;
	}
	public void setPlacar6Quartas(int placar6Quartas) {
		this.placar6Quartas = placar6Quartas;
	}
	public String getSelecao7Quartas() {
		return selecao7Quartas;
	}
	public void setSelecao7Quartas(String selecao7Quartas) {
		this.selecao7Quartas = selecao7Quartas;
	}
	public int getPlacar7Quartas() {
		return placar7Quartas;
	}
	public void setPlacar7Quartas(int placar7Quartas) {
		this.placar7Quartas = placar7Quartas;
	}
	public String getSelecao8Quartas() {
		return selecao8Quartas;
	}
	public void setSelecao8Quartas(String selecao8Quartas) {
		this.selecao8Quartas = selecao8Quartas;
	}
	public int getPlacar8Quartas() {
		return placar8Quartas;
	}
	public void setPlacar8Quartas(int placar8Quartas) {
		this.placar8Quartas = placar8Quartas;
	}
	public String getSelecao1Semifinal() {
		return selecao1Semifinal;
	}
	public void setSelecao1Semifinal(String selecao1Semifinal) {
		this.selecao1Semifinal = selecao1Semifinal;
	}
	public int getPlacar1Semifinal() {
		return placar1Semifinal;
	}
	public void setPlacar1Semifinal(int placar1Semifinal) {
		this.placar1Semifinal = placar1Semifinal;
	}
	public String getSelecao2Semifinal() {
		return selecao2Semifinal;
	}
	public void setSelecao2Semifinal(String selecao2Semifinal) {
		this.selecao2Semifinal = selecao2Semifinal;
	}
	public int getPlacar2Semifinal() {
		return placar2Semifinal;
	}
	public void setPlacar2Semifinal(int placar2Semifinal) {
		this.placar2Semifinal = placar2Semifinal;
	}
	public String getSelecao3Semifinal() {
		return selecao3Semifinal;
	}
	public void setSelecao3Semifinal(String selecao3Semifinal) {
		this.selecao3Semifinal = selecao3Semifinal;
	}
	public int getPlacar3Semifinal() {
		return placar3Semifinal;
	}
	public void setPlacar3Semifinal(int placar3Semifinal) {
		this.placar3Semifinal = placar3Semifinal;
	}
	public String getSelecao4Semifinal() {
		return selecao4Semifinal;
	}
	public void setSelecao4Semifinal(String selecao4Semifinal) {
		this.selecao4Semifinal = selecao4Semifinal;
	}
	public int getPlacar4Semifinal() {
		return placar4Semifinal;
	}
	public void setPlacar4Semifinal(int placar4Semifinal) {
		this.placar4Semifinal = placar4Semifinal;
	}
	public String getSelecao1Final() {
		return selecao1Final;
	}
	public void setSelecao1Final(String selecao1Final) {
		this.selecao1Final = selecao1Final;
	}
	public int getPlacar1Final() {
		return placar1Final;
	}
	public void setPlacar1Final(int placar1Final) {
		this.placar1Final = placar1Final;
	}
	public String getSelecao2Final() {
		return selecao2Final;
	}
	public void setSelecao2Final(String selecao2Final) {
		this.selecao2Final = selecao2Final;
	}
	public int getPlacar2Final() {
		return placar2Final;
	}
	public void setPlacar2Final(int placar2Final) {
		this.placar2Final = placar2Final;
	}
	
}
