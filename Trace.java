public class Trace
{
	public static void main(String [] args)
	{
		System.out.println("main1");
		foo1();
		System.out.println("main2");
		foo2();
		System.out.println("main3");
		foo3();
	}

	public static void foo1()
	{
		System.out.println("A");
		foo3();
		System.out.println("B");
	}
	
	public static void foo2()
	{
		System.out.println("B");
	}

	public static void foo3()
	{
		System.out.println("D");
		foo2();
		System.out.println("E");
	}
}
