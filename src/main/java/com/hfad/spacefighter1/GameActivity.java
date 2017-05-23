package com.hfad.spacefighter1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.widget.ImageButton;

public class GameActivity extends AppCompatActivity {

    //declaring GameView
    private GameView gameView;

    //MediaPlayer variables
    MediaPlayer menuMusic;
    MediaPlayer gameMusic;


    //image button
    private ImageButton buttonPlay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Getting display object
        Display display = getWindowManager().getDefaultDisplay();

        //Getting the screen resolution into point object
        Point size = new Point();
        display.getSize(size);

        //Initializing game view object
        //this time we are also passing the screen size to the GameView constructor
        gameView = new GameView(this, size.x, size.y);

        //adding it to contentview
        setContentView(gameView);
    }

    //pausing the game when activity is paused
    @Override
    protected void onPause() {
        super.onPause();
        gameView.pause();
    }

    //running the game when activity is resumed
    @Override
    protected void onResume() {
        super.onResume();
        gameView.resume();
    }
    @Override
    public void onBackPressed(){
        this.finish();
        gameMusic = MediaPlayer.create(this, R.raw.gamemusic);
        gameMusic.stop();
        startActivity(new Intent(this, MainActivity.class));


    }

}