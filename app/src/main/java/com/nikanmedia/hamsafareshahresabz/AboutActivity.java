package com.nikanmedia.hamsafareshahresabz;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by Mahsan on 3/1/2018.
 */

public class AboutActivity extends Activity {
    EditText t1;
    String s;
    TextView t;
    Button btnsms,btnmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        btnsms = (Button) findViewById(R.id.sendsms) ;
        btnmail = (Button) findViewById(R.id.sendmail) ;
       t1 = (EditText) findViewById(R.id.commentsabout);
       // s = t1.getText().toString();
        t = (TextView) findViewById(R.id.txt1);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://telegram.me/shahrdari_kazeroon";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        btnsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s = t1.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "50002010097047"));
                intent.putExtra("sms_body", s);
                startActivity(intent);
            }
        });

        btnmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             sendEmail();
            }
        });
    }


    protected void sendEmail() {
        Log.i("Send email", "");
        s = t1.getText().toString();
        String[] TO = {"Shahrdari.Kazeroon@yahoo.com"};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");


        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "پیام همسفر شهر سبز");
        emailIntent.putExtra(Intent.EXTRA_TEXT,s);

        try {
            startActivity(Intent.createChooser(emailIntent, "اپلیکیشن ارسال ایمیل خود را انتخاب کنید:"));
            finish();
            Log.i("ارسال شد", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(AboutActivity.this,
                    "سرویس گیرنده ارسال ایمیل موجود نیست.", Toast.LENGTH_SHORT).show();
        }
    }

}
