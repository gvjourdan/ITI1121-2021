public class Circle extends Shape {

  private double radius;

  public Circle() {
    super();
    radius = 0;
  }

  public Circle(double x, double y, double radius) {
    super(x,y);
    this.radius = radius;
  }

  public double getRadius(){
    return radius;
  }
  
  public String toString(){
    return "This is a circle. X is " + x 
        + " and Y is " + y + " and radius is "
        + radius;
    //or
    //return super.toString() + ", radius is "
    //    + radius;
        
  }
}
