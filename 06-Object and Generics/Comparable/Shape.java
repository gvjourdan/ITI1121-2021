public abstract class Shape extends Comparable {

    public int compareTo( Comparable o ) {
/*
        // this doesn't work..
        if(o == null) {
            return -1;
        }
        if(getClass() != o.getClass()) {
            return -1;
        }
*/
        if(!(o instanceof Shape)){
            return -1;
        }

       Shape other = (Shape) o;

        if ( area() < other.area() )
            return -1;
        else if ( area() == other.area() )
            return 0;
        else
            return 1;
    }


    public  abstract double area();


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
