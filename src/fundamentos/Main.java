package fundamentos;

public class Main {

    public static void main(String[] args) {
/*      //variaveis
        int idade = 18;
        String nome = "Arthur";

        //numero inteiros
        byte => 8 bits => -128 a 127
        short => 16 bits => -32768 a 32767
        int => 32 bits => -2.147.483..648 a 2.147.483..647
        long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        //numeros decimais = 1.2, 3.4, 9.0
        float => 32 bits => precisao simples
        double => 64 bits => precisao dupla

        //texto
        String => palavras e frases
        char => caracteres => a, b, c

        boolean = true ou false */

//    byte b = 100;
//    short s = 10000;
//    int i = 100000;
//    long l = 100000L;
//    float f = 10.5f;
//    char c = 'a';
//    String str = "arthur";
//    boolean bool = true;


//    int[] colecaoInteiros = {1, 2, 3, 4, 5};
//    int[] array = new int[5];
//
//    if(str.isBlank()) {
//        System.out.println("ok");
//    } else if (c != 'a'){
//        System.out.println("error");
//    } else {
//            System.out.println("error");
//    }

//        ArrayList<String> nomes = new ArrayList<>();
//        nomes.add("Arthur");
//        nomes.add("Leticia");
//        nomes.add("Fabricio");
//        nomes.add("Juliana");
//
//        System.out.println(nomes.get(0));
//
//        nomes.remove(0);
//        nomes.remove("Leticia");
//        System.out.println(nomes.get(0));

        String[] meuArray = new String[10];
        for (int i=0; i< meuArray.length; i++){
            System.out.println(meuArray);
        }

        int contador = 0;
        while(contador <10){
            System.out.println("to no while");
        }

//      casting, basicamente atualizar o valor de uma variavel criando outra
        int num = 0;
        double numInt = (int) num;
        // num -> num

        String str = "10";
        int strInt = Integer.parseInt(str);
        // str -> num

        String minhaString = String.valueOf(numInt);
        // int -> str

    }

}