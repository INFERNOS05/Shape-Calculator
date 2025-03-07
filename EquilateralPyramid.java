public class EquilateralPyramid extends Shape implements Volume {
    private double baseSide, height;

    // Constructor to initialize pyramid dimensions
    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double baseArea = baseSide * baseSide; // Base area = side²
        double slantHeight = Math.sqrt((baseSide / 2) * (baseSide / 2) + height * height); 
        double lateralArea = 2 * baseSide * slantHeight; // Lateral surface area calculation
        return baseArea + lateralArea; // Total surface area
    }

    @Override
    public double calculatePerimeter() {
        return 4 * baseSide; // Perimeter formula for square base: 4 * side
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * baseSide * baseSide * height; // Volume formula for a pyramid
    }
}

