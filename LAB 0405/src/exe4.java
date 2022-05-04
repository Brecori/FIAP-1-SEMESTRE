import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fat;
        int i, n;

        System.out.println("Digite um valor: ");
        n = input.nextInt();

        fat = n;

        for (i = n - 1; i>0; i--) {
            fat = fat * i;

        }

        System.out.println("Fatorial = " + fat);

    input.close();

    }
}
