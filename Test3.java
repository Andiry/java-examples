import objectdraw.*;
import java.awt.*;

public class Test3
{
	private static int a;
	private int b;
	private int c = 5;

	public static void main(String[] args) {
		Test3 ref = new Test3(3);
		ref.method1(Test3.a);
	}

	public Test3(int b)
	{
		this.b = b;
	}

	private void method1(int x)
	{
		int c = x + 2;
		int b;

		b = a + 3;
		a = c + 4;

		System.out.println("Test3.a = " + Test3.a);
		System.out.println("this.b = " + this.b);
		System.out.println("this.c = " + this.c);
		System.out.println("c = " + c);
		System.out.println("b = " + b);
		System.out.println("a = " + a);
		System.out.println("x = " + x);
		System.out.println("result = " + method2(11));
		System.out.println("Test3.a = " + Test3.a);
		System.out.println("this.b = " + this.b);
		System.out.println("this.c = " + this.c);
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

	public int method2(int x)
	{
		int a = x;
		int c = b;

		x = b;

		System.out.println("Test3.a = " + Test3.a);
		System.out.println("this.b = " + this.b);
		System.out.println("this.c = " + this.c);
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		Test3.a = a + 3;
		this.c = x + c;

		return x + 3;
	}
}
