
public class Test {

	public static void p(SinglyLinkedList l){
		if(l==null){
			System.out.println("null reference.");
		} else {
			System.out.println("Size: " + l.size() + ", content: " + l);
		}
	}
	public static void p(String l){
		System.out.println(l);
	}

	public static void testAdd(){

		SinglyLinkedList<String> test = new SinglyLinkedList<String>();

		p("addFirst...");
		p(test);
		test.addFirst("a");
		p(test);
		test.addFirst("b");
		p(test);
		test.addFirst("c");
		p(test);
		try{
			test.addFirst(null);
		} catch(NullPointerException e){
			p("NullPointerException caught " + e.getMessage());
			p(test);
		}

		p("addFirstAlternative...");
		test = new SinglyLinkedList<String>();

		p(test);
		test.addFirstAlternative("a");
		p(test);
		test.addFirstAlternative("b");
		p(test);
		test.addFirstAlternative("c");
		p(test);
		try{
			test.addFirstAlternative(null);
		} catch(NullPointerException e){
			p("NullPointerException caught " + e.getMessage());
			p(test);
		}
		
		test = new SinglyLinkedList<String>();
		p("add...");
		p(test);
		test.add("a");
		p(test);
		test.add("b");
		p(test);
		test.add("c");
		p(test);
		try{
			test.add(null);
		} catch(NullPointerException e){
			p("NullPointerException caught " + e.getMessage());
			p(test);
		}
	}


	public static void testRemove(){

		SinglyLinkedList<String> test = new SinglyLinkedList<String>();

		p("removeFirst...");
		test.add("a");	test.add("b"); test.add("c");
		p(test);
		p(test.removeFirst());
		p(test);
		p(test.removeFirst());
		p(test);
		p(test.removeFirst());
		p(test);
		try{
			test.removeFirst();
		} catch(IllegalStateException e){
			p("IllegalStateException caught " + e.getMessage());
			p(test);
		}

		test = new SinglyLinkedList<String>();
		p("removeLast...");
		test.add("a");	test.add("b"); test.add("c");
		p(test);
		p(test.removeLast());
		p(test);
		p(test.removeLast());
		p(test);
		p(test.removeLast());
		p(test);
		try{
			test.removeLast();
		} catch(IllegalStateException e){
			p("IllegalStateException caught " + e.getMessage());
			p(test);
		}

		test = new SinglyLinkedList<String>();
		p("remove...");
		p(test);
		p("remove empty: " + test.remove("a") );
		test.add("a");
		p(test);
		p("remove first, size 1: " + test.remove("a") );
		p(test);
		test.add("a");	test.add("b"); test.add("c");
		p(test);
		p("remove first, size 3: " + test.remove("a") );
		p(test);
		p("remove last " + test.remove("c") );
		p(test);
		test.addFirst("a");
		test.add("c");
		p(test);
		p("remove middle " + test.remove("b") );
		p(test);
		test = new SinglyLinkedList<String>();
		p(test);
		p("remove non existing, empty: " + test.remove("not here"));
		p(test);
		test.add("a");	
		p(test);
		p("remove non existing, size 1: " + test.remove("not here"));
		p(test);
		test.add("b");	
		p(test);
		p("remove non existing, size 2: " + test.remove("not here"));
		p(test);
		test.add("c");	
		p(test);
		p("remove non existing, size 3: " + test.remove("not here"));
		p(test);

	}

	public static void testGet(){

		SinglyLinkedList<String> test = new SinglyLinkedList<String>();

		p("Get...");
		test.add("a");
		p(test);
		p("Get first, size 1: " + test.get(0));
		p(test);
		test.add("b"); test.add("c");
		p(test);
		p("Get first,  size 3: " + test.get(0));
		p("Get second, size 3: " + test.get(1));
		p("Get third,  size 3: " + test.get(2));
		p(test);

		try{
			test.get(-1);
		} catch(IndexOutOfBoundsException e){
			p("IllegalStateException caught " + e.getMessage());
			p(test);
		}
		try{
			test.get(3);
		} catch(IndexOutOfBoundsException e){
			p("IllegalStateException caught " + e.getMessage());
			p(test);
		}
		try{
			test = new SinglyLinkedList<String>();
			test.get(3);			
		} catch(IllegalStateException e){
			p("IllegalStateException caught " + e.getMessage());
			p(test);
		}

	}

