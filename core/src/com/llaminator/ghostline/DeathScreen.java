package info.android.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

import info.android.game.GameG;

class DeathScreen implements Screen {

    final GameG game;
    OrthographicCamera camera;
    String startString;
    Texture img;
    Music StartMusic;
    Music PlayMusic;
    // Texture PlayButton;
    // Texture SoundButton;

    public DeathScreen(final GameG gam) {
        this.game = gam;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 685,990);
        img = new Texture("end.jpg");

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
