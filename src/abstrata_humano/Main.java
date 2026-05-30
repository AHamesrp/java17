package abstrata_humano;

public class Main {

    public static void main(String[] args) {
        SerVivo meuSer = new Humano();

        // se a classe for normal o metodo respirar
        // ira dar erro pq ele ta puxando de Humano nao de serVivo
        meuSer.respirar();
    }
}
