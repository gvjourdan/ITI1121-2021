public class Test  {

    public static void main(String[] args){
        
        Shape shape1 = new Shape();
        System.out.println(shape1);

        shape1.moveTo(10,20);
        Shape shape2 = new Shape(3,5);
        System.out.println(shape1);
        System.out.println(shape2);
 

 
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5,6,7);
        System.out.println(circle1+ " and " + circle2);


        circle2.moveTo(20,21);
        System.out.println(circle2);
    


        Circle d = new Circle( 100, 200, 10 );
        System.out.println( d.getRadius() );
        
        Circle c = new Circle();
        System.out.println( c.getX() );

        d.moveTo( 200, 300);
        System.out.println ( d );
        
        Rectangle r = new Rectangle();
        System.out.println( r.getWidth() );

        Rectangle s = new Rectangle( 50, 50, 10, 15 );
        System.out.println( s );

        s.flip();
        System.out.println( s ); 

    }
}