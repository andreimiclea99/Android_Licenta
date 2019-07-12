package com.example.timisoara;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.Calendar;
import java.util.TimeZone;

public class int_sat extends AppCompatActivity {
    Button btn;
   Button btn_poza;
   ViewFlipper v_f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.muzeul_satului);
        btn_poza = findViewById(R.id.buton2);
        btn = findViewById(R.id.buton);
        v_f = findViewById(R.id.flipperid);


        btn_poza.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Uri uri2 = Uri.parse("http://muzeulsatuluibanatean.ro"); // missing 'http://' will cause crashed
                Intent viewIntent = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(viewIntent);

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Muzeul satului Bănățean");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, "http://muzeulsatuluibanatean.ro/");
                sharingIntent.setPackage("com.facebook.katana");
                startActivity(sharingIntent);
            }
        });


        int images[] = {R.drawable.muze1, R.drawable.muzeu2,R.drawable.muzeu3,R.drawable.muzeu4};

        for (int image : images) {
            flipperImages(image);
        }
    }
        public void flipperImages(int image){
            ImageView imageView=new ImageView( this);
            imageView.setBackgroundResource(image);
            v_f.addView(imageView);
            v_f.setFlipInterval(4000);
            v_f.setAutoStart(true);
            v_f.setInAnimation(this,android.R.anim.slide_in_left);
            v_f.setOutAnimation(this,android.R.anim.slide_out_right);
        }
    }


