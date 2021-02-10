
public class Circle extends Shape   {

    public  double area() {
      return Math.PI * radius * radius ;
    }

    // instance variables of class Circle
    private double radius;

    public Circle () {
	     super();
       radius = 0;
    }

    public Circle (double x, double y, double radius) {
	     super(x, y);
       this.radius = radius;
    }

   // getters
    public double getRadius() {
        return radius;
    }

    // overriding method toString
    public String toString() {
       return "Located at: (" + x + "," + y + "), with radius " + radius;
    }
 
}
