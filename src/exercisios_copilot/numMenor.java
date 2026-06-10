package exercisios_copilot;

//17. Faça um programa que leia dois números e mostre qual é o menor.
public class numMenor {
    public static void main(String[] args) {
        int[] nums = {1, 5};
        int menor = nums[0];

        for (int n:nums){
            if (n<menor){
                menor = n;
            }
        }
        System.out.println(menor);
    }
}
