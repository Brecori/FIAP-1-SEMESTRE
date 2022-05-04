import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        int soma = 0;
        int mult = 1;

        System.out.println("Digite o valor de A e B");
        a = input.nextInt();
        b = input.nextInt();

        if (a < b) {
            for (int i = a; i<=b; i++) {
                if (i % 2 == 0){
                    soma = soma + i;
                    }
                else {
                    mult = mult * i;
                }
            }
        }

        System.out.println("Soma = " + soma);
        System.out.println("Multiplicação = " + mult);

    }

}
