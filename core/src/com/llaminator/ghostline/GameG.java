package info.android.game;

/**
 * Created by Евгения on 09.06.2017.
 */

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


// Created by user on 6/8/17.

public class GameG extends Game {
    @Override
    public void create(){
        mBatch = new SpriteBatch();
        mFont = new BitmapFont();
        this.setScreen(new MainMenuScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
        mBatch.dispose();
        mFont.dispose();
    }

    public SpriteBatch getBatch () {return mBatch;}
    public BitmapFont getFont () {return mFont;}

    private SpriteBatch mBatch;
    private BitmapFont mFont;

}
