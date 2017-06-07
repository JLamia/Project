package com.llaminator.ghostline;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Ghost
{
  public static boolean IsAlive = true;
  
  public void setIsNotAlive(){
    IsAlive = false;
  }
  
  public NextStep(){ // ask for next step with redrawing
    return isAlive;
  }
  
  public void Death(){
     imageView.animate().translationYBy(100).alpha(0).setDuration(1000);
     // smth for death
  }
}
