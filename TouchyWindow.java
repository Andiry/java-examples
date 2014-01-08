import objectdraw.*;
import java.awt.*;

public class TouchyWindow extends WindowController
{
	public void onMouseMove(Location point)
	{
		new Text("Touched", point.getX(), point.getY(), canvas);
	}
	public void onMouseRelease(Location point)
	{
		canvas.clear();
	}
}
