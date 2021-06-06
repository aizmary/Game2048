package geektech;

public class Square extends Figure{

    private int a;

    public Square(int a, String name) {
        super.setName(name);
        this.a = a;
    }

    @Override
    public int CalculatePerimeter() {
        return 4*a;
    }

    @Override
    public String draw() {
        return null;
    }
}
