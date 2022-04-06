import java.util.Scanner;

public class EstSeq_Exe1
{
	public static void main(String[] args)
	{
		int A, B, C, soma;
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.print("Informe o valor de a: ");
		A = teclado.nextInt();
		System.out.println();
		System.out.print("Informe o valor de b: ");
		B = teclado.nextInt();
		System.out.println();
		System.out.print("Informe o valor de c: ");
		C = teclado.nextInt();
		System.out.println();
		
		soma = A + B + C;
		
		System.out.println("O valor é: " + soma);
		teclado.close();
		
	}

}
