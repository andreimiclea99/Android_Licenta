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

public class Evem_adapter_septembrie extends RecyclerView.Adapter<Evem_adapter_septembrie.ViewHolder> {


    private Context mContext;
    private ArrayList<Modelevem> mlist;

    Evem_adapter_septembrie(Context context, ArrayList<Modelevem> list){
        mContext = context;
        mlist=list;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.rv_events,viewGroup, false);
        Evem_adapter_septembrie.ViewHolder viewHolder = new Evem_adapter_septembrie.ViewHolder(view);
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
                        Intent calIntent4 = new Intent(Intent.ACTION_INSERT);
                        calIntent4.setType("vnd.android.cursor.item/event");
                        calIntent4.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent4.putExtra(CalendarContract.Events.EVENT_LOCATION, " Centrul Orasului");
                        calIntent4.putExtra(CalendarContract.Events.DESCRIPTION, "Festival de muzica in aer liber");

                        GregorianCalendar calDate4 = new GregorianCalendar(2019, 8, 7);
                        calIntent4.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent4.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate4.getTimeInMillis());
                        calIntent4.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate4.getTimeInMillis());
                        mContext.startActivity(calIntent4);
                        break;

                    case 1:
                        Intent calIntent = new Intent(Intent.ACTION_INSERT);
                        calIntent.setType("vnd.android.cursor.item/event");
                        calIntent.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, " Muzeul Satului Bănățean");
                        calIntent.putExtra(CalendarContract.Events.DESCRIPTION, "PLAI Festival 2019");

                        GregorianCalendar calDate = new GregorianCalendar(2019, 8, 13);
                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate.getTimeInMillis());
                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate.getTimeInMillis());
                        mContext.startActivity(calIntent);
                        break;


                    case 2:
                        Intent calIntent44 = new Intent(Intent.ACTION_INSERT);
                        calIntent44.setType("vnd.android.cursor.item/event");
                        calIntent44.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent44.putExtra(CalendarContract.Events.EVENT_LOCATION, " Filarmonica Timisoara");
                        calIntent44.putExtra(CalendarContract.Events.DESCRIPTION, "Festival de muzica veche");

                        GregorianCalendar calDate44 = new GregorianCalendar(2019, 8, 15);
                        calIntent44.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent44.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate44.getTimeInMillis());
                        calIntent44.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate44.getTimeInMillis());
                        mContext.startActivity(calIntent44);
                        break;
                    case 3:
                        Intent calIntent424 = new Intent(Intent.ACTION_INSERT);
                        calIntent424.setType("vnd.android.cursor.item/event");
                        calIntent424.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent424.putExtra(CalendarContract.Events.EVENT_LOCATION, " Club Capcana");
                        calIntent424.putExtra(CalendarContract.Events.DESCRIPTION, "Concert muzică");

                        GregorianCalendar calDate424 = new GregorianCalendar(2019, 8, 27);
                        calIntent424.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent424.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate424.getTimeInMillis());
                        calIntent424.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate424.getTimeInMillis());
                        mContext.startActivity(calIntent424);
                        break;


                }
            }
        });
        viewHolder.buton_part.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(i){

                    case 0:

                        Intent sharingIntent3 = new Intent(Intent.ACTION_SEND);
                        sharingIntent3.setType("text/plain");
                        sharingIntent3.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent3.putExtra(Intent.EXTRA_TEXT, "http://www.timisoreni.ro/despre/festivalul_bega_bulevard/");
                        sharingIntent3.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent3);
                        break;

                    case 1:

                        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://www.infomusic.ro/agenda/plai-festival-timisoara-2019/");
                        sharingIntent.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent);
                        break;


                    case 2:
                        Intent sharingIntent4 = new Intent(Intent.ACTION_SEND);
                        sharingIntent4.setType("text/plain");
                        sharingIntent4.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent4.putExtra(Intent.EXTRA_TEXT, "http://festivalmuzicaveche.ro/");
                        sharingIntent4.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent4);
                        break;
                    case 3:

                        Intent sharingIntent5 = new Intent(Intent.ACTION_SEND);
                        sharingIntent5.setType("text/plain");
                        sharingIntent5.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent5.putExtra(Intent.EXTRA_TEXT, "https://www.iabilet.ro/bilete-abba-tribute-43407/");
                        sharingIntent5.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent5);
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

                        Uri uri2 = Uri.parse("http://www.timisoreni.ro/despre/festivalul_bega_bulevard/"); // missing 'http://' will cause crashed
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                        mContext.startActivity(intent2);
                        break;
                    case 1:

                        Uri uri = Uri.parse("https://www.infomusic.ro/agenda/plai-festival-timisoara-2019/"); // missing 'http://' will cause crashed
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        mContext.startActivity(intent);
                        break;


                    case 2:

                        Uri uri3 = Uri.parse("http://festivalmuzicaveche.ro/"); // missing 'http://' will cause crashed
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                        mContext.startActivity(intent3);
                        break;
                    case 3:

                        Uri uri4 = Uri.parse("https://www.iabilet.ro/bilete-abba-tribute-43407/"); // missing 'http://' will cause crashed
                        Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                        mContext.startActivity(intent4);
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
