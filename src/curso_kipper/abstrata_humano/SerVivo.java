package curso_kipper.abstrata_humano;

public abstract class SerVivo {

    protected int idade;

    public SerVivo(int idade){
        this.idade = idade;
    }

    // a classe pode ser normal mas ai os metodos deverao ter
    // implementações (public void dormir(){Sout}
    // classes normais nao podem apenas ter a
    // assiantura (public abstract void respirar();)

    public abstract void respirar();

    public void dormir(){
        System.out.println("dormindo");
    }
}
