public class Circle implements Shape{

    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public Circle(Circle circle){
        this.radius = circle.radius;
    }
    @Override
    public void printShape() {
        System.out.println("Radius of circle is: "+radius);
    }

    @Override
    public Shape clone() {
        Circle circle = new Circle(this);
        return circle;
    }
}
