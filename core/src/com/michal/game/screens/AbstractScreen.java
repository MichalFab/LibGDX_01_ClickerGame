package com.michal.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.michal.game.ClickerGame;

public abstract class AbstractScreen implements Screen {

	protected SpriteBatch batch;
	protected ClickerGame game;
	protected Stage stage;
	private OrthographicCamera camera;

	public AbstractScreen(ClickerGame game) {
		this.game = game;
		createCamera();
		stage  = new Stage(new StretchViewport(ClickerGame.GAME_WIDTH, ClickerGame.GAME_HEIGHT,camera));
		batch = new SpriteBatch();
		Gdx.input.setInputProcessor(stage);
	}

	private void createCamera() {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, ClickerGame.GAME_WIDTH, ClickerGame.GAME_HEIGHT);
		camera.update();

	}

	@Override
	public void render(float delta) {
		clearScreen();
		camera.update();
		batch.setProjectionMatrix(camera.combined);

	}

	private void clearScreen() {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}

	public void show() {
	}

	public void hide() {
	}

	public void resume() {
		game.setPaused(false);
	}

	public void pause() {
		game.setPaused(true);

	}

	public void resize(int width, int height) {

	}

	public void dispose() {
		game.dispose();
	}

}
