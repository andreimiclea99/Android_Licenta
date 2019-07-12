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

public class Events_3_aug extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Modelevem> EvemList;
    Button btn_calendar;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_events_main, container, false);
        recyclerView = view.findViewById(R.id.rv);
        btn_calendar =view.findViewById(R.id.calendar);
        EvemList = new ArrayList<>();
        EvemList.add(new Modelevem(R.drawable.jazztm, "      Jazz TM", "", "5-7\nIulie\n2019"));
        EvemList.add(new Modelevem(R.drawable.in2, " Concert in 2", "30 lei", "13\nIulie\n2019"));
        EvemList.add(new Modelevem(R.drawable.sase, "Festivalul Ceau, Cinema! ", "60 lei", "18-21\nIulie\n2019"));
        EvemList.add(new Modelevem(R.drawable.rolo, "  Rolo Tomassi", "65 lei", "18\nIulie\n2019"));
        EvemList.add(new Modelevem(R.drawable.metropolis, "Caravana Metropolis", "", "29\nIulie\n2019"));



        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        Evem_adapter_aug adapter = new Evem_adapter_aug(getContext(), EvemList);
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
