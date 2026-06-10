package copilot_LISTA_1;

//26. Escreva um programa que leia um número e diga se ele é primo.
public class primo {
    public static void main(String[] args) {
        //so divisivel por 1 e ele mesmo
        //nao pode ser <=1

        int num = 23;
        boolean primo = true;

        if(num<=1){
            System.out.println("nao primo");
        }else{
            for(int i=2; i<num; i++){
                if(num%i==0){
                    primo = false;
                    break;
                }
            }
        }

        if(primo){
            System.out.println("primo");
        }else {
            System.out.println("nao primo");
        }

    }
}
