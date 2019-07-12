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

public class Events_3_august extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Modelevem> EvemList;
    Button btn_calendar;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_events_main, container, false);
        recyclerView = view.findViewById(R.id.rv);
        btn_calendar =view.findViewById(R.id.calendar);
        EvemList = new ArrayList<>();
        EvemList.add(new Modelevem(R.drawable.ziua, "    Ziua Timișoarei ", "", "1-4\nAugust\n2019"));
        EvemList.add(new Modelevem(R.drawable.tiff, " Caravana Tiff", "", "\nAugust\n2019"));
        EvemList.add(new Modelevem(R.drawable.tango, "Tango Jazz Quartet", "20 lei", "15\nAugust\n2019"));
        EvemList.add(new Modelevem(R.drawable.boat, "  Rock the Boat", "", "19\nAugust\n2019"));




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
