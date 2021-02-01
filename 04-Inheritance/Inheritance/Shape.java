public class Shape {

    protected double x ;
    protected double y ;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

 
    public Shape() {
        this.x = 0;
        this.y = 0;
    }

    public void moveTo(double x, double y){
        this.x = x;
        this.y = y;
    }

    public final double getX() {
        return x;
    }    

    public double getY() {
        return y;
    }

    public String toString(){
        return "This is a shape. X is " + x 
        + " and Y is " + y;
    }
}
