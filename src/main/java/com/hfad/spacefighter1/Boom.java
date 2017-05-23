package com.hfad.spacefighter1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;

/**
 * Created by CzaR on 10/9/2016.
 */


public class Boom {


    //bitmap object
    private Bitmap bitmap;

    //coordinate variables
    private int x;
    private int y;

    //constructor
    public Boom(Context context) {

        //getting boom image from drawable resource
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.boom);

        //setting the coordinate outside the screen
        //so that it won't show up in the screen
        //it will be visible for a fraction of a second
        //after collision
        x = -250;
        y = -250;
    }

    //setter for x and y to make it visible at the place of collision
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Getters
    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


}
