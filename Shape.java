// Abstract class representing a general shape
public abstract class Shape {
    protected String shapeName;

    // Constructor to assign shape name
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract methods that all shapes must implement
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Display shape name when selected
    public void displayShape() {
        System.out.println("\nShape Selected: " + shapeName);
    }
}

