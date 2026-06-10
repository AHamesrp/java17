package curso_kipper.interface_carro;

public class Civic implements Carro{

    final int limitVel = 200;
    public int velAtual = 0;
    @Override
    public void acelerar() {
        System.out.println("rammm bam bam bam baaaaaam");
        this.velAtual +=20;
        System.out.println("vel atual " + this.velAtual);
    }
}
