import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		
		Scanner v = new Scanner(System.in);
		
		int cod1 = v.nextInt();
		int num1 = v.nextInt();
		double valor1 = v.nextDouble();
		
		int cod2 = v.nextInt();
		int num2 = v.nextInt();
		double valor2 = v.nextDouble();
		
		double total = (num1*valor1) + (num2*valor2);
		
		System.out.printf("Valor a Pagar: R$ %.2f " , total);
		
		v.close();
		
		
		
		
	}

}
