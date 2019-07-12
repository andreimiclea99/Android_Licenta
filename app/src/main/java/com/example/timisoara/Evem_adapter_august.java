package com.example.timisoara;

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
import java.util.GregorianCalendar;

public class Evem_adapter_august extends RecyclerView.Adapter<Evem_adapter_august.ViewHolder> {


    private Context mContext;
    private ArrayList<Modelevem> mlist;

    Evem_adapter_august(Context context, ArrayList<Modelevem> list){
        mContext = context;
        mlist=list;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.rv_events,viewGroup, false);
        Evem_adapter_august.ViewHolder viewHolder = new Evem_adapter_august.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {
        ImageView image = viewHolder.item_image;

        Modelevem teatruItem= mlist.get(i);
        final TextView name,place,price;
        name = viewHolder.item_name;
        place = viewHolder.item_place;
        price = viewHolder.item_price;

        image.setImageResource(teatruItem.getImage());
        name.setText(teatruItem.getName());
        place.setText(teatruItem.getPlace());
        price.setText(teatruItem.getPrice());


        viewHolder.buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (i) {


                    case 0:
                        Intent calIntent3 = new Intent(Intent.ACTION_INSERT);
                        calIntent3.setType("vnd.android.cursor.item/event");
                        calIntent3.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent3.putExtra(CalendarContract.Events.EVENT_LOCATION, "Piața Victoriei");
                        calIntent3.putExtra(CalendarContract.Events.DESCRIPTION, "Zilele Orașului");

                        GregorianCalendar calDate3 = new GregorianCalendar(2019, 7, 1);
                        calIntent3.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent3.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate3.getTimeInMillis());
                        calIntent3.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate3.getTimeInMillis());
                        mContext.startActivity(calIntent3);
                        break;

                    case 1:
                        Intent calIntent5 = new Intent(Intent.ACTION_INSERT);
                        calIntent5.setType("vnd.android.cursor.item/event");
                        calIntent5.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent5.putExtra(CalendarContract.Events.EVENT_LOCATION, "Capitol");
                        calIntent5.putExtra(CalendarContract.Events.DESCRIPTION, "Festival de film");

                        GregorianCalendar calDate5 = new GregorianCalendar(2019, 7, 15);
                        calIntent5.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent5.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate5.getTimeInMillis());
                        calIntent5.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate5.getTimeInMillis());
                        mContext.startActivity(calIntent5);
                        break;
                    case 2:
                        Intent calIntent6 = new Intent(Intent.ACTION_INSERT);
                        calIntent6.setType("vnd.android.cursor.item/event");
                        calIntent6.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent6.putExtra(CalendarContract.Events.EVENT_LOCATION, "Manufactura");
                        calIntent6.putExtra(CalendarContract.Events.DESCRIPTION, "Concert de Jazz");

                        GregorianCalendar calDate6 = new GregorianCalendar(2019, 7, 15);
                        calIntent6.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent6.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate6.getTimeInMillis());
                        calIntent6.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate6.getTimeInMillis());
                        mContext.startActivity(calIntent6);
                        break;
                    case 3:
                        Intent calIntent2 = new Intent(Intent.ACTION_INSERT);
                        calIntent2.setType("vnd.android.cursor.item/event");
                        calIntent2.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent2.putExtra(CalendarContract.Events.EVENT_LOCATION, "B-dul 16 Decembrie");
                        calIntent2.putExtra(CalendarContract.Events.DESCRIPTION, "Concert");

                        GregorianCalendar calDate2 = new GregorianCalendar(2019, 7, 19);
                        calIntent2.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent2.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate2.getTimeInMillis());
                        calIntent2.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate2.getTimeInMillis());
                        mContext.startActivity(calIntent2);
                        break;

                }
            }
        });
        viewHolder.buton_part.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(i){

                    case 0:

                        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://www.primariatm.ro/");
                        sharingIntent.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent);
                        break;

                    case 1:

                        Intent sharingIntent5 = new Intent(Intent.ACTION_SEND);
                        sharingIntent5.setType("text/plain");
                        sharingIntent5.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent5.putExtra(Intent.EXTRA_TEXT, "https://tiff.ro/");
                        sharingIntent5.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent5);
                        break;

                    case 2:
                        Intent sharingIntent6 = new Intent(Intent.ACTION_SEND);
                        sharingIntent6.setType("text/plain");
                        sharingIntent6.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent6.putExtra(Intent.EXTRA_TEXT, "https://www.iabilet.ro/bilete-tango-jazz-quartet-arg-live-43501/");
                        sharingIntent6.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent6);
                        break;
                    case 3:
                        Intent sharingIntent1 = new Intent(Intent.ACTION_SEND);
                        sharingIntent1.setType("text/plain");
                        sharingIntent1.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent1.putExtra(Intent.EXTRA_TEXT, "https://www.vinsieu.ro/eveniment/timis/timisoara/cluburi-si-discoteci-festivaluri-muzica-si-concerte/rock-the-boat/1031/e.html");
                        sharingIntent1.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent1);
                        break;


                }
            }
        });

        viewHolder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                switch(i)
                {


                    case 0:

                        Uri uri3 = Uri.parse("https://www.primariatm.ro/"); // missing 'http://' will cause crashed
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                        mContext.startActivity(intent3);
                        break;
                    case 1:

                        Uri uri4 = Uri.parse("https://tiff.ro/"); // missing 'http://' will cause crashed
                        Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                        mContext.startActivity(intent4);
                        break;

                    case 2:

                        Uri uri5 = Uri.parse("https://www.iabilet.ro/bilete-tango-jazz-quartet-arg-live-43501/"); // missing 'http://' will cause crashed
                        Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
                        mContext.startActivity(intent5);
                        break;
                    case 3:

                        Uri uri1 = Uri.parse("https://www.vinsieu.ro/eveniment/timis/timisoara/cluburi-si-discoteci-festivaluri-muzica-si-concerte/rock-the-boat/1031/e.html"); // missing 'http://' will cause crashed
                        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
                        mContext.startActivity(intent1);
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
        TextView item_name,item_place,item_price;
        public ViewHolder(View itemView){
            super (itemView);

            item_image = itemView.findViewById(R.id.item_image);
            item_name = itemView.findViewById(R.id.item_name);
            item_place = itemView.findViewById(R.id.item_place);
            item_price = itemView.findViewById(R.id.item_price);
            buton = itemView.findViewById(R.id.buton);
            buton_part = itemView.findViewById(R.id.button7);
            card = itemView.findViewById(R.id.card);

        }
    }
}
