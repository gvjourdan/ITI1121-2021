
public class CompareReference {
    public static void main( String[] args ) {

        MyInteger a = new MyInteger(5);
        MyInteger b = new MyInteger(5);

// 1) "less than" doesn't make sense on references
/*        if(a<b) {
            System.out.println("a<b");
        } else if (a == b) {
            System.out.println("a=b");            
        }
        else { System.out.println("a>b"); }
*/
        
// 2) "==" compares the reference itself
        if (a == b) {
            System.out.println("a=b");            
        }
        else {
            System.out.println("a != b");                       
        }
// 3) adding "equals" method
        if (a.equals(b)) {
            System.out.println("a=b");            
        }
        else {
            System.out.println("a != b");                       
        }

// 4) same reference: both "==" and "equals" return true
        b = a;
        if (a == b) {
            System.out.println("a=b");            
        }
        else {
            System.out.println("a != b");                       
        }
        if (a.equals(b)) {
            System.out.println("a=b");            
        }
        else {
            System.out.println("a != b");                       
        }
     }
}

