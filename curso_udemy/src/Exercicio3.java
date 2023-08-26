import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		
		Scanner v = new Scanner(System.in);
		
		int a= v.nextInt();
		int b= v.nextInt();
		int c= v.nextInt();
		int d= v.nextInt();
		
		int diferenca = (a*b - c*d);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		v.close();
		

	}

}
