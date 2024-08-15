package Semana_02;

import java.util.Scanner;

public class exercicio_lista_08 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);       
    System.out.println("Entre com um número: ");
    scan.close();
    int num = scan.nextInt();
    int soma = 0;
    for( int x = 1; x < num + 1; x++){
    soma = soma + x;}
    System.out.println("Resultado da soma: " + soma);
}
}