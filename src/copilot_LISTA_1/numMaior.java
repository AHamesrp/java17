package copilot_LISTA_1;

//13. Crie um programa que leia três números e mostre o maior deles.
public class numMaior {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 5, 7, 10};
        int maior = numeros[0];

        for (int n : numeros) {
            if (n > maior) {
                maior = n;
            }
        }
        System.out.println(maior);

    }
}
