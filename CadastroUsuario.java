package cadastro_usuario;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entradas
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua data de nascimento (DD/MM/AAAA): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite seu curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite sua série: ");
        String serie = scanner.nextLine();

        System.out.print("Digite sua altura (em metros, ex: 1,75): ");
        String alturaStr = scanner.nextLine();
        double altura = Double.parseDouble(alturaStr.replace(",", "."));

        System.out.print("Digite seu peso (em kg, ex: 70,5): ");
        String pesoStr = scanner.nextLine();
        double peso = Double.parseDouble(pesoStr.replace(",", "."));

        // Saída
        System.out.println("\n----- DADOS CADASTRADOS -----");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Curso: " + curso);
        System.out.println("Série: " + serie);
        System.out.printf("Altura: %.2f m\n", altura);
        System.out.printf("Peso: %.2f kg\n", peso);

        scanner.close();
    }
}
L