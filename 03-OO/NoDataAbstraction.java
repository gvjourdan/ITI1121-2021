public class NoDataAbstraction {
	
    public static boolean equal(int x1,int y1,int x2,int y2){
		return (x1==x2 && y1==y2);
	}

	public static void main(String[] args){

		// first point
		int x1=0;
		int y1=0;

		// second point
		int x2=1;
		int y2=1;
		System.out.println(equal(x1,y1,x2,y2));
	}

}
