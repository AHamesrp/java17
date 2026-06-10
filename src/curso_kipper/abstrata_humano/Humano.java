package curso_kipper.abstrata_humano;

public class Humano extends SerVivo {
    public Humano(){
        super(18);
    }

    // agora que a classe ano é abstrata nao ha
    // necessidade de ter o override
    @Override
    public void respirar() {
        System.out.println(this.idade);
        System.out.println("respirando");
    }
}
