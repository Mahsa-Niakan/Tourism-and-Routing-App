package com.nikanmedia.hamsafareshahresabz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mahsan on 3/3/2018.
 */

public class ContentActivity extends Activity {

    CardView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        init();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,SchoolsActivity.class);
                startActivity(i1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,MosqueActivity.class);
                startActivity(i1);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,RestaurantActivity.class);
                startActivity(i1);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,HotelsActivity.class);
                startActivity(i1);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,ParkingActivity.class);
                startActivity(i1);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,ParkActivity.class);
                startActivity(i1);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,Hospital_Activity.class);
                startActivity(i1);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,DrogActivity.class);
                startActivity(i1);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,WcActivity.class);
                startActivity(i1);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,CngActivity.class);
                startActivity(i1);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,BankActivity.class);
                startActivity(i1);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,UrgentActivity.class);
                startActivity(i1);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,SportActivity.class);
                startActivity(i1);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,EntezamiActivity.class);
                startActivity(i1);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ContentActivity.this,CentersActivity.class);
                startActivity(i1);
            }
        });
    }

    public void init(){
        btn1 = (CardView) findViewById(R.id.cardeskan);
        btn2 = (CardView) findViewById(R.id.cardmosque);
        btn3 = (CardView) findViewById(R.id.cardrestaurant);
        btn4 = (CardView) findViewById(R.id.cardrhotels);
        btn5 = (CardView) findViewById(R.id.cardparking);
        btn6 = (CardView) findViewById(R.id.cardparks);
        btn7 = (CardView) findViewById(R.id.cardhospital);
        btn8 = (CardView) findViewById(R.id.carddrogstore);
        btn9 = (CardView) findViewById(R.id.cardwc);
        btn10 = (CardView) findViewById(R.id.cardcng);
        btn11= (CardView) findViewById(R.id.cardbank);
        btn12 = (CardView) findViewById(R.id.cardurgent);
        btn13 = (CardView) findViewById(R.id.cardsport);
        btn14 = (CardView) findViewById(R.id.cardnezami);
        btn15 = (CardView) findViewById(R.id.cardcallcenter);
    }
}
