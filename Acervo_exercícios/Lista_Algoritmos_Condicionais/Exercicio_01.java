package Acervo_exercícios.Lista_Algoritmos_Condicionais;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);       
    System.out.println("Escreva a idade: ");
    int age = scan.nextInt();
    scan.close();
    if (age >= 18){
        System.out.println("A pessoa é maior de idade! ");}
    else{
        System.out.println("A pessoa é menor de idade! ");}
    }} 