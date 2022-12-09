package negocio;

public class Texte {

	public Texte(Bolao bolao, int numero) {
		System.out.println("PASSOU POR ESSE : " + bolao.getNome());
		bolao.setId(numero);
		System.out.println("id :" + bolao.getId());
	}
	
}
