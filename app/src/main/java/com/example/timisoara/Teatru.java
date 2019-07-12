package com.example.timisoara;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Calendar;

public class Teatru extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ModelTeatru> teatruList;
    ArrayList<String> mNames;
    ArrayList<String> mImage;
    Button btn_calendar;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teatru);
        //getSupportActionBar().hide();
        btn_calendar =findViewById(R.id.calendar);
        recyclerView = findViewById(R.id.rv);

        teatruList = new ArrayList<>();
        teatruList.add(new ModelTeatru(R.drawable.f0,"The Fragrance of Time","","18\n June\n2019"));
        teatruList.add(new ModelTeatru(R.drawable.eu1,"Europa","20 lei","19\n June\n2019"));
        teatruList.add(new ModelTeatru(R.drawable.uitare,"În umbra uitării","20 lei","21\n June\n2019"));
        teatruList.add(new ModelTeatru(R.drawable.alba,"Albă-ca-Zăpada","20 lei","26\n June\n2019"));


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        TeatruAdapter adapter = new TeatruAdapter(this,teatruList,mNames,mImage);
        recyclerView.setAdapter(adapter);
        btn_calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent(Teatru.this, Calendar_clasa_2.class);
                startActivity(viewIntent);

            }
        });




    }
}
