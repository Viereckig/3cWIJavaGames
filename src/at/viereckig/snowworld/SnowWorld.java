package at.viereckig.snowworld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import at.viereckig.games.firstgame.ObjectsDemo;

public class SnowWorld extends BasicGame{
	private List<Actor> snowflakes;
	
	
	public SnowWorld(String title) {
		super(title);
	}

	

	@Override
	public void render(GameContainer arg0, Graphics graphics) throws SlickException {
		for (Actor flake : this.snowflakes) {
			flake.render(graphics);
		}
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		this.snowflakes = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			this.snowflakes.add(new Snowflake(Snowflake.SIZE.BIG));
			this.snowflakes.add(new Snowflake(Snowflake.SIZE.MEDIUM));
			this.snowflakes.add(new Snowflake(Snowflake.SIZE.SMALL));
			
		}
	}

	@Override
	public void update(GameContainer arg0, int delta) throws SlickException {
		for (Actor flake : this.snowflakes) {
			flake.update(delta);
		}
	}

	public static void main(String[] argv) {
		try {
			AppGameContainer container = new AppGameContainer(new SnowWorld("Snow World"));
			container.setDisplayMode(800,600,false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	
}
