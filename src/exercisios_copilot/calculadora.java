package exercisios_copilot;

import java.util.Scanner;

//30. Crie um programa que simule uma calculadora simples (soma, subtração, multiplicação e divisão).
public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite um numero: ");
        int num2 = sc.nextInt();

        System.out.println("Escolha o tipo de operação: ");
        String operacao = sc.next();

        double resultado = 0;

        switch (operacao){
            case "+":
                resultado = num1+num2;
                System.out.println("resultado: "+resultado);
                break;
            case "-":
                resultado = num1-num2;
                System.out.println("resultado: "+resultado);
                break;
            case "*":
                resultado = num1*num2;
                System.out.println("resultado: "+resultado);
                break;
            case "/":
                resultado = num1/num2;
                System.out.println("resultado: "+resultado);
                break;2
            default:
                System.out.println("Operação inválida !");
        }

        sc.close();


    }
}
