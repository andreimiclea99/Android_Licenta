package com.example.timisoara;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class restaurante extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ModelRestaurant> restaurantList;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_main);
        recyclerView = findViewById(R.id.rv);
        restaurantList = new ArrayList<>();
        restaurantList.add(new ModelRestaurant(R.drawable.jack,"Jack Bistro",4.5));
        restaurantList.add(new ModelRestaurant(R.drawable.crafut,"Craft Rooftop",4.0));
        restaurantList.add(new ModelRestaurant(R.drawable.homemade2,"Homemade",4.5));
        restaurantList.add(new ModelRestaurant(R.drawable.skyy,"Sky",4.0));
        restaurantList.add(new ModelRestaurant(R.drawable.merlut,"Merlot",4.5));
        restaurantList.add(new ModelRestaurant(R.drawable.musi,"Musi",4.8));
        restaurantList.add(new ModelRestaurant(R.drawable.strat,"Stradivarius",4.7));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        restaurant_adapter adapter = new restaurant_adapter(this,restaurantList);
        recyclerView.setAdapter(adapter);
    }
}
