package lab4;

import java.util.Objects;

public class Engine {
    private int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return horsePower == engine.horsePower;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(horsePower);
    }

    @Override
    public String toString() {
        return " мощность двигателя: " + horsePower;
    }
}
