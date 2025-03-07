public class Cylinder extends Shape implements Volume {
    private double radius, height;

    // Constructor to initialize cylinder dimensions
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height); // Surface area of a cylinder
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Perimeter does not apply to cylinders
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height; // Volume formula for a cylinder
    }
}

