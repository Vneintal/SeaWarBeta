package com.mygdx.game;

import java.io.Serializable;

import com.badlogic.gdx.graphics.Texture;

public class Affichable implements Serializable{

	//Parametres d'image 
	protected Texture img;
	protected int posX;
	protected int posY;
	protected double angle;
	
	public Affichable(Texture img,int x,int y,double angle){
		this.img=img;
		this.posX=x;
		this.posY=y;
		
		
	}
	
	void afficher(){
		
		
	}
	
}
