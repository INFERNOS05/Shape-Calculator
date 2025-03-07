public class Rectangle extends Shape {
    private double length, width;

    // Constructor to initialize rectangle dimensions
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width; // Area formula: length * width
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width); // Perimeter formula: 2 * (length + width)
    }
}

