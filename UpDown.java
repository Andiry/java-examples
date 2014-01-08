import objectdraw.*;
import java.awt.*;

public class UpDown extends WindowController {

	private Text up, down; // variable declarations

	// create two Text objects and set their colors
	// to red and gray
	public void begin() {
		up = new Text("UP", 200, 220, canvas);
		down = new Text("DOWN", 200, 200, canvas);

		up.setColor(Color.RED);
		down.setColor(Color.GRAY);
	}

	// when the mouse is pressed the down arrow
	// is red and the up arrow is gray
	public void onMousePress(Location point) {
		down.setColor(Color.red);
		up.setColor(Color.gray);
	}

	// at all other times the up is red and the
	// the down arrow is gray
	public void onMouseRelease(Location point) {
		up.setColor(Color.red);
		down.setColor(Color.gray);
	}

}
