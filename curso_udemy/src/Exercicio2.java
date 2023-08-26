import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		
		Locale.setDefault(Locale.US); // Serve para tranformar o formato dos numeros de , para .
		
		Scanner f = new Scanner(System.in);
		
		System.out.println("Entre com o valor do Raio");
		double raio = f.nextDouble();
		
		double area = (raio*raio)*3.14159;
		
		System.out.printf("A = %.4f " , area);
		
		f.close();
	}

}
