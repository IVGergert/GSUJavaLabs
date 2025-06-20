package lab4;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(150);
        Wheel[] wheels = {new Wheel(16), new Wheel(16), new Wheel(16), new Wheel(16)};
        Car car1 = new Car("Toyota", engine, wheels,true,true);
        Car car2 = new Car("BMW", engine, wheels, true, true);

        car1.changeWheel(2, new Wheel(17));

        System.out.println(car1);
        System.out.println(car2);
    }
}