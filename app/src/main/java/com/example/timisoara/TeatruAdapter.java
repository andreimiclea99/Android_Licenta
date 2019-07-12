package com.example.timisoara;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.share.Sharer;
import com.bumptech.glide.Glide;
import com.facebook.share.widget.ShareDialog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.GregorianCalendar;

public class TeatruAdapter extends RecyclerView.Adapter<TeatruAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<ModelTeatru> mlist;
    private ArrayList<String> mImages;
    private ArrayList<String> mImageNames;
    TeatruAdapter(Context context, ArrayList<ModelTeatru> list, ArrayList<String> images, ArrayList<String> mimageNames){
        mContext = context;
        mlist=list;
        mImages=images;
        mImageNames=mimageNames;
    }
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

       View view = layoutInflater.inflate(R.layout.rv_teatru_adapter,viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {
     ImageView image = viewHolder.item_image;

     ModelTeatru teatruItem= mlist.get(i);
     final TextView name,place,price;
     name = viewHolder.item_name;
        place = viewHolder.item_place;
        price = viewHolder.item_price;

        image.setImageResource(teatruItem.getImage());
        name.setText(teatruItem.getName());
        place.setText(teatruItem.getPlace());
        price.setText(teatruItem.getPrice());
        viewHolder.buton_part.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(i){
                    case 1:

                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://www.teatrulgerman.ro/ro/reprezentatii/europa3/");
                sharingIntent.setPackage("com.facebook.katana");
                mContext.startActivity(sharingIntent);
                break;

                    case 2:
                        Intent sharingIntent2 = new Intent(Intent.ACTION_SEND);
                        sharingIntent2.setType("text/plain");
                        sharingIntent2.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent2.putExtra(Intent.EXTRA_TEXT, "https://www.teatrulgerman.ro/ro/reprezentatii/inumbrauitarii3/");
                        sharingIntent2.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent2);
                        break;
                        case 3:

                        Intent sharingIntent3 = new Intent(Intent.ACTION_SEND);
                        sharingIntent3.setType("text/plain");
                        sharingIntent3.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent3.putExtra(Intent.EXTRA_TEXT, "https://www.teatrulgerman.ro/ro/reprezentatii/albacazapada/");
                    sharingIntent3.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent3);
                        break;

                    case 0:
                        Intent sharingIntent4 = new Intent(Intent.ACTION_SEND);
                        sharingIntent4.setType("text/plain");
                        sharingIntent4.putExtra(Intent.EXTRA_SUBJECT, viewHolder.item_name.getText().toString());
                        sharingIntent4.putExtra(Intent.EXTRA_TEXT, "http://ro.tntimisoara.com/fest-fdr-2019/");
                        sharingIntent4.setPackage("com.facebook.katana");
                        mContext.startActivity(sharingIntent4);
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

                        Uri uri = Uri.parse("https://www.teatrulgerman.ro/ro/reprezentatii/europa3/"); // missing 'http://' will cause crashed
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        mContext.startActivity(intent);
                        break;
                    case 2:
                        Uri uri2 = Uri.parse("https://www.teatrulgerman.ro/ro/reprezentatii/inumbrauitarii3/"); // missing 'http://' will cause crashed
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                        mContext.startActivity(intent2);
                        break;
                    case 3:
                        Uri uri3 = Uri.parse("https://www.teatrulgerman.ro/ro/reprezentatii/albacazapada/"); // missing 'http://' will cause crashed
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                        mContext.startActivity(intent3);
                        break;
                    case 0:
                        Uri uri4 = Uri.parse("http://ro.tntimisoara.com/fest-fdr-2019/"); // missing 'http://' will cause crashed
                        Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                        mContext.startActivity(intent4);
                        break;
                }


            }
        });
        viewHolder.buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(i){

                   case 1:
                        Intent calIntent = new Intent(Intent.ACTION_INSERT);
                        calIntent.setType("vnd.android.cursor.item/event");
                        calIntent.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Teatrul Național Timișoara");
                        calIntent.putExtra(CalendarContract.Events.DESCRIPTION, "Sesiunea de vara");

                        GregorianCalendar calDate = new GregorianCalendar(2019, 5, 19);
                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate.getTimeInMillis());
                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate.getTimeInMillis());
                        mContext.startActivity(calIntent);

                       Calendar calendar = Calendar.getInstance();
                       calendar.setTimeZone(TimeZone.getTimeZone("GMT+03:00"));
                       calendar.set(Calendar.HOUR_OF_DAY,19);
                       calendar.set(Calendar.MINUTE,38);
                       calendar.set(Calendar.SECOND,13);
                       Intent intent = new Intent(v.getContext(),Notification_reciever.class);
                       intent.setAction("MY_NOTIFICATION_MESSAGE");
                       PendingIntent pendingIntent = PendingIntent.getBroadcast(mContext.getApplicationContext(),100,intent,PendingIntent.FLAG_UPDATE_CURRENT);

                       AlarmManager alarmManager = (AlarmManager)mContext.getSystemService(mContext.ALARM_SERVICE);
                       alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent);
                        break;
                    case 2:
                        Intent calIntent2 = new Intent(Intent.ACTION_INSERT);
                        calIntent2.setType("vnd.android.cursor.item/event");
                        calIntent2.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent2.putExtra(CalendarContract.Events.EVENT_LOCATION, "Teatrul Național Timișoara");
                        calIntent2.putExtra(CalendarContract.Events.DESCRIPTION, "Sesiunea de vara");

                        GregorianCalendar calDate2 = new GregorianCalendar(2019, 5, 21);
                        calIntent2.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent2.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate2.getTimeInMillis());
                        calIntent2.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate2.getTimeInMillis());
                        mContext.startActivity(calIntent2);
                        break;
                    case 3:
                        Intent calIntent3 = new Intent(Intent.ACTION_INSERT);
                        calIntent3.setType("vnd.android.cursor.item/event");
                        calIntent3.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent3.putExtra(CalendarContract.Events.EVENT_LOCATION, "Teatrul Național Timișoara");
                        calIntent3.putExtra(CalendarContract.Events.DESCRIPTION, "Sesiunea de vara");

                        GregorianCalendar calDate3 = new GregorianCalendar(2019, 5, 26);
                        calIntent3.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent3.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate3.getTimeInMillis());
                        calIntent3.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate3.getTimeInMillis());
                        mContext.startActivity(calIntent3);
                        break;
                    case 0:
                        Intent calIntent4 = new Intent(Intent.ACTION_INSERT);
                        calIntent4.setType("vnd.android.cursor.item/event");
                        calIntent4.putExtra(CalendarContract.Events.TITLE, viewHolder.item_name.getText().toString());
                        calIntent4.putExtra(CalendarContract.Events.EVENT_LOCATION, "Teatru în aer liber");
                        calIntent4.putExtra(CalendarContract.Events.DESCRIPTION, "FEST Outdoor al FEST-FDR2019 ");

                        GregorianCalendar calDate4 = new GregorianCalendar(2019, 5, 18);
                        calIntent4.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent4.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate4.getTimeInMillis());
                        calIntent4.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate4.getTimeInMillis());
                        mContext.startActivity(calIntent4);
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
