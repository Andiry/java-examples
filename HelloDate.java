import java.util.*;

public class HelloDate {
	static boolean cond() {
		boolean result = Math.random() < 0.99;
		System.out.println(result + ", ");
		return result;
	}

	public static void main(String[] args) {
		Integer a = new Integer(4);
		Integer b = new Integer(4);
		System.out.println("Hello, it's ");
		System.out.println(new Date());
		System.out.println("a = " + a + " b = " + b);
		System.out.println(a == b);
		while(cond())
			System.out.println("Inside 'while'");
		System.out.println("Exited 'while'");

	}
}

