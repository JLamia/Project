package info.android.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

import info.android.game.GameG;

/**
 * Created by Евгения on 14.06.2017.
 */

public class PauseScreen implements Screen {

    final GameG game;
    OrthographicCamera camera;
    String startString;
    Texture img, addPause;
    Music StartMusic;
    Music PlayMusic;

    public PauseScreen(GameG game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 685,990);
        img = new Texture("pause.jpg");
        addPause = new Texture("add_pause.png");
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
        game.getBatch().draw(addPause, 50, 100);
        this.startString = "Tap to Continue";
        game.getFont().draw(game.getBatch(), startString, 280, 500);
        StartMusic = Gdx.audio.newMusic(Gdx.files.internal("ACDC - Highway to Hell.mp3"));
        PlayMusic = Gdx.audio.newMusic(Gdx.files.internal("Splin - New People.mp3"));
        StartMusic.play();
        StartMusic.setLooping(true);
        if (Gdx.input.isTouched()) {
            /*whatever you want*/
            img = new Texture("GO.jpg");
            game.getBatch().draw(img, 0, 0);

            StartMusic.dispose();
            PlayMusic.play();
            PlayMusic.setLooping(true);
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

    }
}
