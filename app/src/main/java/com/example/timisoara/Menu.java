package com.example.timisoara;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.os.Bundle;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import android.net.Uri;

public class Menu extends AppCompatActivity {
    Button btn_teatru,btn_opera,btn_turist,btn_restaurant,btn_feedback,btn_evem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_menu);
        btn_teatru =findViewById(R.id.button1);
        btn_turist =findViewById(R.id.button3);
        btn_restaurant =findViewById(R.id.button4);
        btn_evem =findViewById(R.id.button2);
        btn_feedback =findViewById(R.id.button6);
        btn_opera = findViewById(R.id.button5);
        btn_teatru.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent(Menu.this,Teatru.class);
                startActivity(viewIntent);

            }
        });
        btn_opera.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent(Menu.this,Opera.class);
                startActivity(viewIntent);

            }
        });

        btn_turist.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent(Menu.this,obiective_turistice.class);
                startActivity(viewIntent);

            }
        });
        btn_restaurant.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent(Menu.this,restaurante.class);
                startActivity(viewIntent);

            }
        });

        btn_feedback.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent(Menu.this,FeedBack.class);
                startActivity(viewIntent);

            }
        });

        btn_evem.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent(Menu.this, Tab_Evem.class);
                startActivity(viewIntent);

            }
        });

    }

}
