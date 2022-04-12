package projects.AreaCalculator;

public class Main {

    public static void main(String[] args) {
	Rectangle rect = new Rectangle(5, 10);
    System.out.println(rect.getArea());
    System.out.println(rect.getPicture());
    System.out.println(rect.toString());
    Square square = new Square(9);
    System.out.println(square.toString());
    }
}