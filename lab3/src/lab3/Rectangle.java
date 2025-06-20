package lab3;

public class Rectangle extends GeometricFigure{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateSquare(){
        return width * height;
    }

    @Override
    public void printInfo() {
        System.out.println(this);
        System.out.println("Площадь: " + calculateSquare());
    }

    @Override
    public String toString(){
        return super.toString() + ", Ширина: " + width + ", Высота: " + height;
    }
}
