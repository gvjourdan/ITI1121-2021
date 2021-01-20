public class ComparePrimitiveAndReference {


  public static void main(String[] args){
       

// 1) "<" doesn't work on reference
/*
        int a = 5;
        MyInteger b = new MyInteger(5);

        if(a<b) {
            System.out.println("a<b");
        } else if (a == b) {
            System.out.println("a=b");            
        }
        else {
            System.out.println("a>b");                       
        }
*/

// 2) getting the actual value
        int a = 5;
        MyInteger b = new MyInteger(5);

        if(a<b.value) {
            System.out.println("a<b");
        } else if (a == b.value) {
            System.out.println("a=b");            
        }
        else {
            System.out.println("a>b");                       
        }

// 3) BOX/UNBOX works
        int a2 = 5;
        Integer b2 = Integer.valueOf(5);

        if(a2<b2) {
            System.out.println("a2<bb");
        } else if (a2 == b2) {
            System.out.println("a2=b2");            
        }
        else {
            System.out.println("a2>b2");                       
        }
  }  
}
