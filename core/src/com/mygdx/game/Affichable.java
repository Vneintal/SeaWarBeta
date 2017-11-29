package com.mygdx.game;

import java.io.Serializable;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Affichable implements Serializable{

	
	private static final long serialVersionUID = 1L;
	//Parametres d'image 
	protected Texture img;
	protected int posX;
	protected int posY;
	protected int lX;
	protected int lY;
	protected double angle;
	
	public Affichable(Texture img,int x,int y,double angle){
		this.img=img;
		this.posX=x;
		this.posY=y;
		this.lX=10;
		this.lY=10;
		
		
	}
	
	void afficher(Batch b){
		//Sprite s=new Sprite(img,posX,posY,lX,lY);
		//s.draw(b);
		b.draw(img, posX, posY, lX, lY);
	}


	
}
