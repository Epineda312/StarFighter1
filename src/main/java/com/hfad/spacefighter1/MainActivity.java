package com.hfad.spacefighter1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //image button
    private ImageButton buttonPlay;
    private ImageButton buttonScore;

    //MediaPlayer variables
    MediaPlayer menuMusic;
    MediaPlayer gameMusic;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting the orientation to landscape
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //getting the button
        buttonPlay = (ImageButton) findViewById(R.id.buttonPlay);
        buttonScore = (ImageButton) findViewById(R.id.buttonScore);

        //adding a click listener
        buttonPlay.setOnClickListener(this);
      //  buttonScore.setOnClickListener(handler1);

        //Plays Menu Music
        menuMusic = MediaPlayer.create(this, R.raw.menumusic);
        menuMusic.start();
    }

    @Override

    public void onClick(View v) {
        //gameMusic Start
        gameMusic = MediaPlayer.create(this, R.raw.gamemusic);
        gameMusic.start();
        //starting game activity
        startActivity(new Intent(this, GameActivity.class));
    }

}