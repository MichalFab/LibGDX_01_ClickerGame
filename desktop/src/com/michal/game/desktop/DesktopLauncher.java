package com.michal.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.michal.game.ClickerGame;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = ClickerGame.GAME_TITLE;
		config.width = ClickerGame.GAME_WIDTH;
		config.height = ClickerGame.GAME_HEIGHT;
		config.resizable = false;

		new LwjglApplication(new ClickerGame(), config);
	}
}
