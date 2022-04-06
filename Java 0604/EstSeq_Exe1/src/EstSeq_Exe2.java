import java.util.Scanner;

public class EstSeq_Exe2 
{
	public static void main(String[] args)
	{
		float A, B, media;
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		A = teclado.nextFloat();
		
		if (A > 10) {
			System.out.println("Nota Inválida!");
		}
		else {
			
		
		
		System.out.println();
		System.out.print("Informe a segunda nota: ");
		B = teclado.nextFloat();
		System.out.println();
		
		if (B > 10) {
			System.out.println("Nota Inválida!");
		}
		else {
		
		
		media = (A+B)/2;
		
		System.out.println("A média é: " + media);
		teclado.close();
		
		
		if (media >= 6) {
			System.out.println("Passou");
		}
		else {
			System.out.println("Não Passou!");
		}
		}
		}
		
	}

}

