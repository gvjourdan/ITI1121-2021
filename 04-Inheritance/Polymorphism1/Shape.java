
public  class Shape  {

    protected double x;
    protected double y;

 
 
   public boolean isLeftOf(Shape other) {
        return this.getX() < other.getX();
    }


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
