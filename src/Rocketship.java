import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject {
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
	public Rocketship(int x, int y, int width, int height) {
		
		super(x, y, width, height);
		if (needImage) {
		    loadImage ("rocket.png");
		}
	speed=10;
	}
	void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}
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
