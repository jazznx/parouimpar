package att;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = scanner.nextInt();
        scanner.close();

        if (numero % 2 == 0 ){
            System.out.println("O valor será par");
        }
        else {
            System.out.println("O valor será impar");
        }

    }
}
