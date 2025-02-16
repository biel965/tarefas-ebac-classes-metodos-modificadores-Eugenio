package mod8Back;

/**
 * Oque ficara por tras da principal classe
 * 9
 * @author biel
 */
public class ShowCode {
	private String name;
	private int number;
	
	
	/**
	 * 
	 * @param number
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	/**
	 * @param number
	 * @param name
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	
	/**
	 * Cadastrando nome
	 * @param name
	 */
	public void cadatrarNome(String name) {
		setName(this.name);
	}
	
	/**
	 * Imprimindo os dados
	 */
	public void imprimirDados() {
		System.out.println("Seja bem vindo: " + this.name);
		System.out.println("Seu numero é: " + this.number);
	}
	
}
