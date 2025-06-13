public class Rectangle implements Shape{

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(Rectangle rectangle){
        this.length = rectangle.length;
        this.breadth = rectangle.breadth;
    }

    @Override
    public void printShape() {
        System.out.println("Length: "+length+" Breadth: "+breadth);
    }

    @Override
    public Shape clone() {
        Rectangle rectangle = new Rectangle(this);
        return rectangle;
    }
}
