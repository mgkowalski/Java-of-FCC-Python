package projects.AreaCalculator;

public class Square extends Rectangle{
    public Square(int side){
        super(side, side);
    }
    public void setSide(int newSide){
        super.setWidth(newSide);
        super.setHeight(newSide);
    }
    public String toString(){
        return String.format("Square(side=%d)", this.getWidth());
    }

}
