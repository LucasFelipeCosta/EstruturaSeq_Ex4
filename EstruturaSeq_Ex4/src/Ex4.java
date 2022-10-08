import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota ");
		nota1 = teclado.nextDouble();
		System.out.println("Digite a segunda nota ");
		nota2 = teclado.nextDouble();
		System.out.println("Digite a terceira nota ");
		nota3 = teclado.nextDouble();
		System.out.println("Digite a quarta nota ");
		nota4 = teclado.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A media das notas eh" + media);
		
		teclado.close();
	}

}
