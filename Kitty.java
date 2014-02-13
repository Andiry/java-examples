public class Kitty implements Speakable
{
	private static final String KITTY_SPEAK = "Meow";

	public Kitty() {}

	public String speak() {return KITTY_SPEAK;}
	public String sleep(int time) {return time + " minute cat nap";}
}
