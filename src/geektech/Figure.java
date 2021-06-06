package geektech;

public abstract class Figure implements Drawable{

    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract int CalculatePerimeter();






}
