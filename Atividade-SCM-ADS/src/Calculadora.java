import java.util.Scanner;

/**
 * 
 */

/**
 * @author fabricio_cardoso; matheus_ev
 *
 */
public class Calculadora {
	int num1;
	int num2;

	public int lerInteiro(String mensagem){
		System.out.println(mensagem);
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
	
	public int somar(int num1, int num2){
		return num1+num2;
	}
}
