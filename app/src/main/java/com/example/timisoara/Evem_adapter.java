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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Evem_adapter extends RecyclerView.Adapter<Evem_adapter.ViewHolder> {


    private Context mContext;
    private ArrayList<Modelevem> mlist;

    Evem_adapter(Context context, ArrayList<Modelevem> list){
        mContext = context;
        mlist=list;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.rv_events,viewGroup, false);
        Evem_adapter.ViewHolder viewHolder = new Evem_adapter.ViewHolder(view);
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
                    case 1:
                        Intent calIntent2 = new Intent(Intent.ACTION_INSERT);
                        calIntent2.setType("vnd.android.cursor.item/event");
                        calIntent2.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent2.putExtra(CalendarContract.Events.EVENT_LOCATION, " Filarmonica Banatul din Timișoara");
                        calIntent2.putExtra(CalendarContract.Events.DESCRIPTION, "Concert Nicu Alifantis");

                        GregorianCalendar calDate2 = new GregorianCalendar(2019, 9, 13);
                        calIntent2.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent2.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate2.getTimeInMillis());
                        calIntent2.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate2.getTimeInMillis());
                        mContext.startActivity(calIntent2);
                        break;
                    case 2:
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
                    case 3:
                        Intent calIntent3 = new Intent(Intent.ACTION_INSERT);
                        calIntent3.setType("vnd.android.cursor.item/event");
                        calIntent3.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent3.putExtra(CalendarContract.Events.EVENT_LOCATION, "Parcul Rozelor");
                        calIntent3.putExtra(CalendarContract.Events.DESCRIPTION, "Jazz TM");

                        GregorianCalendar calDate3 = new GregorianCalendar(2019, 6, 5);
                        calIntent3.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent3.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate3.getTimeInMillis());
                        calIntent3.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate3.getTimeInMillis());
                        mContext.startActivity(calIntent3);
                        break;

                    case 4:
                        Intent calIntent5 = new Intent(Intent.ACTION_INSERT);
                        calIntent5.setType("vnd.android.cursor.item/event");
                        calIntent5.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent5.putExtra(CalendarContract.Events.EVENT_LOCATION, " Parcul Rozelor");
                        calIntent5.putExtra(CalendarContract.Events.DESCRIPTION, "Festival culinar");

                        GregorianCalendar calDate5 = new GregorianCalendar(2019, 5, 20);
                        calIntent5.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent5.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate5.getTimeInMillis());
                        calIntent5.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate5.getTimeInMillis());
                        mContext.startActivity(calIntent5);
                        break;
                    case 5:
                        Intent calIntent6 = new Intent(Intent.ACTION_INSERT);
                        calIntent6.setType("vnd.android.cursor.item/event");
                        calIntent6.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent6.putExtra(CalendarContract.Events.EVENT_LOCATION, " Parcul Rozelor");
                        calIntent6.putExtra(CalendarContract.Events.DESCRIPTION, "Festival de bere");

                        GregorianCalendar calDate6 = new GregorianCalendar(2019, 8, 13);
                        calIntent6.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent6.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate6.getTimeInMillis());
                        calIntent6.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate6.getTimeInMillis());
                        mContext.startActivity(calIntent6);
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
                        sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://www.infomusic.ro/agenda/plai-festival-timisoara-2019/");
                        sharingIntent.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent);
                        break;

                    case 1:
                        Intent sharingIntent2 = new Intent(Intent.ACTION_SEND);
                        sharingIntent2.setType("text/plain");
                        sharingIntent2.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent2.putExtra(Intent.EXTRA_TEXT, "https://www.infomusic.ro/agenda/alifantis-fragileband-concert-timisoara-2019/");
                        sharingIntent2.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent2);
                        break;
                    case 2:

                        Intent sharingIntent3 = new Intent(Intent.ACTION_SEND);
                        sharingIntent3.setType("text/plain");
                        sharingIntent3.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent3.putExtra(Intent.EXTRA_TEXT, "http://www.timisoreni.ro/despre/festivalul_bega_bulevard/");
                        sharingIntent3.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent3);
                        break;

                    case 3:
                        Intent sharingIntent4 = new Intent(Intent.ACTION_SEND);
                        sharingIntent4.setType("text/plain");
                        sharingIntent4.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent4.putExtra(Intent.EXTRA_TEXT, "http://www.jazztm.ro/");
                        sharingIntent4.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent4);
                        break;
                    case 4:

                        Intent sharingIntent5 = new Intent(Intent.ACTION_SEND);
                        sharingIntent5.setType("text/plain");
                        sharingIntent5.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent5.putExtra(Intent.EXTRA_TEXT, "https://www.vinsieu.ro/eveniment/timis/timisoara/festivaluri/street-food-festival-timi-oara/132596/e.html");
                        sharingIntent5.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent5);
                        break;

                    case 5:
                        Intent sharingIntent6 = new Intent(Intent.ACTION_SEND);
                        sharingIntent6.setType("text/plain");
                        sharingIntent6.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent6.putExtra(Intent.EXTRA_TEXT, "https://www.feeder.ro/event/timisoara-craft-beer-festival-2019/");
                        sharingIntent6.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent6);
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

                        Uri uri = Uri.parse("https://www.infomusic.ro/agenda/plai-festival-timisoara-2019/"); // missing 'http://' will cause crashed
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        mContext.startActivity(intent);
                        break;

                    case 1:

                        Uri uri1 = Uri.parse("https://www.infomusic.ro/agenda/alifantis-fragileband-concert-timisoara-2019/"); // missing 'http://' will cause crashed
                        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
                        mContext.startActivity(intent1);
                        break;
                    case 2:

                        Uri uri2 = Uri.parse("http://www.timisoreni.ro/despre/festivalul_bega_bulevard/"); // missing 'http://' will cause crashed
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                        mContext.startActivity(intent2);
                        break;

                    case 3:

                        Uri uri3 = Uri.parse("http://www.jazztm.ro/"); // missing 'http://' will cause crashed
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                        mContext.startActivity(intent3);
                        break;
                    case 4:

                        Uri uri4 = Uri.parse("https://www.vinsieu.ro/eveniment/timis/timisoara/festivaluri/street-food-festival-timi-oara/132596/e.html"); // missing 'http://' will cause crashed
                        Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                        mContext.startActivity(intent4);
                        break;

                    case 5:

                        Uri uri5 = Uri.parse("https://www.feeder.ro/event/timisoara-craft-beer-festival-2019/"); // missing 'http://' will cause crashed
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
