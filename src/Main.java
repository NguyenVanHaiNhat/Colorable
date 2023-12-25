public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("indigo", false, 3.5);
        Rectangle rectangle = new Rectangle("orange", true, 2.5, 3.8);
        Square  square = new Square(5.8, "yellow", true);

        Shape[] shapes = {circle, rectangle, square};

        for (Shape shape: shapes) {
            if (shape instanceof Square) {
                System.out.println(((Square) shape).howToColor());
            } else {
                System.out.println(circle.getArea());
                System.out.println(rectangle.getArea());
                System.out.println(square.getArea());
            }
        }
    }
}
