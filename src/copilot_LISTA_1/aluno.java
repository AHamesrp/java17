package copilot_LISTA_1;

//25. Faça um programa que leia uma nota (0 a 10) e diga se o aluno
// está aprovado (≥7), em recuperação (≥5 e <7) ou reprovado (<5).
public class aluno {
    public static void main(String[] args) {
        int nota = 9;

        if (nota>=7){
            System.out.println("Aprovado");
        }else if (nota>=5 && nota<7){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }
}
