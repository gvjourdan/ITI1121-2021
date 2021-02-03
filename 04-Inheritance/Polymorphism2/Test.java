public class Test  {

    public static void main(String[] args){
        

       
        Circle c = new Circle(1,1,5);
        System.out.println(c.area());
        Rectangle r = new Rectangle( 10, 100, 10, 100 );
        System.out.println(r.area());

      Shape[] sa = new Shape[2];
 //       sa[0] = new Shape();
        sa[0] = new Circle(1,2,4);
        sa[1] = new Rectangle(1,1,3,4);

        Circle c23 = (Circle)sa[1];

        for(int i = 0 ; i < 2;  i ++){
            System.out.println(sa[i].area());
        }
        System.out.println(sa[0].compareTo(sa[1]));

        Shape s; //= new Shape();        
      	s =c;

      	Shape s2 = new Rectangle(1,2,1,2);


        System.out.println(s.area());
 

    }
}