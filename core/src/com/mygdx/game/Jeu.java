package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Jeu extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Bouton btn1;
	BitmapFont font;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
				
		img = new Texture("../images/bouton_test.png");
		
		font = new BitmapFont();
		font.setColor(Color.BLUE);
		
		InFenDebug.init();	
		
		
		btn1=new Bouton(img, 300, 300, 50, 200, "Test", font);
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		//debut des affichages
		batch.begin();
				
		//batch.draw(img, 0, 0);
		
		btn1.afficher(batch);//
		
		
		InFenDebug.afficher(batch);
		//Fin des affichage
		batch.end();
		
		btn1.angle+=1;
		InFenDebug.println(Integer.toString(btn1.angle));
		
	}
	

	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
