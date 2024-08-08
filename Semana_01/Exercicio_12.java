package Semana_01;
import java.util.Scanner;
import Math.pow;

public class Exercicio_12 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite uma mensagem: ");
        String mensagem = scanner.nextLine();
        float SaldoInicial, SaldoFinal, PercJuros, aux = 0.0 ;
        int Nmeses = 0;
        scanner.close();
        aux = SaldoInicial * (1 + (PercJuros/100));
        SaldoFinal = Math.pow(aux, Nmeses);
        System.out.println("Resultado: " SaldoFinal);
    }
}
