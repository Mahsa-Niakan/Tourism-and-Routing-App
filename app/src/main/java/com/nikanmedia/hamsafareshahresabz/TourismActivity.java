package com.nikanmedia.hamsafareshahresabz;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by Mahsan on 3/1/2018.
 */

public class TourismActivity extends Activity {
    CardView btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism);

        btn1 = (CardView) findViewById(R.id.tourismbtn1);
        btn2 = (CardView) findViewById(R.id.tourismbtn2);
        btn3 = (CardView) findViewById(R.id.tourismbtn3);
        btn4 = (CardView) findViewById(R.id.tourismbtn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://ibb.co/i0hnEc";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(TourismActivity.this,KazerounActivity.class);
                startActivity(i1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(TourismActivity.this,BestPlaceActivity.class);
                startActivity(i1);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(TourismActivity.this,ContentActivity.class);
                startActivity(i1);
            }
        });
    }
}
