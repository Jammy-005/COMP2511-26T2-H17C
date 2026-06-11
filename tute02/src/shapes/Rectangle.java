package shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    public Rectangle(String color) {
        super(color);
        this.width = 1;
        this.height = 1;
        System.out.println("Inside Rectangle constructor with one argument");
    }

    public Rectangle(String color, int width, int height) {
        this(color);
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    public int getArea() {
        return height * width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("red", 10, 20); // What will this print?
        /**
         * Inside the shape Constructor
         * Inside rectangle constructor with one argument
         * Inside rectangle constructor with three arguments
         */
        Rectangle r2 = new Square("blue", 20);
        // r2 is actually a Square, even though compile time states that Rectange r2
        System.out.println(r2.getArea());
        // Square.getArea(), prints out 400 = 20 * 20
        System.out.println(Shape.getCount());
        // static, so 2 shapes

    }
}
