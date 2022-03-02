package at.viereckig.games.firstgame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tests.AnimationTest;

public class Tutorial extends BasicGame{
	private float x;
	private float y;
	private float speedx;
	private float speedy;
	
	
	
	public Tutorial(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub
		arg1.drawRect(this.x, this.y, 100, 100);
		arg1.drawString(getTitle(), 50, 50);
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		this.x=100;
		this.y=100;
		this.speedx=1;
		this.speedy=1;
	}

	@Override
	public void update(GameContainer arg0, int delta) throws SlickException {
		// TODO Auto-generated method stub
		this.x += (float)delta/this.speedx;
		this.y += (float)delta/this.speedy-0.4;
		if(x>800) {
			this.x=-100;
			this.y=0;
		}
	}
	
	public static void main(String[] argv) {
		try {
			AppGameContainer container = new AppGameContainer(new Tutorial("Rectangles"));
			container.setDisplayMode(800,600,false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
