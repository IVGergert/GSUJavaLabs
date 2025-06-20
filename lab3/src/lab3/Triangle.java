package lab3;

public class Triangle extends GeometricFigure {
    private double side1;
    private double side2;
    private double side3;
    private String type;

    public Triangle() {
    }

    public Triangle(double x, double y, double side1, double side2, double side3, String type) {
        super(x, y);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.type = type;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public String getType() {
        return type;
    }

    @Override
    public double calculateSquare(){
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public void printInfo() {
        System.out.println(this);
        System.out.println("Площадь: " + calculateSquare());
    }


    @Override
    public String toString(){
        return super.toString() + ", Стороны: " + side1 + ", " + side2 + ", " + side3 + ", Тип: " + type;
    }
}
