import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        Rectangle rectangle = new Rectangle(8,5);
        Circle circle = new Circle(6);
        shapes.add(rectangle);
        shapes.add(circle);
        List<Shape> clonedShapes = new ArrayList<>();
        for(Shape s:shapes){
            clonedShapes.add(s.clone());
        }
        System.out.println("Original shapes array: ");
        for(Shape s: shapes){
            s.printShape();
        }

        System.out.println("Cloned shapes array: ");
        for(Shape s: clonedShapes){
            s.printShape();
        }

    }
}