package com.mygdx.game;

import java.io.Serializable ;

import com.badlogic.gdx.graphics.Texture;


public class Bouton extends Affichable{
	
	protected int lX;
	protected int lY;
	
	private static final long serialVersionUID = 1L;


	public Bouton(Texture img, int px, int py,int lx,int ly) {
		super(img, px, py,0);
		this.lX=lx;
		this.lY=ly;
	}


	
	
}
