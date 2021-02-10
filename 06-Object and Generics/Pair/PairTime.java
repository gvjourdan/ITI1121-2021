public class PairTime {
    private Time first;
    private Time second;
    public PairTime( Time first, Time second ) {
        this.first = first;
        this.second = second;
    }
    public Time getFirst( ) {
        return first;
    }
    public Time getSecond( ) {
        return second;
    }
    public void setFirst( Time first ) {
        this.first = first;
    }
    public void setSecond( Time second ) {
        this.second = second;
    }
}
