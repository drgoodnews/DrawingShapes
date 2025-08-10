import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 4);
        Circle cir = new Circle(6);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rect);
        shapes.add(cir);

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.getArea());
            ((Drawable) shape).draw();
            System.out.println();
        }

    }
}
