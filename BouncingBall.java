import objectdraw.*;
import java.awt.*;

public class BouncingBall extends ActiveObject
{
	private FilledOval ball;
	private DrawingCanvas canvas;
	private Location startpoint;
	private double newheight;
	private double newl;

	public BouncingBall(Location point, DrawingCanvas canvas) {
		ball = new FilledOval(point, 10, 10, canvas);
		startpoint = new Location(point);
		this.canvas = canvas;
		newheight = point.getY();
		newl = point.getX();
		start();
	}

	public void run()
	{
		while (newheight < canvas.getHeight() - 5) {
			while(ball.getY() < canvas.getHeight()) {
				ball.move(0, 4);
				pause(33);
			}
//		new Text("Touched", point.getX(), point.getY(), canvas);
			ball.removeFromCanvas();
			newheight = (canvas.getHeight() - newheight) / 2 + newheight;
			startpoint = new Location(newl, newheight);
			ball = new FilledOval(startpoint, 10, 10, canvas);
		}
		ball.removeFromCanvas();
	}

}
