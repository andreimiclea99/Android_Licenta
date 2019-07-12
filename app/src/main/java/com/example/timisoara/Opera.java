package com.example.timisoara;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.TimeZone;

public class Opera extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<MoldelOpera> operaList;
    Button btn_calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adaptar_opera);
        btn_calendar =findViewById(R.id.calendar);
        recyclerView = findViewById(R.id.rv);
        //getSupportActionBar().hide();
        operaList = new ArrayList<>();
        /*operaList.add(new MoldelOpera(R.drawable.op1,"Coppélia","11\nIunie\n2019",""));
        operaList.add(new MoldelOpera(R.drawable.op2,"Spărgătorul de nuci","12\nIunie\n2019",""));*/
        operaList.add(new MoldelOpera(R.drawable.op3,"Spectacol in memoriam Adriana Gâdea","16\nIunie\n2019",""));
        operaList.add(new MoldelOpera(R.drawable.bal,"Bal Mascat","19\nIunie\n2019","50 lei"));
        operaList.add(new MoldelOpera(R.drawable.venetia,"Frumos e în septembrie la Veneția","23\nSeptembrie\n2019","80 lei"));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        OperaAdapter adapter = new OperaAdapter(this,operaList);
        recyclerView.setAdapter(adapter);

        btn_calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent(Opera.this, Calendar_clasa.class);
                startActivity(viewIntent);

            }
        });

    }
}
