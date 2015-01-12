import objectdraw.*;
import java.awt.*;

public class CloneTest
{
	public static void main(String[] args)
	{
		int[] a = {1, 2, 3};
		int[] b = a.clone();

		System.out.println("a==b = " + (a == b));
		System.out.println("a==b = " + (a.equals(b)));

		System.out.println(a.length + " " + b.length);
		for (int i = 0; i < 3; i++)
			System.out.println(a[i] + " " + b[i]);
	}
}

