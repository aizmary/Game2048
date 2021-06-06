package geektech;

public class Triangle extends Figure{

    private int sideA;
    private int sideB;
    private int sideC;


    public Triangle(int sideA, int sideB, int sideC, String name){
        super.setName(name);
       this.sideA = sideA;
       this.sideB = sideB;
       this.sideC = sideC;
    }

    @Override
    public int CalculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String draw() {
        return null;
    }
}
