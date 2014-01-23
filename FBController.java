import objectdraw.*;
import java.awt.*;

public class FBController extends WindowController
{
	public void begin() {
		new Text ("Click to make a ball", new Location(100, 25), canvas);
	}

	public void onMouseClick(Location point)
	{
//		new Text("Touched", point.getX(), point.getY(), canvas);
		new FB(point, canvas);
	}

}
