package at.viereckig.games.firstgame;

import org.newdawn.slick.Graphics;

public class Rectangle implements Actor{
	
	private int direction;
	private float x;
	private float y;
	private float speed;
	
	
	
	public Rectangle(int x, int y, float speed, String direction) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		if(direction == "right")
			this.direction = 0;
		if(direction == "left")
			this.direction = 1;
	}

	public void render(Graphics graphics) {
		graphics.drawRect(this.x, this.y, 10, 10);
		
	}
	
	public void update(int delta) {
		if(this.direction == 0) {
			this.x += (float)delta/this.speed;
			
			if(this.x>800) {
				this.x=0;
			}
		}
		if(this.direction == 1) {
			this.x -= (float)delta/this.speed;
			
			if(this.x<0) {
				this.x=800;
			}
		}
	}
}
