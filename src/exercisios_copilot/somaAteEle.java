package exercisios_copilot;

//28. Faça um programa que leia um número e imprima a soma de todos os números de 1 até ele.
public class somaAteEle {
    public static void main(String[] args) {
        int num = 4;
        int soma = 0;

        for (int i = 1; i <= num; i++) {
            soma = soma+i;
        }
        System.out.println(soma);
    }
}
