package at.viereckig.games.firstgame;

import java.util.Random;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Circle implements Actor{
	private enum DIRECTION {RIGHT,DOWN,LEFT,UP};
	private float x,y;
	private float speed;
	private float diameter;
	
	
	
	public Circle() {
		Random random = new Random();
		this.x = random.nextInt(800);
		this.y = random.nextInt(600);
		this.speed = random.nextInt(40)+10;
		this.diameter = random.nextInt(20)+20;
	}

	public void render(Graphics graphics) {
		graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
	}
	
	public void update(GameContainer gameContainer, int delta) {
		this.y += (float)delta/this.speed;
		this.diameter += 0.1;
		if(this.y>600) {
			this.y=0;
		}
	}
	
	
	
}
