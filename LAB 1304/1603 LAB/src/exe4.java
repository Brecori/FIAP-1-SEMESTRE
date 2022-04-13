import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int a, b, c, menor, maior, meio;
		
		
		System.out.println("Informe o valor de A: ");
		a = i.nextInt();
		System.out.println("Informe o valor de B: ");
		b = i.nextInt();
		System.out.println("Informe o valor de C: ");
		c = i.nextInt();
		
		menor = Math.min(a, Math.min(b, c));
		maior = Math.max(a, Math.max(b, c));
		meio = a + b + c - menor - maior;
		
		System.out.println("Ordem Crescente: ");
		System.out.println(menor + ", " + meio + ", " + maior);
		
		
		
		i.close();
	}

}
