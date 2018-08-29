package com.nikanmedia.hamsafareshahresabz;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mahsan on 3/7/2018.
 */

public class DrogActivity extends Activity {
    Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drog);

        init();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.618432 , 51.647539"));
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.61975 , 51.653311"));
                startActivity(i1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.619314 , 51.653539"));
                startActivity(i1);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.619796 , 51.653568"));
                startActivity(i1);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.62072 , 51.652538"));
                startActivity(i1);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.619731 , 51.653021"));
                startActivity(i1);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.614897 , 51.656127"));
                startActivity(i1);
            }
        });
    }


    public void init(){
        b1 = (Button)findViewById(R.id.btndrog1);
        b2 = (Button)findViewById(R.id.btndrog2);
        b3 = (Button)findViewById(R.id.btndrog3);
        b4 = (Button)findViewById(R.id.btndrog4);
        b5 = (Button)findViewById(R.id.btndrog5);
        b6 = (Button)findViewById(R.id.btndrog6);
        b7 = (Button)findViewById(R.id.btndrog7);
    }
}
