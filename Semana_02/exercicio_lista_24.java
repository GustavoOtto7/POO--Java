package Semana_02;

import java.util.Scanner;

public class exercicio_lista_24 {
    public static void main(String[] args) {
    lista_fibonacci = [];
    int v1 = 0;
    int v2 = 1;
    for(int x = 0; x < 100; x++){
        int soma = v1 + v2;
        lista_fibonacci.append(soma);
        v1 = v2;
        v2 = soma;}

    lista_digitados = [];
    lista_presentes = [];
    int num = 0;
    Scanner scan = new Scanner(System.in);       
    System.out.println("Entre com um número: ");
    scan.close();
    int num = scan.nextInt();
    lista_digitados.append(num);
    while num > 0 {
        Scanner scan = new Scanner(System.in);       
        System.out.println("Entre com um número: ");
        scan.close();
        int num = scan.nextInt();
        lista_digitados.append(num)
        if num in lista_fibonacci{
            lista_presentes.append(num);}}
    System.out.println("Apresentando a lista digitada: " + lista_digitados);

    System.out.println("Apresentando a lista digitada: " + lista_digitados);
    for( int x = 1; x < num + 1; x++){
    soma = soma + x;}
    System.out.println("Resultado da soma: " + soma);
}
}
