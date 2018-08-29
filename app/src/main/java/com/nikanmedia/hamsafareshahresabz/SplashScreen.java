package com.nikanmedia.hamsafareshahresabz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by Mahsan on 2/28/2018.
 */

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

      //  RelativeLayout l =(RelativeLayout) findViewById(R.id.rootLayout);
       // AnimationDrawable ad = (AnimationDrawable) l.getBackground();
        //ad.setEnterFadeDuration(2000);
        //ad.setExitFadeDuration(3000);
        //ad.start();
        Thread time_control = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent i1 = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(i1);
                }
            }
        };
        time_control.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
