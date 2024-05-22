package Es1;

public class Rectangle {
    private final double heigth;
    private final double weight;

    public Rectangle(double heigth, double weight) {
        this.heigth = heigth;
        this.weight = weight;
    }

    public static void printRectangle(Rectangle rect) {
        System.out.println("Area: " + rect.area() + " perimetro: " + rect.perimeter());
    }

    public static void printTwoRectangles(Rectangle rect1, Rectangle rect2) {
        System.out.println("Area1: " + rect1.area() + " perimetro1: " + rect1.perimeter());
        System.out.println("Area2: " + rect2.area() + " perimetro2: " + rect2.perimeter());
        System.out.println("AreaTot: " + (rect1.area() + rect2.area()) + " perimetro2: " + (rect1.perimeter() + rect2.perimeter()));
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 3);
        Rectangle.printRectangle(rect1);
        Rectangle rect2 = new Rectangle(2, 4);
        Rectangle.printRectangle(rect2);
        Rectangle.printTwoRectangles(rect1, rect2);
    }

    public double perimeter() {
        return (this.heigth + this.weight) * 2;
    }

    public double area() {
        return this.heigth * this.weight;
    }
}