package one;

/**
 * https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 * 
 * @author Francis
 *
 */
public class Alpha {

	public String nome;

	protected String sobrenome;

	String pai;

	private String mae;

	public static void main(String[] args) {

		Alpha a = new Alpha();
		a.nome = "Alpha";
		a.sobrenome = "da Silva";
		a.pai = "Jose";
		a.mae = "Maria";
	}

}
