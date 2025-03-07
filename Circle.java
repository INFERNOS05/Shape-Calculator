public class Circle extends Shape {
    private double radius;

    // Constructor to initialize circle radius
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area formula: πr²
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Perimeter formula: 2πr
    }
}

