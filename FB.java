import objectdraw.*;
import java.awt.*;

public class FB extends ActiveObject
{
	private FilledOval ball;
	private DrawingCanvas canvas;

	public FB(Location point, DrawingCanvas canvas) {
		ball = new FilledOval(point, 10, 10, canvas);
		this.canvas = canvas;
		start();
	}

	public void run()
	{
		while(ball.getY() < canvas.getHeight()) {
			ball.move(0, 4);
			pause(33);
		}
//		new Text("Touched", point.getX(), point.getY(), canvas);
		ball.removeFromCanvas();
	}

}
