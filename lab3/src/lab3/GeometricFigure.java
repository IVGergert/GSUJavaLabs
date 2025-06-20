package lab3;

public abstract class GeometricFigure implements Figur,Object{
    private double x;
    private double y;

    public GeometricFigure() {
    }

    public GeometricFigure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract double calculateSquare();

    @Override
    public String toString(){
        return "Центр фигуры: (" + x + ", " + y + ")";
    }
}
