public class Counter {
    private int val = 0;

    public void increment(){
        this.val++;
    }

    public void reset(){
        val = 0;
    }

    public int getValue(){
        return val;
    }
}
