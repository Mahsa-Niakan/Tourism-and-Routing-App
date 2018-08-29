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

public class HotelsActivity extends Activity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        init();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.620046 , 51.640946"));
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=29.627507 , 51.657114"));
                startActivity(i1);
            }
        });
    }
    public void init(){
        b1 = (Button) findViewById(R.id.btnhotel1);
        b2 = (Button) findViewById(R.id.btnhotel2);

    }
}
