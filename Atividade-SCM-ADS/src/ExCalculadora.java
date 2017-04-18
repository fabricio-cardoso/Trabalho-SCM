
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
		
	
		do{
			c1.num1 = c1.lerInteiro("Digite um inteiro: ");
			c1.num2 = c1.lerInteiro("Digite outro inteiro");
			c1.menu();	
		switch(c1.op){
				case 1:
					System.out.println(c1.somar(c1.num1, c1.num2));
				break;
		//		default:
			//		System.out.println("opção inválida");
		}			
			}
		while(c1.op != 0);
		
		System.out.println("saiu");

	}
}
