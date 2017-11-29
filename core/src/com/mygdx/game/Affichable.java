package com.mygdx.game;

import java.io.Serializable;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Affichable implements Serializable{

	
	private static final long serialVersionUID = 1L;
	//Parametres d'image 
	protected Texture img;
	protected int posX;
	protected int posY;
	protected int lX;
	protected int lY;
	protected int angle;
	
	public Affichable(Texture img,int x,int y,double angle){
		this.img=img;
		this.posX=x;
		this.posY=y;
		this.lX=1;
		this.lY=1;
		
		
	}
	
	void afficher(Batch b){
		Sprite s=new Sprite(img);
		s.rotate(angle);
		s.setOrigin(lX/2,lY/2);
		s.setBounds(posX, posY, lX, lY);
		s.draw(b);
		
		//b.draw(img, posX, posY, lX, lY);
	}

	
	
	
}
