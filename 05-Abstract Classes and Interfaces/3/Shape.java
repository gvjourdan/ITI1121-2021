public abstract class Shape  implements Comparable {

    public abstract double area();

    public int compareTo( Comparable comparable ) {

        Shape other;
        other = (Shape)comparable;

        if ( area() < other.area() )
            return -1;
        else if ( area() == other.area() )
            return 0;
        else
            return 1;
    }
    
    public boolean isLeftOf( Shape r ) {
        return getX() < r.getX();
    }


    protected double x;
    protected double y;

    public Shape () {
        x = 0;
        y = 0;
    }

    public Shape (double x, double y) {
       this.x = x;
       this.y = y;
    }


    public final double getX () {
       return x;
    }

    public final double getY () {
        return y;
    }

    public final void moveTo (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString () {
       return "Located at: (" + x + "," + y + ")";
    }
}
