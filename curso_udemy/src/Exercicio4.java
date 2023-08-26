import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.
		
		Locale.setDefault(Locale.US);
		
		Scanner v = new Scanner(System.in);
		
				
		int numero = v.nextInt();
				
		int horas = v.nextInt();
				
		double valorHora = v.nextDouble();
		
		double salario = horas*valorHora;
		
		System.out.println("Number = " + numero);
		System.out.printf("Salary = U$ %.2f \n", salario );
		
		v.close();

		
	}

}
