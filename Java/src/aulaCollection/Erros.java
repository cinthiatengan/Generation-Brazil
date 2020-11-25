package aulaCollection;

public class Erros {
	public static void main(String[] args) {
		String frase = null;
		String novaFrase = null;
		
		try
		{
			novaFrase = frase.toUpperCase();
		}
		//captura do erro possivel
		catch(NullPointerException e) {
			System.out.println("A frase inicial � nula, para solucionar tal problema"
					+ "foi lhe atribuido um valor default");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("Frase Antiga: "+frase);
		System.out.println("Frase Nova: "+novaFrase);
	}
}
