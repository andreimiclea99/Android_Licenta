package com.example.timisoara;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class int_baroque extends AppCompatActivity {
    Button btn;
   Button btn_poza;
   ViewFlipper v_f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baroque);
        btn_poza = findViewById(R.id.buton2);
        btn = findViewById(R.id.buton);
        v_f = findViewById(R.id.flipperid);


        btn_poza.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Uri uri2 = Uri.parse("http://roamingromania.com/baroque-palace-art-museum-timisoara/"); // missing 'http://' will cause crashed
                Intent viewIntent = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(viewIntent);

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Palatul Baroc din Timișoara");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, "http://roamingromania.com/baroque-palace-art-museum-timisoara/");
                sharingIntent.setPackage("com.facebook.katana");
                startActivity(sharingIntent);
            }
        });


        int images[] = {R.drawable.b1, R.drawable.b2,R.drawable.b3};

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