	public static void testRemovePos(){

		p("Test remove(int pos)...");

		SinglyLinkedList<String> test = new SinglyLinkedList<String>();

		p("remove(0)...");
		test.add("a");	test.add("b"); test.add("c");
		p(test);
		p(test.remove(0));
		p(test);
		p(test.remove(0));
		p(test);
		p(test.remove(0));
		p(test);

		test = new SinglyLinkedList<String>();
		p("removeLast...");
		test.add("a");	test.add("b"); test.add("c");
		p(test);
		p(test.remove(2));
		p(test);
		p(test.remove(1));
		p(test);

		test = new SinglyLinkedList<String>();
		p("removeMiddle...");
		test.add("a");	test.add("b"); test.add("c");
		p(test);
		p(test.remove(1));
		p(test);

		test = new SinglyLinkedList<String>();
		p("remove exceptions...");
		test.add("a");	test.add("b"); test.add("c");
		p(test);
		try{
			test.remove(-1);
		} catch(IndexOutOfBoundsException e){
			p("IllegalStateException caught " + e.getMessage());
			p(test);
		}
		try{
			test.remove(3);
		} catch(IndexOutOfBoundsException e){
			p("IllegalStateException caught " + e.getMessage());
			p(test);
		}
		try{
			test = new SinglyLinkedList<String>();
			test.remove(3);			
		} catch(IllegalStateException e){
			p("IllegalStateException caught " + e.getMessage());
			p(test);
		}

	}

	public static void testEqual(){
		p("Test Equals)...");

		SinglyLinkedList<String> test = new SinglyLinkedList<String>();
		SinglyLinkedList<String> test2 = new SinglyLinkedList<String>();
		p("empty vs null: " + test.equals(null));
		test.add("a");	
		p(test + " vs " + test2 + " : " + test.equals(test2));
		test2.add("a");	
		p(test + " vs " + test2 + " : " + test.equals(test2));
		test2.add("b");	
		p(test + " vs " + test2 + " : " + test.equals(test2));
		test.add("b");	
		test2 = new SinglyLinkedList<String>();
		p(test + " vs " + test2 + " : " + test.equals(test2));
		test2.add("a");	
		p(test + " vs " + test2 + " : " + test.equals(test2));
		test2.add("b");	
		p(test + " vs " + test2 + " : " + test.equals(test2));
		test2.add("c");	
		p(test + " vs " + test2 + " : " + test.equals(test2));
		test.add("b");	
		test.add("c");	
		test2 = new SinglyLinkedList<String>();
		test2.add("a");	
		test2.add("b");	
		test2.add("c");	
		p(test + " vs " + test2 + " : " + test.equals(test2));
		test2 = new SinglyLinkedList<String>();
		test2.add("b");	
		test2.add("b");	
		test2.add("b");	
		test2.add("c");	
		p(test + " vs " + test2 + " : " + test.equals(test2));
		test2 = new SinglyLinkedList<String>();
		test2.add("a");	
		test2.add("b");	
		test2.add("b");	
		test2.add("d");	
		p(test + " vs " + test2 + " : " + test.equals(test2));
		test2 = new SinglyLinkedList<String>();
		test2.add("a");	
		test2.add("b");	
		test2.add("b");	
		test2.add("c");	
		p(test + " vs " + test2 + " : " + test.equals(test2));
		test2.add("a");	
		p(test + " vs " + test2 + " : " + test.equals(test2));


	}

	public static void testAddPos(){

		SinglyLinkedList<String> test = new SinglyLinkedList<String>();

		p("testAddPos...");
		p(test);
		test.add(0, "a");
		p(test);
		test.add(0,"b");
		p(test);
		test.add(0,"c");
		p(test);
		test.add(1, "c");
		p(test);
		test.add(2, "b");
		p(test);
		test.add(4, "a");
		p(test);
		test.add(6, "d");
		p(test);


		try{
			test.add(4,null);
		} catch(NullPointerException e){
			p("NullPointerException caught " + e.getMessage());
			p(test);
		}
		try{
			test.add(-1,"v");
		} catch(IndexOutOfBoundsException e){
			p("IllegalStateException caught " + e.getMessage());
			p(test);
		}
		try{
			test.add(8,"v");
		} catch(IndexOutOfBoundsException e){
			p("IndexOutOfBoundsException caught " + e.getMessage());
			p(test);
		}
		try{
			test.add(9,"v");
		} catch(IndexOutOfBoundsException e){
			p("IllegalStateException caught " + e.getMessage());
			p(test);
		}
	}

	public static void main(String[] args) {

		testAdd();
		testRemove();
		testGet();
		testRemovePos();
		testEqual();
		testAddPos();
	}


}

