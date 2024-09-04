import java.util.Scanner;

public class Calculadora {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);       
        System.out.println("Entre com um número: ");
        float num1 = scan.nextFloat();
        System.out.println("Entre com a operação: ");
        String operation = scan.next();
        System.out.println("Entre com um número: ");
        float num2 = scan.nextFloat();
        scan.close();
        if (operation == "+"){
            float result = num1 + num2;}
        else if (operation == "-"){
            float result = num1 - num2;}
        else if (operation == "*"){
            float result = num1 * num2;}
        else if (operation == "/"){
            if (num1 || num2 == 0){
                return null;}
            else{float result = num1 / num2;}} 
        
        System.out.println("Resultado da operação: " + result);
    }    
}
