package copilot_LISTA_1;

//18. Escreva um programa que leia um número e diga se ele é positivo, negativo ou zero.
public class posNegZero {
    public static void main(String[] args) {
        int num = -1;

        if(num<0){
            System.out.println("negativo");
        }else if(num==0){
            System.out.println("nulo");
        }else{
            System.out.println("positivo");
        }
    }
}
