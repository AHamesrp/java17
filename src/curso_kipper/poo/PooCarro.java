package curso_kipper.poo;

public class PooCarro {
    public static void main(String[] args) {
        //OBJECT
        Car myCar = new Car("Civic"); //Instance
        myCar.acelerar();
    }
}
//CLASS
class Car {
    String model;
    //METHOD
    public Car(String model) {
//        System.out.println("Created car");
        this.model = model;
    }
    public void acelerar() {
        System.out.println("Acelerando o " + this.model);
    }
}

