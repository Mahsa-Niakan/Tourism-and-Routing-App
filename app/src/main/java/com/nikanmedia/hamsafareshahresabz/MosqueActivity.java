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

public class MosqueActivity extends Activity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mosque);
        init();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.632654 , 51.627235"));
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.621975 , 51.641926"));
                startActivity(i1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.621822 , 51.634846"));
                startActivity(i1);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.612618 , 51.653375"));
                startActivity(i1);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.614334 , 51.646165"));
                startActivity(i1);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.619791 , 51.649235"));
                startActivity(i1);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.619427 , 51.648881"));
                startActivity(i1);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.623796 , 51.653423"));
                startActivity(i1);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.625763 , 51.668851"));
                startActivity(i1);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.620274 , 51.661652"));
                startActivity(i1);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.623553 , 51.663669"));
                startActivity(i1);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.621538 , 51.657329"));
                startActivity(i1);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.621785 , 51.654866"));
                startActivity(i1);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.616556 , 51.657267"));
                startActivity(i1);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.61791 , 51.656846"));
                startActivity(i1);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.618708 , 51.653418"));
                startActivity(i1);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.615145 , 51.654367"));
                startActivity(i1);
            }
        });
    }



    public void init(){
        b1 = (Button) findViewById(R.id.btnmosque1);
        b2 = (Button) findViewById(R.id.btnmosque2);
        b3 = (Button) findViewById(R.id.btnmosque3);
        b4 = (Button) findViewById(R.id.btnmosque4);
        b5 = (Button) findViewById(R.id.btnmosque5);
        b6 = (Button) findViewById(R.id.btnmosque6);
        b7 = (Button) findViewById(R.id.btnmosque7);
        b8 = (Button) findViewById(R.id.btnmosque8);
        b9 = (Button) findViewById(R.id.btnmosque9);
        b10 = (Button) findViewById(R.id.btnmosque10);
        b11 = (Button) findViewById(R.id.btnmosque11);
        b12 = (Button) findViewById(R.id.btnmosque12);
        b13 = (Button) findViewById(R.id.btnmosque13);
        b14 = (Button) findViewById(R.id.btnmosque14);
        b15 = (Button) findViewById(R.id.btnmosque15);
        b16 = (Button) findViewById(R.id.btnmosque16);
        b17 = (Button) findViewById(R.id.btnmosque17);
    }
}
