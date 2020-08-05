import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
Rocketship r;
ArrayList<Projectile> projectiles;
ArrayList<Alien> aliens;
Random random;
public ObjectManager(int x, int y, int width, int height) {
	r = new Rocketship(x,y,width,height);
	projectiles = new ArrayList<Projectile>();
	aliens = new ArrayList<Alien>();
	random = new Random();
}
public void addProjectiles(Projectile pro) {
	projectiles.add(pro);
	
}
public void addAlien(Alien ali) {
	aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
}
public void update() {
	for (int i = 0; i < aliens.size(); i++) {
		aliens.get(i).update();
	}
	for (int i = 0; i < projectiles.size(); i++) {
		projectiles.get(i).update();
	}
}
public void draw(Graphics g) {
	r.draw(g);
}
public void purgeObjects() {
	for (int i = 0; i < aliens.size(); i++) {
		if(aliens.get(i).isActive=false) {
			aliens.remove(i);
		}
	}
	for (int i = 0; i < projectiles.size(); i++) {
		if(projectiles.get(i).isActive=false) {
			projectiles.remove(i);
		}
	}
}
}
