package exercicios_copilot;

//15. Escreva um programa que leia um número e calcule seu fatorial.
public class fatorial {
    public static void main(String[] args) {
       int num = 6;
       int fatorial = 1;

       for(int i=1; i<=num; i++){
           fatorial = fatorial*i;
       }
       System.out.println(fatorial);
    }
}
