import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Numero 1: ");
			int num1 = scanner.nextInt();
			System.out.println("Numero 2: ");
			int num2 = scanner.nextInt();
			float resultado = num1/num2;
			System.out.println("Resultado: " + resultado);
		} catch(InputMismatchException e) {
			System.out.println("é preciso informar um número inteiro");
		} catch (ArithmeticException e) {
			System.out.println("Não é possivel fazer divisao com 0");
		} finally {
			scanner.close();
		}
	}

}
