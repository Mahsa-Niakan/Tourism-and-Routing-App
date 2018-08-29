package com.nikanmedia.hamsafareshahresabz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by Mahsan on 3/1/2018.
 */

public class EmergencyActivity extends Activity {
    CardView btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        init();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(EmergencyActivity.this,CprActivity.class);
                startActivity(i1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(EmergencyActivity.this,SnakeActivity.class);
                startActivity(i1);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(EmergencyActivity.this,BreakActivity.class);
                startActivity(i1);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(EmergencyActivity.this,SamActivity.class);
                startActivity(i1);
            }
        });

    }

    public void init(){
        btn1 = (CardView) findViewById(R.id.emergencybtn1);
        btn2 = (CardView) findViewById(R.id.emergencybtn2);
        btn3 = (CardView) findViewById(R.id.emergencybtn3);
        btn4 = (CardView) findViewById(R.id.emergencybtn4);


    }
}
