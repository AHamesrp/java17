package curso_kipper.interface_carro;
/*
public -> acessivel de todo lugar
default -> quando eu nao defino, acessivel no mesmo pacote
private -> acessivel somente dentro da classe que foi definida
protected -> acessivel por todo mundo que esta no mesmo pacote
 */

public class Main {

    public static void main(String[] args) {

        Carro meuCarro = new Civic();
        meuCarro.acelerar();



        //tratamento de exceções, ex:
        //PRINCIPAIS/
        //NullPointerException
        //ArrayOutOfBoundsException
        //RunTimeException
        //IOException
        //ArithmeticException

        Carro meuErroFurado = null;
        meuErroFurado.acelerar();
        try {
            meuErroFurado.acelerar();
        } catch (NullPointerException exception) {
            System.out.println("vende essa bomba");
        }
    }
}
