package com.michal.game.screens;

import com.badlogic.gdx.graphics.Texture;
import com.michal.game.ClickerGame;

public class SplashScreen extends AbstractScreen {

	private Texture SplashTexture;
	
	public SplashScreen(ClickerGame game) {
		super(game);
		init();
		
	}
	
	private void init() {
		// TODO Better asset loading
		SplashTexture = new Texture("badlogic.jpg");
		
	}

	@Override
	public void render(float delta) {
		super.render(delta);
		batch.begin();
		batch.draw(SplashTexture,0,0);
		batch.end();
		
	}

	
	

}
