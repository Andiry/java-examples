import objectdraw.*;
import java.awt.*;

public class TouchyWindow extends WindowController
{
	private static final int FL = 170, FR = 170;
	private FunnyFace happy;
	private Location lastpoint;
	private boolean grabbed = false;

	public void begin() {
		happy = new FunnyFace(FL, FR, canvas);
	}

	public void onMousePress(Location point)
	{
//		new Text("Touched", point.getX(), point.getY(), canvas);
		lastpoint = point;
		grabbed = happy.contains(point);
	}

	public void onMouseDrag(Location point)
	{
//		new Text("Touched", point.getX(), point.getY(), canvas);
		if (grabbed) {
			happy.move(point.getX() - lastpoint.getX(),
					point.getY() - lastpoint.getY());
		}
		lastpoint = point;
	}

	public void onMouseRelease(Location point)
	{
//		canvas.clear();
//		grabbed = false;
	}
}
