package exercisios_copilot;

//27. Crie um programa que leia uma palavra e imprima quantas letras ela tem.
public class caracteres {
    public static void main(String[] args) {
        // .length funciona para stirng
        String palavra = "Java";
        int qtd = palavra.length();
        System.out.println("palavra: "+palavra+" \nquantidade: "+qtd);
    }
}
