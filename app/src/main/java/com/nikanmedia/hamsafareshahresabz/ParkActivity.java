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

public class ParkActivity extends Activity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);
        init();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.62675 , 51.637206"));
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.630659 , 51.630524"));
                startActivity(i1);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.629548 , 51.629218"));
                startActivity(i1);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.624851 , 51.636686"));
                startActivity(i1);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.622952 , 51.638682"));
                startActivity(i1);
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.61035 , 51.645956"));
                startActivity(i1);
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.605673 , 51.6628"));
                startActivity(i1);
            }
        });



        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.617127 , 51.645446"));
                startActivity(i1);
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.624111 , 51.657072"));
                startActivity(i1);
            }
        });


        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.634278 , 51.67591"));
                startActivity(i1);
            }
        });


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.631527 , 51.67518"));
                startActivity(i1);
            }
        });
    }

    public void init(){
        b1 = (Button) findViewById(R.id.btnpark1);
        b2 = (Button) findViewById(R.id.btnpark2);
        b3 = (Button) findViewById(R.id.btnpark3);
        b4 = (Button) findViewById(R.id.btnpark4);
        b5 = (Button) findViewById(R.id.btnpark5);
        b6 = (Button) findViewById(R.id.btnpark6);
        b7 = (Button) findViewById(R.id.btnpark7);
        b8 = (Button) findViewById(R.id.btnpark8);
        b9 = (Button) findViewById(R.id.btnpark9);
        b10 = (Button) findViewById(R.id.btnpark10);
        b11= (Button) findViewById(R.id.btnpark11);
    }
}
