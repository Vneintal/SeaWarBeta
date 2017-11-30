package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
/**
 * 
 * Classe permetant d'afficher des messages a l'ecran (pour debugage uniquement )
 * */
public class InFenDebug {

	public static BitmapFont font=new BitmapFont();
	protected static String msg="";
	
	public static void init(){
		font.setColor(Color.GREEN);
	}
	
	public static void println(String s){
		msg=s+'\n'+msg;
	}
	public static void print(String s){
		msg=s+msg;
	}
	
	public static void afficher(Batch b){
		
		
		font.draw(b,msg,20,200);

	}
	
}
