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

public class Events_4_septembrie extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Modelevem> EvemList;
    Button btn_calendar;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_events_main, container, false);
        recyclerView = view.findViewById(R.id.rv);
        btn_calendar =view.findViewById(R.id.calendar);
        EvemList = new ArrayList<>();
        EvemList.add(new Modelevem(R.drawable.begabulevard, "Festivalul Bega Bulevard", "", "7-9\nSeptembire\n2019"));
        EvemList.add(new Modelevem(R.drawable.pla, "PLAI Festival 2019", "78 lei", "13-15\nSeptembrie\n2019"));
        EvemList.add(new Modelevem(R.drawable.coperta2, "Festivalul de muzica veche Timișoara", "", "15\nSeptembire\n2019"));
        EvemList.add(new Modelevem(R.drawable.abba, "ABBA Tribute", "30 lei", "27\nSeptembrie\n2019"));





        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        Evem_adapter_august adapter = new Evem_adapter_august(getContext(), EvemList);
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
