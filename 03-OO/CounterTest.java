public class CounterTest {

  public static void doSomething(Counter counter){
    System.out.println("doSomething before: " + counter.getValue());
    counter.increment();
    System.out.println("doSomething after: " + counter.getValue());    
  }

  public static void doSomething(int counter){
    System.out.println("doSomething before: " + counter);
    counter++;
    System.out.println("doSomething after: " + counter);    
  }

  public static void main(String[] args){

    int oneCounter = 0;
    oneCounter++;

    int otherCounter = 0;
    int[] fiveCounters = new int[5];

    oneCounter  += 7;

    System.out.println("before doSomething call: " + otherCounter);
    doSomething(otherCounter);
    System.out.println("after doSomething call: " + otherCounter);



    Counter counter;

    counter = new Counter();

    System.out.println(counter.getValue());
    counter.increment();
    System.out.println(counter.getValue());

    Counter counter2 = new Counter();
    System.out.println(counter2.getValue());
    
    // illegal access
    //counter.value = 7;

    counter.reset();
    System.out.println("before doSomething call: " + counter.getValue());
    doSomething(counter);
    System.out.println("after doSomething call: " + counter.getValue());

  }
}



