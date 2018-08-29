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

public class WcActivity extends Activity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wc);
        init();


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.630987 , 51.628843"));
                startActivity(i1);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.626703 , 51.636466"));
                startActivity(i1);
            }
        });



        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.620889 , 51.637657"));
                startActivity(i1);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.603628 , 51.656226"));
                startActivity(i1);
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.60459 , 51.663428"));
                startActivity(i1);
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.608965 , 51.656627"));
                startActivity(i1);
            }
        });


        //////////////////////////parks



        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.629548 , 51.629218"));
                startActivity(i1);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.624851 , 51.636686"));
                startActivity(i1);
            }
        });




        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.61035 , 51.645956"));
                startActivity(i1);
            }
        });





        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.617127 , 51.645446"));
                startActivity(i1);
            }
        });


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.624111 , 51.657072"));
                startActivity(i1);
            }
        });


        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.634278 , 51.67591"));
                startActivity(i1);
            }
        });


        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.631527 , 51.67518"));
                startActivity(i1);
            }
        });
    }
    public void init(){
        b1 = (Button)findViewById(R.id.btnwc1);
        b2 = (Button)findViewById(R.id.btnwc2);
        b3 = (Button)findViewById(R.id.btnwc3);
        b4 = (Button)findViewById(R.id.btnwc4);
        b5 = (Button)findViewById(R.id.btnwc5);
        b6 = (Button)findViewById(R.id.btnwc6);
        b7 = (Button)findViewById(R.id.btnwc7);
        b8 = (Button)findViewById(R.id.btnwc8);
        b9 = (Button)findViewById(R.id.btnwc9);
        b10 = (Button)findViewById(R.id.btnwc10);
        b11 = (Button)findViewById(R.id.btnwc11);
        b12 = (Button)findViewById(R.id.btnwc12);
        b13 = (Button)findViewById(R.id.btnwc13);
    }
}
