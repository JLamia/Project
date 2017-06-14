package info.android.game;

/**
 * Created by Евгения on 09.06.2017.
 */

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.sun.corba.se.spi.orbutil.fsm.FSM;
import com.sun.corba.se.spi.orbutil.fsm.State;

import sun.rmi.runtime.Log;

import static java.lang.System.*;

/**/
 //* Created by user on 6/8/17.

 class MainMenuScreen implements Screen {

     final GameG game;
     OrthographicCamera camera;
     String startString;
     Texture img;
     Music StartMusic;
     Music PlayMusic;
     // Texture PlayButton;
     // Texture SoundButton;

     public MainMenuScreen(GameG gam) {
         this.game = gam;

         camera = new OrthographicCamera();
         camera.setToOrtho(false, 685,990);
         img = new Texture("menu.jpg");

         // PlayButton = new Texture("playButtonNew");
         //SoundButton = new Texture("soundButtonNew");
     }

     @Override
     public void show() {

     }

     @Override
     public void render(float delta) {
         Gdx.gl.glClearColor(1, 1, 1, 1);
         Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
         game.getBatch().begin();
         game.getBatch().draw(img, 0, 0);
         this.startString = "Tap to Start";
         game.getFont().draw(game.getBatch(), startString , 280, 500);
         StartMusic = Gdx.audio.newMusic(Gdx.files.internal("ACDC - Highway to Hell.mp3"));
         PlayMusic = Gdx.audio.newMusic(Gdx.files.internal("Splin - New People.mp3"));
         StartMusic.play();
         StartMusic.setLooping(true);
         // game.font.draw(PlayButton, 300, 800, 100, 100);
         if(Gdx.input.isTouched()){
             //Gdx.gl.glClearColor(0, 0, 0, 0);
            // Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
            // game.getFont().draw(game.getBatch(),"Go", 200, 100);
             img = new Texture("GO.jpg");
             game.getBatch().draw(img, 0, 0);

            StartMusic.dispose();
             PlayMusic.play();
             PlayMusic.setLooping(true);

             //out.println("OK");
             //something is happening
             //dispose();
         }
         game.getBatch().end();
     }

     @Override
     public void resize(int width, int height) {

     }

     @Override
     public void pause() {

     }

     @Override
     public void resume() {

     }

     @Override
     public void hide() {

     }

     @Override
     public void dispose() {
         img.dispose();
         //game.dispose();
         //game.batch.dispose();

     }
 }
