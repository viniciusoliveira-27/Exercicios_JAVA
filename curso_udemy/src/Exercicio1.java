import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		//mensagem explicativa, conforme exemplos.
		
		Scanner f = new Scanner(System.in);
		
		int x = f.nextInt();
		int y = f.nextInt();
		
		int soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		f.close();
		
	}

}
