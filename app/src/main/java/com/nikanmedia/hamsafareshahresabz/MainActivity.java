package com.nikanmedia.hamsafareshahresabz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {
    //String arrayName [] = { "tourism", "info","calls","about"};
    CardView b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (CardView) findViewById(R.id.mainbtn1);
        b2 = (CardView) findViewById(R.id.mainbtn2);
        b3 = (CardView) findViewById(R.id.mainbtn3);
        b4 = (CardView) findViewById(R.id.mainbtn4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,TourismActivity.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,EmergencyActivity.class);
                startActivity(i1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,CallActivity.class);
                startActivity(i1);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(i1);
            }
        });
     //ircleMenu circleMenu = (CircleMenu) findViewById(R.id.circle_menu);
     //ircleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.ic_start,R.drawable.ic_end)
     //       .addSubMenu(Color.parseColor("#ffd31c"),R.drawable.ic_map)
     //       .addSubMenu(Color.parseColor("#d91e10"),R.drawable.ic_emergency)
     //       .addSubMenu(Color.parseColor("#00a1f4"),R.drawable.ic_call)
     //       .addSubMenu(Color.parseColor("#506e82"),R.drawable.ic_about)
     //       .setOnMenuSelectedListener(new OnMenuSelectedListener() {
     //           @Override
     //           public void onMenuSelected(int index) {
     //               if (arrayName[index].equals("tourism"))
     //               {
     //                   Intent i1 = new Intent(MainActivity.this,TourismActivity.class);
     //                   startActivity(i1);
     //               }
     //               if (arrayName[index] == "info")
     //               {
     //                   Intent i1 = new Intent(MainActivity.this,EmergencyActivity.class);
     //                   startActivity(i1);
     //               }
     //               if (arrayName[index] == "calls")
     //               {
     //                   Intent i1 = new Intent(MainActivity.this,CallActivity.class);
     //                   startActivity(i1);
     //               }
     //               if (arrayName[index] == "about")
     //               {
     //                   Intent i1 = new Intent(MainActivity.this,AboutActivity.class);
     //                   startActivity(i1);
     //               }
     //           }
     //       });


    }
}
