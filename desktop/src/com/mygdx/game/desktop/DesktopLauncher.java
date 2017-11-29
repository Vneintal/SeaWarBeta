package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Jeu;
/**
 * 
 * Cette classe permet de Lancer le jeu sous windows
 * 
 * */
public class DesktopLauncher {
	public static void main (String[] arg) {
		
		
		//Configuration de la fenetre
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.height=400;
		config.width=600;
		
		config.title="Sea-War";
		
		
		//Lancement du jeu
		new LwjglApplication(new Jeu(), config);
	}
}
