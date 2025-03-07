public class Square extends Shape {
    private double side;

    // Constructor to initialize square side length
    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side; // Area formula: side²
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side; // Perimeter formula: 4 * side
    }
}

