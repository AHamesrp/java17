package exercicios_copilot;

//23. Escreva um programa que leia 10 números e mostre o maior e o menor.
public class maiorMenor {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 99, 5, 3};
        int maior = nums[0];
        int menor = nums[0];

        for (int n:nums){
            if(n<menor){
                menor=n;
            }
        }
        for (int n2:nums){
            if(n2>maior){
                maior=n2;
            }
        }

        System.out.println("Maior: "+maior+ " \nMenor: "+menor);
    }
}
