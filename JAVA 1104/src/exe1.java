import java.text.DecimalFormat;
import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		double sales, price;
		Scanner i;
		i = new Scanner(System.in);
		
		DecimalFormat dec = new DecimalFormat("0.00");
		
		System.out.print("Escreva o valor do produto: ");
		
		price = i.nextDouble();
		
		System.out.println();
		
		System.out.println("Escreva o número de vendas do produdo: ");
		sales = i.nextDouble();
		
		if (price < 30 || sales < 500) {
			price = price * 1.1;
					System.out.println("O preço será de R$" + dec.format(price));
			}
		
		if (sales>=500 & sales <1200 || price>=30 & price<80) {
			price = price * 1.15;
				System.out.println("O preço será de R$" + dec.format(price));
		}
		if (sales>=1200 || price>=80){
			price = price - price*0.2;
			System.out.println("O preço será de R$" + dec.format(price));
		}
		
		i.close();
		
	}
}