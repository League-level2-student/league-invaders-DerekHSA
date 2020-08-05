import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
	speed=10;
	}
	void draw(Graphics g) {
		 g.setColor(Color.BLUE);
	        g.fillRect(x, y, width, height);
	}
	public void right() {
		if (x<=420) {
        x+=speed;
		}
    }
	public void left() {
		if (x>=10) {
        x-=speed;
		}
		}
	public void up() {
		if (y>=10) {
        y-=speed;
		}
    }
	public void down() {
		if (y<=700) {
        y+=speed;
		}
		}
 }
