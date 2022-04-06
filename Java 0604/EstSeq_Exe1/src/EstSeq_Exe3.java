import java.util.Scanner;
import java.lang.Math;

public class EstSeq_Exe3 
{

	public static void main(String[] args) 
	{
		
		Scanner i;
		i = new Scanner(System.in);
		double R, C;
		
		System.out.println("Informe o valor do raio: ");
		R = i.nextDouble();
		
		C = Math.PI * Math.pow(R,2);
		
		System.out.println("A área desta circunferência é " +(String.format("%.2f", C)));
		i.close();
	
		
		
	
	
	}

}
