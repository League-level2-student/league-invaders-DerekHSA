import java.awt.Frame;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	GamePanel gp ;
	public static final int HEIGHT = 800;
	public static final int WIDTH = 500;
	public static void main(String[] args) {
		LeagueInvaders li = new LeagueInvaders();
		li.setup();
		
	}
	
	public LeagueInvaders() {
		frame = new JFrame();
		gp = new GamePanel();
		
	}
	public void setup(){
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gp);
		frame.addKeyListener(gp);
	 }
}
