package at.viereckig.test;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Transform;

public class LaunchSite implements Inter{

    public LaunchSite() {
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillRect(400,1080,1000,-300);
        graphics.fillRect(300,1080,-200,-300);
        graphics.setColor(Color.lightGray);
    }

    @Override
    public void update(GameContainer gamecontainer, int delta) {
    }
}
