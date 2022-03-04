package at.viereckig.test;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class Main extends BasicGame {
    public Main(String title) {
        super(title);
    }
    private List<Inter> inter;

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.inter = new ArrayList<Inter>();
        LaunchSite launchSite = new LaunchSite();
        inter.add(launchSite);

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        for (Inter inter : inter){
            inter.update(gameContainer, i);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.setBackground(new Color(63,166,214));
        for (Inter inter : inter){
            inter.render(graphics);
        }
    }
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Main("SmortFlightSimulator"));
            container.setDisplayMode(1920, 1080, true);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
