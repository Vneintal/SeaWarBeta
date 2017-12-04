package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**Classe des boutons*/
public class Bouton extends Affichable{
	
	String text;
	BitmapFont font;
	private static final long serialVersionUID = 1L;


	public Bouton(Texture img, int px, int py,int lx,int ly,String text,BitmapFont font) {
		super(img, px, py,0);
		this.lY=lx;
		this.lX=ly;
		
		this.text=text;
		this.font=font;
	}
	
	@Override
	public boolean afficher(Batch b){
		
		
		super.afficher(b);
		try {
			font.draw(b,text, (posY+lY/2), (posX+lX/2));
			return true;
		} catch (Exception e) {
			return false;

		}
	}
	/**clic sur le bouton si la souris est au bonne endrois
	 * -retourne true si il y a un clic
	 * -retourne false sinon
	 * */
	public boolean tryClic(int mouseX,int mouseY){
		System.out.println("("+Integer.toString(mouseX)+","+Integer.toString(mouseY)+")");
		if(posX<=mouseX && mouseX<=posX+lX){
			if(posY<=mouseY && mouseY<=posY+lY){
				actionOnClic();
				return true;
			}
		}
	
		return false;
		
	}
	
	/**Action effectu� lors d'un clic sur le bouton*/
	private void actionOnClic(){
		InFenDebug.println("Clic sur bouton 1");
	}
	
}
