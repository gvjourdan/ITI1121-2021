public class Test  {

    public static void main(String[] args){
        
        Circle c1 = new Circle( 10, 20, 5 );
        Circle c2 = new Circle( 20, 10, 5 );
        Rectangle r1 = new Rectangle( 0, 0, 1, 1 );
        Rectangle r2 = new Rectangle( 100, 100, 200, 400 );

        System.out.println(c1.isLeftOf(c2));
        System.out.println(c1.isLeftOf(r1));
        System.out.println(r1.isLeftOf(c1));
        System.out.println(r1.isLeftOf(r2));


        Shape s;

        s = c1;
        System.out.println(c1.getRadius());
        //c1 = s;
        //System.out.println(((Circle)s).getRadius());

        Shape[] sa = new Shape[3];

        sa[0] = new Shape(1,2);
        sa[1] = new Circle();
        sa[2] = new Rectangle();

        for(int i = 0 ; i < sa.length; i++) {
            System.out.println(sa[i]);
        }

    }
}