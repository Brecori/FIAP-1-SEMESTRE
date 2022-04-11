import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		Scanner i;
		int a, b, c;
		
		i = new Scanner(System.in);
		
		System.out.print("Escreva o valor de A: ");
		a = i.nextInt();
		System.out.print("Escreva o valor de B: ");
		b = i.nextInt();
		System.out.print("Escreva o valor de C: ");
		c = i.nextInt();
		
		if (a>b & a>c & b>c) {
			System.out.println(a+">"+b +">"+c);
		}
		else if (a>b & a>c & c>b) {
			System.out.println(a+">"+c +">"+b);
		}
		else if (b>a & b>c & a>c) {
			System.out.println(b+">"+a +">"+c);
		}
		else if (b>a & b>c & c>a) {
			System.out.println(b+">"+c +">"+a);
		}
		else if (c>b & c>a & b>a) {
			System.out.println(c+">"+b +">"+a);
		}
		else if (c>b & c>a & a>b) {
			System.out.println(c+">"+a +">"+b);
		}
		
		
		
		
		
		
		
		
		i.close();
	}

}
