public class PairShape {
	private Shape first;
	private Shape second;
	public PairShape( Shape first, Shape second ) {
		this.first = first;
		this.second = second;
	}
	public Shape getFirst( ) {
		return first;
	}
	public Shape getSecond( ) {
		return second;
	}
	public void setFirst( Shape first ) {
		this.first = first;
	}
	public void setSecond( Shape second ) {
		this.second = second;
	}
}