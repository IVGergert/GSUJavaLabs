package lab4;

import java.util.Arrays;
import java.util.Objects;

public class Car {
    private String brand;
    private Engine engine;
    private Wheel[] wheels;
    private boolean isDrive;
    private boolean isRefuel;

    public Car(String brand, Engine engine, Wheel[] wheels,boolean isDrive,boolean isRefuel) {
        this.brand = brand;
        this.engine = engine;
        this.wheels = wheels;
        this.isDrive = isDrive;
        this.isRefuel = isRefuel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public boolean getIsDrive() {
        return isDrive;
    }

    public void setIsDrive(boolean isDrive) {
        this.isDrive = isDrive;
    }

    public boolean isRefuel() {
        return isRefuel;
    }

    public void setRefuel(boolean refuel) {
        isRefuel = refuel;
    }

    public String printBrand(){
        return "Марка автомобиля: " + brand;
    }

    public String isDriving() {
        return isDrive ? "Автомобиль едет" : "Автомобиль не едет";
    }

    public String isRefueling() {
        return isRefuel ? "Автомобиль заправляется" : "Автомобиль не заправляется";
    }

    public void changeWheel(int wheelIndex, Wheel newWheel) {
        if (wheelIndex >= 0 && wheelIndex < wheels.length) {
            wheels[wheelIndex] = newWheel;
            System.out.println("Колесо заменено.");
        } else {
            System.out.println("Неверный индекс колеса.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(engine, car.engine) && Objects.deepEquals(wheels, car.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, engine, Arrays.hashCode(wheels));
    }

    @Override
    public String toString() {
        return  "\n" + "Машина: " + "\n" + printBrand() + "\n" +
                "Двигатель: " + engine + "\n" +
                "Колёса: " + Arrays.toString(wheels) + "\n" +
                "Состояние автомобиля: " + isDriving() + "\n"
                + "Заправка: " + isRefueling();
    }
}
