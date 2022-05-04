import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, cont;

        cont = 0;

        System.out.println("Digite um número: ");
        n = input.nextInt();

        for (int i = 1; i<=n; i++){
            if (n % i == 0){
                cont = cont + 1;
            }
        }

        if (cont == 2){
            System.out.println("É um número primo!");
        }
        else {
            System.out.println("Não é um número primo!");
        }
        input.close();
    }
}
