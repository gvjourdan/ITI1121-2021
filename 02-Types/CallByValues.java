
public class CallByValues {

	public static void increment(int i){
		i=i+1;
		System.out.println("Inside the method, i = " + i);
	}

	public static void increment(MyInteger j){
		j.value++;
		System.out.println("Inside the method, j = " + j.value);
	}

	public static void increment(int[] k) {
		k[1]++;
		System.out.println("Inside the method, k = [" + k[0] + ", "+ k[1] + ", "+ k[2]+"]");
	}

	public static void main(String[] args){

		int i;
		i = 5;
		System.out.println("Before the method, i = " + i);
		increment(i);
		System.out.println("After the method, i = " + i);

		MyInteger j;
		j = new MyInteger(5);
		System.out.println("Before the method, j = " + j.value);
		increment(j);
		System.out.println("After the method, j = " + j.value);

		int[] k;
		k = new int[3];
		k[0] = 0; k[1] = 1; k[2] = 2;
		System.out.println("Before the method, k = [" + k[0] + ", "+ k[1] + ", "+ k[2]+"]");
		increment(k);
		System.out.println("After the method, k = [" + k[0] + ", "+ k[1] + ", "+ k[2]+"]");
	}
}

