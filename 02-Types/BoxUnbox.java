public class BoxUnbox {

    private static  int iterations = 100000000; // 100 millions

  
    private static long loopUsingPrimitiveType(){

        int counter = 0;       
        long start =System.currentTimeMillis();
        for(int i = 0 ; i < iterations; i++){
            counter = counter + 1;
        } 
        return (System.currentTimeMillis() - start);
    }


    private static long loopUsingWrapper(){

        Integer counter = 0;       
        long start =System.currentTimeMillis();
        for(int i = 0 ; i < iterations; i++){
            counter = counter + 1;
        } 
        return (System.currentTimeMillis() - start);
    }

    public static void main(String[] args){
        System.out.println("loopUsingPrimitiveType: " + 
                loopUsingPrimitiveType());
        System.out.println("loopUsingWrapper: " + 
                loopUsingWrapper());

    }
}

