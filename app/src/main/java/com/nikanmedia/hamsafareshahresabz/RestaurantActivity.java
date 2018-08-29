package com.nikanmedia.hamsafareshahresabz;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mahsan on 3/6/2018.
 */

public class RestaurantActivity extends Activity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        init();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.618779 , 51.65449"));
                startActivity(i1);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.627899 , 51.66486"));
                startActivity(i1);
            }
        });



        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.626836 , 51.663197"));
                startActivity(i1);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.610635 , 51.646725"));
                startActivity(i1);
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.627412 , 51.633379"));
                startActivity(i1);
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.624875 , 51.631699"));
                startActivity(i1);
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.605243 , 51.652549"));
                startActivity(i1);
            }
        });


        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.60962 , 51.647742"));
                startActivity(i1);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.624812 , 51.660419"));
                startActivity(i1);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.611568 , 51.645827"));
                startActivity(i1);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.620204 , 51.635463"));
                startActivity(i1);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.617831 , 51.648209"));
                startActivity(i1);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.626281 , 51.6464"));
                startActivity(i1);
            }
        });

    }


    public void init(){
        b1 = (Button) findViewById(R.id.btnrestaurant1);
        b2 = (Button) findViewById(R.id.btnrestaurant2);
        b3 = (Button) findViewById(R.id.btnrestaurant3);
        b5 = (Button) findViewById(R.id.btnrestaurant5);
        b6 = (Button) findViewById(R.id.btnrestaurant6);
        b8 = (Button) findViewById(R.id.btnrestaurant8);
        b9 = (Button) findViewById(R.id.btnrestaurant9);
        b10 = (Button) findViewById(R.id.btnrestaurant10);
        b11 = (Button) findViewById(R.id.btnrestaurant11);
        b12 = (Button) findViewById(R.id.btnrestaurant12);
        b13 = (Button) findViewById(R.id.btnrestaurant13);
        b14 = (Button) findViewById(R.id.btnrestaurant14);
        b15 = (Button) findViewById(R.id.btnrestaurant15);
    }
}
