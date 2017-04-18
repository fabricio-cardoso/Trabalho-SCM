/**
 * 
 */

/**
 * @author fabricio_cardoso; matheus_ev
 *
 */
public class ExCalculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		c1.num1 = c1.lerInteiro("Digite um inteiro: ");
		c1.num2 = c1.lerInteiro("Digite outro inteiro");
		
		System.out.println(c1.somar(c1.num1, c1.num2));
	}
}
