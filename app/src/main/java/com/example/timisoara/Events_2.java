package com.example.timisoara;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class Events_2 extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Modelevem> EvemList;
    Button btn_calendar;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_events_main, container, false);
        recyclerView = view.findViewById(R.id.rv);
        btn_calendar =view.findViewById(R.id.calendar);
        EvemList = new ArrayList<>();
        EvemList.add(new Modelevem(R.drawable.streetfood, "STREETFOOD FESTIVAL", "", "21-22\nJune\n2019"));
        EvemList.add(new Modelevem(R.drawable.fete, "FÊTE DE LA MUSIQUE", "", "21-22\nJune\n2019"));
        EvemList.add(new Modelevem(R.drawable.vama, "Concert Vama", "80 lei", "21\nJune\n2019"));

        EvemList.add(new Modelevem(R.drawable.papanasi2, "Festivalul Papanasilor", "40 lei", "23\nJune\n2019"));
        EvemList.add(new Modelevem(R.drawable.bosquito, "Concert Bosquito", "40 lei", "28\nJune\n2019"));
        EvemList.add(new Modelevem(R.drawable.umor, "Festivalul filmului Francez de umor", "", "28-30\nJune\n2019"));




        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        Evem_adapter_2 adapter = new Evem_adapter_2(getContext(), EvemList);
        recyclerView.setAdapter(adapter);



        btn_calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent(getActivity(), Calendar_clasa_events.class);
                startActivity(viewIntent);

            }
        });
        return view;
    }


}
