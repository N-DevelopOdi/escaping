package ru.n_develop.escaping;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class MainEscaping implements Screen {

	final  Escaping game;
	OrthographicCamera camera;

	public static final int WIDHT = 540;
	public static final int HEIGTH = 900;
	public static final String TITLE = "Свалить ли с пары?";

//	private GameStateManager gsm;
//	private SpriteBatch batch;

	SpriteBatch batch;
	Texture img;
	private Texture background;

	public MainEscaping (Escaping gam)
	{
		this.game = gam;

		background = new Texture("bg.png");
		camera = new OrthographicCamera();
		camera.setToOrtho(false, MainEscaping.WIDHT*2, MainEscaping.HEIGTH*2);
	}




	@Override
	public void show() {

	}


	@Override
	public void render(float delta) {

		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		camera.update();
		game.batch.setProjectionMatrix(camera.combined);
		game.batch.begin();
		game.batch.draw(background, 0,0);
//		game.font.draw(game.batch, "Welcom to drop!", 100, 150);
//		game.font.draw(game.batch, "Touch to start", 100, 100);
		game.batch.end();

//		if(Gdx.input.isTouched())
//		{
//			game.setScreen(new GameScreen(game));
//			dispose();
//		}

	}


	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}


	@Override
	public void hide() {

	}

	@Override
	public void dispose() {

	}
}
