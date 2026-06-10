package curso_kipper.interface_carro;

public class Lancer implements Carro {

    final int limitVel = 150;
    public int velAtual = 0;
    @Override
    public void acelerar() {
        System.out.println("acelerando");
        this.velAtual +=10;
        System.out.println("vel atual " + this.velAtual);
    }
}
