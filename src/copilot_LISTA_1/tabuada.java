package copilot_LISTA_1;

//24. Crie um programa que leia um número e imprima sua tabuada completa (de 1 a 10).
public class tabuada {
    public static void main(String[] args) {
        int num = 2;

        for (int i=0; i<=num*10; i+=num){
            System.out.println(i);
        }
    }
}
