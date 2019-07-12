package com.example.timisoara;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class EventsMain extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Modelevem> EvemList;
    Button btn_calendar;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_events_main, container, false);
        recyclerView = view.findViewById(R.id.rv);
        btn_calendar=view.findViewById(R.id.calendar);
        EvemList = new ArrayList<>();
        EvemList.add(new Modelevem(R.drawable.pla, "PLAI Festival 2019", "78 lei", "13-15\nSeptembrie\n2019"));
        EvemList.add(new Modelevem(R.drawable.alifantis, "   Alifantis", " 69 lei", "13\nOctombrie\n2019"));
        EvemList.add(new Modelevem(R.drawable.begabulevard, "Festivalul Bega Bulevard", "Gratis", "7-9\nSeptembire\n2019"));
        EvemList.add(new Modelevem(R.drawable.jazztm, "   Jazz TM", "", "5-7\nIulie\n2019"));
        EvemList.add(new Modelevem(R.drawable.streetfood, "Street Food Festival", "", "20-23\nJune\n2019"));
        EvemList.add(new Modelevem(R.drawable.beer, "Craft Beer Festival", " 69 lei", "15\nIunie\n2019"));


        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        Evem_adapter adapter = new Evem_adapter(getContext(), EvemList);
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
