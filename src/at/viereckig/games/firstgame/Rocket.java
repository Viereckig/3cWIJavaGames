package at.viereckig.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Rocket implements Actor {
	private Image rocketImage;
	private float x,y;
	
	
	public Rocket() throws SlickException {
		Image tmp = new Image("testdata/Rocket1.png");
		this.rocketImage = tmp.getScaledCopy(50, 50);
		this.x = 100;
		this.y = 100;
	}
	
	@Override
	public void render(Graphics graphics) {
		rocketImage.draw(this.x, this.y);
	}

	@Override
	public void update(GameContainer gameContainer, int delta) {
		if(gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
			this.x++;
		}
		
		if(gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
			this.x--;
		}
		
		if(gameContainer.getInput().isKeyDown(Input.KEY_UP)) {
			this.y--;
		}
		
		if(gameContainer.getInput().isKeyDown(Input.KEY_DOWN)) {
			this.y++;
		}
		
		
		
		
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	
	
	
}
