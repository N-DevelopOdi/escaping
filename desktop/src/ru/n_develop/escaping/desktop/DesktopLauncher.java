package ru.n_develop.escaping.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import ru.n_develop.escaping.Escaping;
import ru.n_develop.escaping.MainEscaping;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = MainEscaping.HEIGTH;
		config.width = MainEscaping.WIDHT;
		config.title = MainEscaping.TITLE;
		new LwjglApplication(new Escaping(), config);
	}
}
