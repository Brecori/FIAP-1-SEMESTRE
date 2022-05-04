import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, p, l;
        double fat;

        l = 0;


        System.out.println("Quantos números você quer? ");
        p = input.nextInt();

        do {
            System.out.println("Escreva o valor de N: ");
            n = input.nextInt();

            fat = n;

            for (i = n - 1; i>0; i--) {
                fat = fat * i;
            }

            System.out.println("Fatorial = " + fat);

            l++;
        } while (l<p);

        input.close();

    }
}
