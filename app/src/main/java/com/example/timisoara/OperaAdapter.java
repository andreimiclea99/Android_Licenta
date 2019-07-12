package com.example.timisoara;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class OperaAdapter extends RecyclerView.Adapter<OperaAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<MoldelOpera> mlist;
    OperaAdapter(Context context, ArrayList<MoldelOpera> list){
        mContext = context;
        mlist=list;
    }
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.activity_opera,viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    public void onBindViewHolder(@NonNull OperaAdapter.ViewHolder viewHolder, int i) {
        ImageView image = viewHolder.item_image;

        MoldelOpera operaItem= mlist.get(i);
        final TextView name,data,pret;
        name = viewHolder.item_name;
        data = viewHolder.data;
        pret = viewHolder.pret;

        image.setImageResource(operaItem.getImage());
        name.setText(operaItem.getName());
        data.setText(operaItem.getData());
        pret.setText(operaItem.getPret());


        viewHolder.buton_part.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(i){
                    case 1:

                        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://www.ort.ro/eveniment/296/ro/Bal-mascat.html");
                        sharingIntent.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent);
                        break;
                    case 2:
                        Intent sharingIntent2 = new Intent(Intent.ACTION_SEND);
                        sharingIntent2.setType("text/plain");
                        sharingIntent2.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent2.putExtra(Intent.EXTRA_TEXT, "https://www.iabilet.ro/bilete-timisoara-frumos-e-in-septembrie-la-venetia-43247/");
                        sharingIntent2.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent2);
                        break;
                    case 0:

                        Intent sharingIntent3 = new Intent(Intent.ACTION_SEND);
                        sharingIntent3.setType("text/plain");
                        sharingIntent3.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent3.putExtra(Intent.EXTRA_TEXT, "https://www.facebook.com/events/808139779563896");
                        sharingIntent3.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent3);
                        break;
                }
            }
        });
        viewHolder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(mContext,"Your answer is: " + i,
                        Toast.LENGTH_LONG).show();*/
                switch(i)
                {
                    case 1:

                        Uri uri = Uri.parse("https://www.ort.ro/eveniment/296/ro/Bal-mascat.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        mContext.startActivity(intent);
                        break;
                    case 2:
                        Uri uri2 = Uri.parse("https://www.iabilet.ro/bilete-timisoara-frumos-e-in-septembrie-la-venetia-43247/");
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                        mContext.startActivity(intent2);
                        break;
                    case 0:
                        Uri uri3 = Uri.parse("https://www.facebook.com/events/808139779563896");
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                        mContext.startActivity(intent3);
                        break;

                }


            }
        });
        viewHolder.buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(i){

                    case 0:
                        Intent calIntent = new Intent(Intent.ACTION_INSERT);
                        calIntent.setType("vnd.android.cursor.item/event");
                        calIntent.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Opera Național Timișoara");
                        calIntent.putExtra(CalendarContract.Events.DESCRIPTION, "Sesiunea de vara");

                        GregorianCalendar calDate = new GregorianCalendar(2019, 5, 16);
                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate.getTimeInMillis());
                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate.getTimeInMillis());
                        mContext.startActivity(calIntent);
                        break;
                    case 1:
                        Intent calIntent2 = new Intent(Intent.ACTION_INSERT);
                        calIntent2.setType("vnd.android.cursor.item/event");
                        calIntent2.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent2.putExtra(CalendarContract.Events.EVENT_LOCATION, "Opera Național Timișoara");
                        calIntent2.putExtra(CalendarContract.Events.DESCRIPTION, "Sesiunea de vara");

                        GregorianCalendar calDate2 = new GregorianCalendar(2019, 5, 19);
                        calIntent2.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent2.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate2.getTimeInMillis());
                        calIntent2.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate2.getTimeInMillis());
                        mContext.startActivity(calIntent2);
                        break;
                    case 2:
                        Intent calIntent3 = new Intent(Intent.ACTION_INSERT);
                        calIntent3.setType("vnd.android.cursor.item/event");
                        calIntent3.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent3.putExtra(CalendarContract.Events.EVENT_LOCATION, "Opera Național Timișoara");
                        calIntent3.putExtra(CalendarContract.Events.DESCRIPTION, "Sesiunea de toamnă");

                        GregorianCalendar calDate3 = new GregorianCalendar(2019, 8, 23);
                        calIntent3.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent3.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate3.getTimeInMillis());
                        calIntent3.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate3.getTimeInMillis());
                        mContext.startActivity(calIntent3);
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
        Button buton,buton_part;
        TextView item_name,data,pret;
        public ViewHolder(View itemView){
            super (itemView);

            item_image = itemView.findViewById(R.id.item_image);
            item_name = itemView.findViewById(R.id.item_name);
            pret = itemView.findViewById(R.id.item_place);
            data = itemView.findViewById(R.id.item_price);
            buton = itemView.findViewById(R.id.buton);
            buton_part = itemView.findViewById(R.id.button7);
            card = itemView.findViewById(R.id.card);


        }
    }
}
