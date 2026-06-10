package exercisios_copilot;

//29. Escreva um programa que leia um ano e diga se ele é bissexto.
public class bissexto {
    public static void main(String[] args) {
        //divisível por 4 e por 400 - bissexto
        //divisivel por 100 - nao bissexto

        int ano = 2026;

        if((ano%400==0) || (ano%4==0 && ano%100!=0)){
            System.out.println("bissexto");
        }else{
            System.out.println("nao bissexto");
        }






    }
}
