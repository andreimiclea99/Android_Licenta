package com.example.timisoara;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Calendar_clasa_2 extends AppCompatActivity {
    CompactCalendarView compactCalendar;
    private static final String TAG = "Calendar_clasa";
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_2);
        compactCalendar =  findViewById(R.id.compactcalendar_view);
               final ActionBar actionBar = getSupportActionBar();
        //assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle(null);

        compactCalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);


        Event ev1 = new Event(Color.BLUE, 1560194667000L, "Hänsel și Gretel");
        compactCalendar.addEvent(ev1);
        Event ev2 = new Event(Color.BLUE, 1560713067000L,"Din copilăria mea ...");
        compactCalendar.addEvent(ev2);
        Event ev3 = new Event(Color.BLUE, 1560944746000L,"Europa");
        compactCalendar.addEvent(ev3);
        Event ev4 = new Event(Color.BLUE, 1561117546000L,"In umbra uitarii");
        compactCalendar.addEvent(ev4);
        Event ev5 = new Event(Color.BLUE, 1561549546000L,"Albă-ca-Zăpada");
        compactCalendar.addEvent(ev5);
        Event ev6 = new Event(Color.BLUE, 1560858346000L,"The Fragrance of Time");
        compactCalendar.addEvent(ev6);

        compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context = getApplicationContext();
                List<Event> events = compactCalendar.getEvents(dateClicked);
                Log.d(TAG, "Day was clicked: " + dateClicked + " with events " + events);

                if (dateClicked.toString().compareTo("Mon Jun 10 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Hänsel și Gretel", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.biletmaster.ro/ron/Event/51000841/Hansel-si-Gretel");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Sun Jun 16 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Din copilăria mea ...", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.teatrulgerman.ro/ro/reprezentatii/din-copil%C4%83ria-mea/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);

                }else if (dateClicked.toString().compareTo("Wed Jun 19 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Europa", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.teatrulgerman.ro/ro/reprezentatii/europa3/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Tue Jun 18 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "The Fragrance of Time", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("http://ro.tntimisoara.com/fest-fdr-2019/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Fri Jun 21 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "În umbra uitării", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.teatrulgerman.ro/ro/reprezentatii/inumbrauitarii3/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Wed Jun 26 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Albă-ca-Zăpada", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.teatrulgerman.ro/ro/reprezentatii/albacazapada/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else{
                    Toast.makeText(context, "Nu este nici un eveniment programat pentru această zi! ", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                actionBar.setTitle(dateFormatMonth.format(firstDayOfNewMonth));
            }
        });


       /* compactCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                dateDisplay.setText("Date: " + i2 + " / " + i1 + " / " + i);

                Toast.makeText(getApplicationContext(), "Selected Date:\n" + "Day = " + i2 + "\n" + "Month = " + i1 + "\n" + "Year = " + i, Toast.LENGTH_LONG).show();

                if (i==2019 && i1==4 && i2==29){
                    Uri uri4 = Uri.parse("https://www.eventim.ro/ro/bilete/canicula-timisoara-teatrul-national-studio-utu-strugari-1121186/performance.html"); // missing 'http://' will cause crashed
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);

                }

            }
        });*/
    }
}
