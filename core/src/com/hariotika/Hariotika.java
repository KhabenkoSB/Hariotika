package com.hariotika;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import API.Reconect;
import State.MainState;
import State.State;
import State.StateManager;

public class Hariotika extends ApplicationAdapter {
	private SpriteBatch batch;
	private StateManager sm;
	Reconect reconect = new Reconect();



	public static final int WIDTH = 1920;
	public static final int HEIGHT = 1080;
	public static final String TITLE = "Hariotika";



	@Override
	public void create () {

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+Gdx.app.getGraphics().getWidth());
		System.out.println();
		batch = new SpriteBatch();
		sm = new StateManager();
		sm.push(new MainState(sm));
		reconect.start();

	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sm.update(Gdx.graphics.getDeltaTime());
		sm.render(batch);


	}

	@Override
	public void dispose () {
		batch.dispose();

	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

}
