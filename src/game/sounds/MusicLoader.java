package game.sounds;

import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;

public class MusicLoader {

	private static Music music;

	public static void loadMusic() throws SlickException {
		music = new Music("");
	}

	public static void playMusic() {
		if (!music.playing()) {
			music.play();
			music.loop();
			music.playing();
		}
	}

	public static void pauseMusic() {
		music.pause();
	}

	public static void resumeMusic() {
		music.resume();
	}

}
