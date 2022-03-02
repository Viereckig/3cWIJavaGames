package at.viereckig.games.firstgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.management.loading.PrivateClassLoader;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class ObjectsDemo extends BasicGame{
	private List<Actor> actors;
	
	
	
	
	public ObjectsDemo(String title) {
		super(title);
	}
	
	
	
	public static void main(String[] argv) {
		try {
			AppGameContainer container = new AppGameContainer(new ObjectsDemo("Objects Demo"));
			container.setDisplayMode(800,600,false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	@Override
	public void render(GameContainer arg0, Graphics graphics) throws SlickException {
		for (Actor actor:this.actors) {
			actor.render(graphics);
		}
		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		this.actors = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			Rectangle rectangle = new Rectangle(random.nextInt(800), random.nextInt(600), random.nextInt(50), "left");
			this.actors.add(rectangle);
		}
		for (int i = 0; i < 10; i++) {
			Circle circle = new Circle();
			this.actors.add(circle);
		}
		
		for (int i = 0; i < 10; i++) {
			Ellipse ellipse = new Ellipse();
			this.actors.add(ellipse);
		}
		
	}

	@Override
	public void update(GameContainer arg0, int delta) throws SlickException {
		
		for (Actor actor:this.actors) {
			actor.update(delta);
		}

	}
}
