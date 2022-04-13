import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		double m1, m2, m3;
		
		System.out.print("Escreva a média do primeiro semestre: ");
		m1 = i.nextDouble();
		System.out.print("Escreva a média do segundo semestre: ");
		m2 = i.nextDouble();
		
		m3 = (m1*0.4) + (m2*0.6);
		
		System.out.printf("Média Anual = %.1f" , m3);
		System.out.println();
		
		if (m3>0 & m3<= 3.9) {
			System.out.println("Reprovado");
		}
		else if (m3>=4 & m3<=5.9) {
			System.out.println("Exame");
		}
		else if (m3>=6 & m3<=10) {
			System.out.println(" Aprovado");
			
		i.close();
		
		}
		
	}

}
