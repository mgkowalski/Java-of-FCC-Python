package projects.AreaCalculator;

public class Rectangle {
    private int width;
    private int height;

    // Constructor takes width and height attributes
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    // Set Width
    public void setWidth(int newWidth){
        this.width = newWidth;
    }

    // Set Height
    public void setHeight(int newHeight){
        this.height = newHeight;
    }

    // Get Width
    public int getWidth(){
        return this.width;
    }

    // Get Height
    public int getHeight(){
        return this.height;
    }

    // Area
    public double getArea(){
        return width * height;
    }

    // Perimeter
    public double getPerimeter(){
        return 2 * width + 2 * height;
    }

    // Diagonal
    public double diagonal(){
        double base = (width * width + height * height);
        double multiplier = (width * width + height * height)/2d;
        return base * multiplier;
    }

    // Picture -- a string of '*' in a block representing the shape
    public String getPicture(){
        if (width > 50 || height > 50)
            return "Too big for picture";
        StringBuilder line = new StringBuilder();
        StringBuilder rows = new StringBuilder();
        for(int i = 0; i < width; i++)
            line.append("*");
        for(int i = 0; i < height; i++)
            rows.append(line + "\n");
        return String.valueOf(rows);
    }

    // Amount of times another specific shape (square or rectangle) will fit inside this one
    public int getAmountInside(Rectangle smallShape){
        return (int)(this.getArea() / smallShape.getArea());
    }

    // String representation gives, eg: "Rectangle(width=5, height=10)"
    public String toString(){
        return String.format("Rectangle(width=%d, height=%d)", width, height);
    }

}
