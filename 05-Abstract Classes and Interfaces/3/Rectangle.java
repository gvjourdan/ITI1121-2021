public class Rectangle extends Shape  {

    private double width;
    private double height;

    public  double area() {
        return width * height;
    }

    public Rectangle() {
        super();
        width = 0;
        height = 0;
    }

    public Rectangle( double x, double y, double width, double height ) {
        super(x, y);
        this.width = width;
        this.height = height;
    }    


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void flip() {
        double tmp = width;
        width = height;
        height = tmp;
    }

    // overriding method toString
    public String toString() {
       return "Located at: (" + x + "," + y + "), width " + width + " and length " + height;
    }
 
}
