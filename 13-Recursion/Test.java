
public class Test {

	public static void main(String[] args) {

		LinkedList<String> test = new LinkedList<String>();
		System.out.println("size 0 : " + test.size());
		test.add("a");
		System.out.println("size 1: " + test.size());
		test.add("a");
		System.out.println("size 2: " + test.size());
		System.out.println("max a: " + test.findMax());
		test.add("b");
		System.out.println("max b: " + test.findMax());
		test.add("c");
		System.out.println("max c: " + test.findMax());
		test.add("a");
		System.out.println("max c: " + test.findMax());
		System.out.println("get a: " + test.get(0));
		System.out.println("get a: " + test.get(1));
		System.out.println("get b: " + test.get(2));
		System.out.println("get c: " + test.get(3));
		System.out.println("get a: " + test.get(4));

		System.out.println("0: " + test.indexOf("a"));
		System.out.println("2: " + test.indexOf("b"));
		System.out.println("3: " + test.indexOf("c"));

		System.out.println("4: " + test.indexOfLast("a"));
		System.out.println("2: " + test.indexOfLast("b"));
		System.out.println("3: " + test.indexOfLast("c"));

		System.out.println("true: " + test.contains("a"));
		System.out.println("true: " + test.contains("b"));
		System.out.println("true: " + test.contains("c"));
		System.out.println("false: " + test.contains("e"));


		System.out.println(test+ " is increasing: " + test.isIncreasing());
		test = new LinkedList<String>();
		test.add("a");
		test.add("b");
		test.add("c");
		test.add("d");
		System.out.println(test+ " is increasing: " + test.isIncreasing());

		test.add("a");
		test.add("b");
		System.out.println(test);
		test.remove("c");
		System.out.println("remove c: " + test);
		test.remove("a");
		System.out.println("remove a: " + test);
		test.remove("a");
		System.out.println("remove a: " + test);
		test.remove("b");
		System.out.println("remove b: " + test);
		test.remove("b");
		System.out.println("remove b: " + test);
		test.remove("d");
		System.out.println("remove d: " + test);
		
		test = new LinkedList<String>();
		test.add("a");
		test.add("b");
		test.add("c");
		test.add("d");
		test.add("a");
		test.add("b");

		LinkedList<String> test2 = new LinkedList<String>();
		System.out.println(test + " equals " + test2 + ": "
			+ test.equals(test2));
		test2.add("a");
		System.out.println(test + " equals " + test2 + ": "
			+ test.equals(test2));
		test2.add("b");
		System.out.println(test + " equals " + test2 + ": "
			+ test.equals(test2));
		test2.add("c");
		System.out.println(test + " equals " + test2 + ": "
			+ test.equals(test2));
		test2.add("d");
		System.out.println(test + " equals " + test2 + ": "
			+ test.equals(test2));
		test2.add("a");
		System.out.println(test + " equals " + test2 + ": "
			+ test.equals(test2));
		test2.add("b");
		System.out.println(test + " equals " + test2 + ": "
			+ test.equals(test2));
		test2.add("b");
		System.out.println(test + " equals " + test2 + ": "
			+ test.equals(test2));


	}


}

