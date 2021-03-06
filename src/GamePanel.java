import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	Timer frameDraw;
	final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
    Font titleFont;
    Font smallFont;
    Font smallerFont;
    Rocketship r;
    ObjectManager o;
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
	
	}
	public GamePanel() {
		titleFont= new Font("Arial", Font.PLAIN, 48);
		smallFont= new Font("Arial", Font.PLAIN, 24);
		smallerFont= new Font("Arial", Font.PLAIN, 24);
		frameDraw = new Timer(1000/60,this);
		frameDraw.start();
		r=new Rocketship(250,700,50,50);
		o=new ObjectManager(r.x,r.y,r.width,r.height);
	}
public void	updateMenuState() { 
	
	
}
	public void updateGameState() { 
		o.update();
		
	}
public void	 updateEndState()  {  
	
	
}
	 public void drawMenuState(Graphics g) {  
		 
		 g.setColor(Color.BLUE);
		 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		 g.setFont(titleFont);
		 g.setColor(Color.YELLOW);
		 g.drawString("LEAGUE INVADERS", 20, 100);
		 g.setFont(smallFont);
		 g.setColor(Color.YELLOW);
		 g.drawString("Press ENTER to start", 125, 300);
		 g.setFont(smallerFont);
		 g.setColor(Color.YELLOW);
		 g.drawString("Press SPACE for instructions", 80, 600);
		
	 }
	 public void drawGameState(Graphics g) {  
		 g.setColor(Color.BLACK);
		 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		 o.draw(g);
	 }
	 public void drawEndState(Graphics g)  {  
		 g.setColor(Color.RED);
		 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		 g.setFont(titleFont);
		 g.setColor(Color.YELLOW);
		 g.drawString("GAME OVER", 90, 100);
		 g.setFont(smallFont);
		 g.setColor(Color.YELLOW);
		 g.drawString("You killed "+" enemies.", 125, 300);
		 g.setFont(smallerFont);
		 g.setColor(Color.YELLOW);
		 g.drawString("Press ENTER to restart.", 110, 600);
	 }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END){
		    updateEndState();
		}
		repaint();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) {
		        currentState = MENU;
		    } else {
		        currentState++;
		    }
		}
		if(e.getKeyCode()==KeyEvent.VK_W) {
			r.up();
		}
		if(e.getKeyCode()==KeyEvent.VK_A) {
			r.left();
		}
		if(e.getKeyCode()==KeyEvent.VK_S) {
			r.down();
		}
		if(e.getKeyCode()==KeyEvent.VK_D) {
			r.right();
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
