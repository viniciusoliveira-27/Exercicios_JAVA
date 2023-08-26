import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
		//	a) a área do triângulo retângulo que tem A por base e C por altura.
		//	b) a área do círculo de raio C. (pi = 3.14159)
		//	c) a área do trapézio que tem A e B por bases e C por altura.
		//	d) a área do quadrado que tem lado B.
		//	e) a área do retângulo que tem lados A e B. // 
		
		Locale.setDefault(Locale.US);
		
		Scanner v = new Scanner(System.in);
		
		double a = v.nextDouble();
		double b = v.nextDouble();
		double c = v.nextDouble();
		
		double tri = (a*c)/2;
		double circ = 3.14159*(c*c);
		double trap = ((a + b)*c)/2;
		double quad = b*b;
		double retan = a*b;
		
		System.out.printf("TRIANGULO: %.3f \n " , tri);
		System.out.printf("CIRCULO: %.3f \n " , circ);
		System.out.printf("TRAPEZIO: %.3f \n " , trap);
		System.out.printf("QUADRADO: %.3f \n " , quad);
		System.out.printf("RETANGULO: %.3f \n " , retan);
		
		v.close();

	}

}
