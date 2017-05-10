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
	int op;
	public int lerInteiro(String mensagem){
		System.out.println(mensagem);
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
	
	public int somar(int num1, int num2){
		return num1+num2;
	}
	public int subtrair(int num1, int num2){
		return num1-num2;
	}
	public int multiplicar(int num1, int num2){
		return num1*num2;
	}
	public int dividir(int num1, int num2){
		return num1/num2;
	}
	public int menu(){
		Scanner in = new Scanner(System.in);
		op = 0;
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("*    Digite 1 para soma:        *");
		System.out.println("*    Digite 2 para subtrair:    *");
		System.out.println("*    Digite 3 para multiplicar: *");
		System.out.println("*    Digite 4 para dividir:     *");
		System.out.println("*    Digite 0 para sair         *");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

			
		op = in.nextInt();
		return op;
	}
}
