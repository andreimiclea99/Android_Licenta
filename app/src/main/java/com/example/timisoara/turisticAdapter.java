package com.example.timisoara;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class turisticAdapter extends RecyclerView.Adapter<turisticAdapter.ViewHolder>
{
    private Context mContext;
    private ArrayList<MoldelTuristic> mlist;
        turisticAdapter(Context context, ArrayList<MoldelTuristic> list){
            mContext = context;
            mlist=list;

        }


    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.obiective_turistice,viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        ImageButton image = viewHolder.item_image;

        MoldelTuristic teatruItem= mlist.get(i);
        final TextView titlu,descriere;
        titlu = viewHolder.titlu;
        descriere = viewHolder.descriere;


        image.setImageResource(teatruItem.getImage());
        titlu.setText(teatruItem.getTitlu());
        descriere.setText(teatruItem.getDescriere());
        viewHolder.buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        switch(i){
            case 0:
                String uri = String.format(Locale.ENGLISH, "geo:0,0?q= Banat Village Museum");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                mContext.startActivity(intent);
                break;
            case 1:
                String uri2 = String.format(Locale.ENGLISH, "geo:0,0?q= Orthodox Metropolitan Cathedral Timisoara");
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri2));
                mContext.startActivity(intent2);
                break;
            case 2:
                String uri3 = String.format(Locale.ENGLISH, "geo:0,0?q= Piata Unirii Timisoara");
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri3));
                mContext.startActivity(intent3);
                break;
            case 3:
                String uri4 = String.format(Locale.ENGLISH, "geo:0,0?q= Bastionul Theresia Maria Timisoara");
                Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri4));
                mContext.startActivity(intent4);
                break;
            case 4:
                String uri5 = String.format(Locale.ENGLISH, "geo:0,0?q= Palatul Baroqu Timisoara");
                Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri5));
                mContext.startActivity(intent5);
                break;
            case 5:
                String uri6 = String.format(Locale.ENGLISH, "geo:0,0?q= Piata Victoriei Timisoara");
                Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri6));
                mContext.startActivity(intent6);
                break;


        }
        }
        });

        viewHolder.item_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(i){
                    case 0:
                        Intent viewIntent =
                                new Intent(v.getContext(), int_sat.class);
                        mContext.startActivity(viewIntent);
                        break;
                     case 1:
                         Intent viewIntent2 =
                                 new Intent(v.getContext(), int_cat.class);
                         mContext.startActivity(viewIntent2);
                         break;
                    case 2:
                        Intent viewIntent3 =
                                new Intent(v.getContext(), pt_unirii.class);
                        mContext.startActivity(viewIntent3);
                        break;
                    case 3:
                        Intent viewIntent4 =
                                new Intent(v.getContext(), int_theresia.class);
                        mContext.startActivity(viewIntent4);
                        break;
                    case 4:
                        Intent viewIntent5 =
                                new Intent(v.getContext(), int_baroque.class);
                        mContext.startActivity(viewIntent5);
                        break;
                    case 5:
                        Intent viewIntent55 =
                                new Intent(v.getContext(), int_victoria.class);
                        mContext.startActivity(viewIntent55);
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
        ImageButton item_image;

        Button buton;
        TextView titlu,descriere;
        public ViewHolder(View itemView){
            super (itemView);

            item_image = itemView.findViewById(R.id.icon);

            titlu = itemView.findViewById(R.id.text1);
            descriere = itemView.findViewById(R.id.text2);

            buton = itemView.findViewById(R.id.buton);


        }
    }
}
