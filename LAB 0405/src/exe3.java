import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short escolha;


        do {
            System.out.println("Digite o valor");
            System.out.println("Digite [1] para exibir o valor de PI: ");
            System.out.println("Digite [2] para exibir o valor de E: ");
            System.out.println("Digite [3] para sair: ");
            escolha = input.nextShort();

            switch (escolha) {
                case 1:
                    System.out.println(Math.PI);
                    break;
                case 2:
                    System.out.println(Math.E);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Valor Incorreto! Digite novamente");
            }

        } while (escolha != 3);

        input.close();
    }
}
