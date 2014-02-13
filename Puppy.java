public class Puppy implements Speakable
{
	private static final String PUPPY_SPEAK = "Woof";

	public Puppy() {}

	public String speak() {return PUPPY_SPEAK;}
	public String wag() {return "wag tail";}

	public static void main(String [] args)
	{
		Puppy puppy;
		Kitty kitty;
		Speakable speakable;

		puppy = new Puppy();
		kitty = new Kitty();

		speakable = kitty;
//		System.out.println(speakable.sleep(10));
		System.out.println(speakable.speak());

		speakable = puppy;
//		System.out.println(speakable.wag());
		System.out.println(speakable.speak());

		System.out.println(puppy.wag());
		System.out.println(puppy.speak());
		System.out.println(kitty.sleep(5));
		System.out.println(kitty.speak());
	}
}
