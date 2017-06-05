package ru.n_develop.escaping;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

/**
 * Created by dim90 on 06.06.2017.
 */

public class PlayButton extends Button
{
	public static final float WIDTH = 160;
	public static final float HEIGHT = 60;

//	private Texture background = new Texture("bg.png");

	MainEscaping screen;
	public static final Drawable drawableDown = new Image(Assets.playHoverButton).getDrawable();
	public static final Drawable drawableUp = new Image(Assets.playButton).getDrawable();



	public PlayButton(final MainEscaping screen) {
		super(drawableDown, drawableUp);

		this.screen = screen;
		setSize(WIDTH, HEIGHT);
		addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				screen.getGame().setScreen(new ChooseLocationScreen(screen.getGame()));
			}
		});
	}
}
