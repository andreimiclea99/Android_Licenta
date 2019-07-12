package com.example.timisoara;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class restaurant_adapter extends RecyclerView.Adapter<restaurant_adapter.ViewHolder> {

    private Context mContext;
    private ArrayList<ModelRestaurant> mlist;
    restaurant_adapter(Context context, ArrayList<ModelRestaurant> list){
        mContext = context;
        mlist=list;

    }
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,  int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.rv_restaurant,viewGroup, false);
        restaurant_adapter.ViewHolder viewHolder = new restaurant_adapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        ImageView image = viewHolder.item_image;
        ModelRestaurant restaurantItem= mlist.get(i);
        final TextView titlu, valoare;
        RatingBar ra;
        titlu = viewHolder.titlu;
        valoare= viewHolder.valoare;
        ra = viewHolder.rat;
        String nota=Double.toString(restaurantItem.getValoare());
        image.setImageResource(restaurantItem.getImage());
        titlu.setText(restaurantItem.getName());
        valoare.setText(nota);

        if(i==0){
            ra.setRating(Float.parseFloat(nota));
        }else if (i==1){
            ra.setRating(Float.parseFloat(nota));
        }else if (i==2){
            ra.setRating(Float.parseFloat(nota));
        }else if (i==3){
            ra.setRating(Float.parseFloat(nota));
        }else if (i==4){
            ra.setRating(Float.parseFloat(nota));
        }
        else if (i==5){
            ra.setRating(Float.parseFloat(nota));
        }else if (i==6){
            ra.setRating(Float.parseFloat(nota));
        }

        viewHolder.buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(i){
                    case 0:
                        String uri = String.format(Locale.ENGLISH, "geo:0,0?q= Jack Bistro Timisoara");
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                        mContext.startActivity(intent);
                        break;

                    case 1:
                        String uri2 = String.format(Locale.ENGLISH, "geo:0,0?q= Craft Rooftop Timisoara");
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri2));
                        mContext.startActivity(intent2);
                        break;

                    case 2:
                        String uri3 = String.format(Locale.ENGLISH, "geo:0,0?q= Restaurant Homemade Timisoara");
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri3));
                        mContext.startActivity(intent3);
                        break;
                    case 3:
                        String uri4 = String.format(Locale.ENGLISH, "geo:0,0?q= Restaurant Sky Timisoara");
                        Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri4));
                        mContext.startActivity(intent4);
                        break;
                    case 4:
                        String uri5 = String.format(Locale.ENGLISH, "geo:0,0?q= Restaurant Merlot Timisoara");
                        Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri5));
                        mContext.startActivity(intent5);
                        break;

                }
            }
        });

        viewHolder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(i){
                    case 0:
                        Uri uri = Uri.parse("https://www.facebook.com/jacksbistrotm/"); // missing 'http://' will cause crashed
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        mContext.startActivity(intent);
                        break;

                    case 1:
                        Uri uri2 = Uri.parse("https://craft-rooftop.business.site/"); // missing 'http://' will cause crashed
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                        mContext.startActivity(intent2);
                        break;

                    case 2:
                        Uri uri3 = Uri.parse("https://www.facebook.com/Homemadetimisoara/"); // missing 'http://' will cause crashed
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                        mContext.startActivity(intent3);
                        break;
                    case 3:
                        Uri uri4 = Uri.parse("https://sky.restaurant/v/"); // missing 'http://' will cause crashed
                        Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                        mContext.startActivity(intent4);
                        break;
                    case 4:
                        Uri uri5 = Uri.parse("https://www.facebook.com/Merlot.Restaurant/?utm_source=tripadvisor&utm_medium=referral"); // missing 'http://' will cause crashed
                        Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
                        mContext.startActivity(intent5);
                        break;

                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView item_image;
        CardView card;
        Button buton;
        TextView titlu;
        TextView valoare;
        RatingBar rat;
        public ViewHolder(View itemView){
            super (itemView);

            item_image = itemView.findViewById(R.id.icon);

            titlu = itemView.findViewById(R.id.item_name);

            card = itemView.findViewById(R.id.card);
            buton = itemView.findViewById(R.id.buton);
            valoare = itemView.findViewById(R.id.rat_text);
            rat= itemView.findViewById(R.id.rating_rating_bar);

        }
    }
}
