import java.util.Scanner;

public class exe_3 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int a, b, c;
		boolean condicao1, condicao2, condicao3;
		
		System.out.println("Digite o valor do primeiro lado: ");
		a = i.nextInt();
		System.out.println("Digite o valor do segundo lado: ");
		b = i.nextInt();
		System.out.println("Digite o valor do terceiro lado ");
		c= i.nextInt();
		
		condicao1 = Math.abs(b-c) < a & a < b + c;
		condicao2 = Math.abs(a-c) < b & b < a + c;
		condicao3 = Math.abs(a-b) < c & c < a + b;
		
		if (condicao1 & condicao2 & condicao3) {
			System.out.println("É um triângulo!");
			if ((a == b) && (b ==c)) {
				System.out.println("equilátero");
			}
		
			if((a != b) && (a != c) && (b != c))
			{
				System.out.println("escaleno");
		}
			else
				System.out.println("isósceles");
		}
			else
				System.out.println("triangulo");
		
		
		
		i.close();
		
		

	}

}
