package at.viereckig.snowworld;

import java.util.Random;

import org.newdawn.slick.Graphics;

public class Snowflake implements Actor{
	public enum SIZE {BIG, SMALL, MEDIUM};
	private float x,y;
	private int size;
	private float speed;
	private Random random;
	
	public Snowflake(SIZE size) {
		this.random = new Random();
		
		if (size==SIZE.BIG) {
			this.size = 12;
			this.speed = 2;
		}
		if (size==SIZE.SMALL) {
			this.size = 5;
			this.speed = 1;
		}
		if (size==SIZE.MEDIUM) {
			this.size = 8;
			this.speed = (float) 1.5;
		}
		
		setrandomp();
	}
	
	private void setrandomp() {
		this.x = this.random.nextInt(800);
		this.y = this.random.nextInt(600)-600;
	}
	
	@Override
	public void render(Graphics graphics) {
		graphics.fillOval(this.x, this.y, this.size, this.size);
	
	}

	@Override
	public void update(int delta) {
		this.y += (float)delta/this.speed;
		if(this.y>600) {
			setrandomp();
		}
	}

}
