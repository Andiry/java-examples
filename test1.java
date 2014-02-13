import objectdraw.*;
import java.awt.*;

public class test1
{
	public static void main(String[] args) {
		int a = 2, b = 6, d;
		boolean c = !(b>6)&&(a>=3)&&(a<=4)||(b<6);

		if (a++ >= 4 && --b >=2)
			d = ++a + b--;
		else
			d = a++ + --b;

		System.out.println(a + " " + b + " " + d);
		System.out.println(c ? "True" : "False");

		int x = 2, y = 6, w;
		boolean z = !((x>4)||(y<=6))==((y<=4)&&(x>6));

		if (x++ >= 4 || --y >=3)
			w = --x + y++;
		else
			w = x-- + ++y;

		System.out.println(w + " " + x + " " + y);
		System.out.println(z ? "True" : "False");

		final int MAX = 11, MIN = 4;
		int i = 8, j = 6;

		while( i <= MAX) {
			while (j > MIN) {
				j -= 2;
				System.out.println(i + " " + j);
			}
			i += 3;
			j = i;
		}
		System.out.println(i + " " + j);

		a = 2;
		b = 4;
		d = 6;
		System.out.println(a + b + (d + "=") + a + (b + d));

		mystery(11);
	}

	public static int mystery(int a) {
		int b = a -3;

		if (b >= 5) {
			System.out.println(a + " " + b);
			a = b - mystery(b + 1);
		} else {
			System.out.println("Stop");
			b = a + 2;
		}
		System.out.println(a + " " + b);
		return a + b;
	}
}

