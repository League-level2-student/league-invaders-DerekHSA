import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
    Font titleFont= new Font("Arial", Font.PLAIN, 48);
    Font smallFont= new Font("Arial", Font.PLAIN, 24);
    Font smallerFont= new Font("Arial", Font.PLAIN, 24);
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
public void	updateMenuState() { 
	
	
}
	public void updateGameState() { 
		
		
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
		 
	 }
	 public void drawEndState(Graphics g)  {  
		 g.setColor(Color.RED);
		 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		 g.setFont(titleFont);
		 g.setColor(Color.YELLOW);
		 g.drawString("GAME OVER", 10, 100);
		 
	 }
}
