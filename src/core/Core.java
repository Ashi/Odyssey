package core;

import game.Game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Core {

	public static void main(String[] args) {
		try {
			AppGameContainer container = new AppGameContainer(new Game());

			container.setDisplayMode(800, 640, false);
			container.setVSync(true);
			container.start();

		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
