package geektech;

public class Rectangle extends Figure {

    private int a;
    private int b;


    public Rectangle(int a, int b, String name) {
        super.setName(name);
        this.a = a;
        this.b = b;
    }
    @Override
    public int CalculatePerimeter() {
        return (a+b) * 2;
    }

    @Override
    public String draw() {
        return null;
    }
}
