package com.nikanmedia.hamsafareshahresabz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by Mahsan on 3/3/2018.
 */

public class BestPlaceActivity extends Activity {
    CardView c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestplace);
        c1 = (CardView) findViewById(R.id.cardnature);
        c2 = (CardView) findViewById(R.id.cardhistory);
        c3 = (CardView) findViewById(R.id.cardmazhabi) ;
        c4 = (CardView) findViewById(R.id.cardhistorytwo) ;
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(BestPlaceActivity.this,NaturePlaceActivity.class);
                startActivity(i1);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(BestPlaceActivity.this,HistoryplaceActivity.class);
                startActivity(i1);
            }
        });


        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(BestPlaceActivity.this,MazhabiPlaceActivity.class);
                startActivity(i1);
            }
        });


        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(BestPlaceActivity.this,NaturePlaceTwoActivity.class);
                startActivity(i1);
            }
        });



    }
}
