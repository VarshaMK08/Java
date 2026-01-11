public class Rectangle {
    double length;
    double breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to display rectangle dimensions
    void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }

    // Method to calculate area
    double helper() {
        double area = this.length * this.breadth;
        return area;
    }

    // Method to print area
    void print() {
        double area = this.helper(); // using this to call helper()
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to show message
    void showMessage() {
        System.out.println("Calculating area using 'this' keyword...");
        this.print(); // calling print() using this
    }

    // Non-static method to create and return another Rectangle object
    Rectangle getInstance(double l, double b) {
        // uses this keyword conceptually to distinguish between instances
        Rectangle newRect = new Rectangle(l, b);
        return newRect;
    }

    // Main method
    public static void main(String[] args) {
        // Create one object manually
        Rectangle obj = new Rectangle(10, 5);

        // Use that object to create another using getInstance()
        Rectangle rect = obj.getInstance(8, 4);

        rect.display();      // Show dimensions
        rect.showMessage();  // Calculate and print area
    }
}

