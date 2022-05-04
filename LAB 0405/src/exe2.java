import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;



        do {
            System.out.println("Escreva um valor maior que 0: ");
            n = input.nextInt();
            System.out.println("N = " + n);
        }
        while (n>0);

        input.close();
    }
}
