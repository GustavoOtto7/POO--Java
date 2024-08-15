package Acervo_exercícios.Lista_Algoritmos_Condicionais;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Escreva a nota final: ");
    int nota = scan.nextInt();
    scan.close();
    if (nota >= 6){
        System.out.println("Você foi aprovado! ");}
    else{
        System.out.println("Você reprovou! ");}
    }
}
