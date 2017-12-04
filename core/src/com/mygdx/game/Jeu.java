package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


/**Classe s'occupant du rendu*/

public class Jeu extends ApplicationAdapter {
	GameLoop loop;
	SpriteBatch batch;
	Texture img;
	Bouton btn1;
	Label lb1;
	BitmapFont font;
	boolean isClicking;
	
	@Override
	public void create () {
		
		Textures.chargerTextures();
		
		isClicking=false;
		InFenDebug.init();	
		
		loop=new GameLoop("SeaWarUpdate");

		
		
		batch = new SpriteBatch();
		batch.setColor(1,1,1,1);
		
		
		img = new Texture("../images/bouton_test.png");
		
		font = new BitmapFont();
		font.setColor(Color.WHITE);
		
		
		
		lb1=new Label(20,Gdx.graphics.getHeight()-20,"fps",font);
		
		btn1=new Bouton(Textures.WIMG, 200, 300, 50, 200, "Test", font);
		btn1.setColor(0.2f, 0.2f, 0.2f, 1f);
		//btn1.setColor(1, 0, 0, 1);
		
		
		
		loop.start();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		//Gdx.gl.glBlendColor(0, 0, 0, 1);
		
		//debut des affichages
		batch.begin();
				
		//batch.draw(img, 0, 0);
		for(int i=0;i<1;i++){
			btn1.afficher(batch);
		}

		lb1.afficher(batch);
		
		
		InFenDebug.afficher(batch);
		//Fin des affichage
		batch.end();
		
		//btn1.angle+=1;
		
		
	
		
	}
	
	public void gameLoop(){
		lb1.setText("fps:"+Integer.toString(Gdx.graphics.getFramesPerSecond()));
		controles();
		
		
		
	}
	
	
	public void controles(){
		if(Gdx.input.isButtonPressed(0)){
			if(isClicking==false){
				btn1.tryClic(Gdx.input.getX(), Gdx.input.getY());
				isClicking=true;
			}
		}else{
			if(isClicking==true){
				isClicking=false;
			}
		}

	}

	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		loop.stop();//a changer
	}


	public class GameLoop extends Thread{
		
		public GameLoop(String name){
			super(name);
		}
			 
		public void run(){
			while(true){
				gameLoop();

			}
		}
			
	}

}
