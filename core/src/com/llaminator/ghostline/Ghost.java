package com.example.myapplication;//package com.llaminator.ghostline;

/*import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;*/

import android.view.View;

public class Ghost
{
    private static boolean _IsAlive;
    private double _x;
    private double _y;
  //  private View imageView;

    public void Ghost(double _x, double _y){
        //create picture
        _IsAlive = true;
        this._x = _x;
        this._y = _y;
    }

    public double GetX(){
        return _x;
    }

    public double GetY(){
        return _y;
    }

    private void setDeath(){
        _IsAlive = false;
    }

    public boolean IsAlive(){ // ask for next step with redrawing
        return _IsAlive;
    }

    public void Death(){
        setDeath();
        //imageView.animate().translationYBy(100).alpha(0).setDuration(1000); what is it??(
        // smth for death
    }
}
