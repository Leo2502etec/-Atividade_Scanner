

import java.util.Scanner;

public class VerificadorPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (ehPrimo(numero)) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " NÃO é um número primo.");
            }

            System.out.print("Deseja verificar outro número? (s/n): ");
            resposta = scanner.next();

        } while (resposta.equalsIgnoreCase("s"));

        scanner.close();
        System.out.println("Programa encerrado.");
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}

