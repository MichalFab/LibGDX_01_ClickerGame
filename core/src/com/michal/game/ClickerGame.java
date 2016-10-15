package com.michal.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.michal.game.screens.SplashScreen;

public class ClickerGame extends Game {
	
	public static final String GAME_TITLE = "Gra - Clicker";
	public static int GAME_WIDTH = 480;
	public static int GAME_HEIGHT = 700;
	
	
	private boolean paused;
	
	
	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}

	@Override
	public void create () {
	this.setScreen(new SplashScreen(this));
	}

	
	
	
}
