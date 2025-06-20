package lab3;

public class Circle extends GeometricFigure{
    private double radius;

    public Circle() {
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateSquare(){
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println(this);
        System.out.println("Площадь: " + calculateSquare());
    }


    @Override
    public String toString(){
        return super.toString() + " Радиус: " + radius;
    }
}
