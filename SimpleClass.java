public class SimpleClass {
	
	public int sum(int a, int b) {
		
		return a+b;
	}

	public static void main(String[] args) {
		SimpleClass sc = new SimpleClass();

		System.out.println("The sum of 4+5 is " + sc.sum(4, 5));
		System.out.println("A little change!");
	}

}
