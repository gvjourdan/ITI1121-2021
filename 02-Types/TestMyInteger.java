public class TestMyInteger{
	
	public static void main(String[] args){

		MyInteger i;

// doesn't work once the constructor is added
/*		
		i = new MyInteger();

		System.out.println(i.value); // prints out default int value (0)

		i.value = 22;
		System.out.println(i.value); 

		i.value = i.value + 1;
		System.out.println(i.value); 

		i.value++;
		System.out.println(i.value); 
*/


		i = new MyInteger(23);

		System.out.println(i.value); 

		i.value = 22;
		System.out.println(i.value); 

		i.value = i.value + 1;
		System.out.println(i.value); 

		i.value++;
		System.out.println(i.value); 


		MyInteger A;
		A = new MyInteger(30);
		System.out.println(A.value);

		MyInteger B;
		B = new MyInteger(40);
		System.out.println(B.value);

		B = A;
		System.out.println(B.value);

		A.value++;
		System.out.println(B.value);
	}


}