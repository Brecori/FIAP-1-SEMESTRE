import java.util.Scanner;

public class exe_1 {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		int lado, perimetro;
		double area;
		
		System.out.print("Informe o valor do lado: ");
		lado = i.nextInt();
		perimetro = 6 * lado;
		area = (float)(3*Math.sqrt(3)*Math.pow(lado, 2)/2);
		System.out.println("Perimetro = " + perimetro);
		System.out.printf("Área = %.2f" , area);
		
		

		i.close();
	}

}
