package com.example.timisoara;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class obiective_turistice extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<MoldelTuristic> turistList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turistic_adapter);

        recyclerView = findViewById(R.id.rv);
        turistList = new ArrayList<>();
        turistList.add(new MoldelTuristic(R.drawable.muzeul_satului,"Muzeul Satului",
                "Muzeu de arhitectură în aer liber care documentează viața satului banatean cu case tradiționale."));
        turistList.add(new MoldelTuristic(R.drawable.cat1,"Catedrala Orthodoxa","Cea mai frumoasa catedrala din Timisoara, realizata in stil Byzantin."));
        turistList.add(new MoldelTuristic(R.drawable.pt1,"Piata Unirii","Piața Unirii este cea mai veche piață din Timișoara, amenajată în stil baroc De-a lungul istoriei sale piața s-a numit și Hauptplatz (Piața Principală)."));
        turistList.add(new MoldelTuristic(R.drawable.bastion,"Bastionul Theresia","Bastionul Theresia este singurul bastion care mai există din cetatea Timișoarei."));
        turistList.add(new MoldelTuristic(R.drawable.tb1,"Palatul Baroque","Palatul Vechii Prefecturi, denumit și „Palatul Baroc”, reprezintă unul dintre cele mai valoroase monumente istorice ale Timișoarei."));
        turistList.add(new MoldelTuristic(R.drawable.pv1,"Piata Victoriei","Piața Victoriei este una din piețele centrale ale municipiului Timișoara, locul în care Timișoara a fost proclamată în 1989 primul oraș liber din România."));




        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        turisticAdapter adapter = new turisticAdapter(this,turistList);
        recyclerView.setAdapter(adapter);

    }
}
