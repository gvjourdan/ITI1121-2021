/*
public class Pair {
    private Object first;
    private Object second;
    public Pair( Object first, Object second ) {
        this.first = first;
        this.second = second;
    }
    
    public Object getFirst( ) {
        return first;
    }
    public Object getSecond( ) {
        return second;
    }
    public void setFirst( Object first ) {
        this.first = first;
    }
    public void setSecond( Object second ) {
        this.second = second;
    }
}
*/
/*
public class Pair<T>{
    private T first;
    private T second;
    public Pair( T first, T second ) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst( ) {
        return first;
    }
    public T getSecond( ) {
        return second;
    }
    public void setFirst( T first ) {
        this.first = first;
    }
    public void setSecond( T second ) {
        this.second = second;
    }
}
*/

public class Pair <T,U> {
    private T first;
    private U second;

    public Pair( T first, U second ) {
        this.first = first;
        this.second = second;
    }
    public T getFirst( ) {
        return first;
    }
    public U getSecond( ) {
        return second;
    }
    public void setFirst( T first ) {
        this.first = first;
    }
    public void setSecond( U second ) {
        this.second = second;
    }
}

