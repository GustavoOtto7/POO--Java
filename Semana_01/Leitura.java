import java.util.Scanner;
public class Leitura {
    public static void main(String [] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário que digite uma mensagem
        System.out.println("Por favor, digite uma mensagem: ");
        // Lê a mensagem digitada pelo usuário
        String mensagem = scanner.nextLine();
        // Exibe a mensagem na tela
        System.out.println("Você digitou: " + mensagem);
        // Fecha o objeto Scanner
        scanner.close();
    }
}
