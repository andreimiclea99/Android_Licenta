package com.example.timisoara;

import android.app.usage.UsageEvents;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.EventLog;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;
import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Calendar_clasa extends AppCompatActivity {
    CompactCalendarView compactCalendar;
    private static final String TAG = "Calendar_clasa";
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        compactCalendar =  findViewById(R.id.compactcalendar_view);
        final ActionBar actionBar = getSupportActionBar();
                actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle(null);
        compactCalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);
        Event ev1 = new Event(Color.BLUE, 1560258735000L, "Coppélia");
        compactCalendar.addEvent(ev1);
        Event ev2 = new Event(Color.BLUE, 1560345135000L,"Spărgătorul de nuci");
        compactCalendar.addEvent(ev2);
        Event ev4 = new Event(Color.BLUE, 1560690735000L,"Spectacol in memoriam Adriana Gâdea");
        compactCalendar.addEvent(ev4);
        Event ev5 = new Event(Color.BLUE, 1560944746000L,"Bal Mascat");
        compactCalendar.addEvent(ev5);
        Event ev6 = new Event(Color.BLUE, 1569239146000L,"Frumos e în septembrie la Veneția");
        compactCalendar.addEvent(ev6);
        compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context = getApplicationContext();
                List<Event> events = compactCalendar.getEvents(dateClicked);
                Log.d(TAG, "Day was clicked: " + dateClicked + " with events " + events);

                if (dateClicked.toString().compareTo("Tue Jun 11 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Coppélia", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.ort.ro/eveniment/294/ro/Copp%C3%A9lia.html");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Wen Jun 12 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Spărgătorul de nuci", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.ort.ro/eveniment/287/ro/Sp%C4%83rg%C4%83torul-de-nuci.html");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);

                }else if (dateClicked.toString().compareTo("Sun Jun 16 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Spectacol in memoriam Adriana Gâdea", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.ort.ro/eveniment/295/ro/Spectacol-in-memoriam-Adriana-Gadea.html");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Wed Jun 19 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Bal Mascat", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.ort.ro/eveniment/296/ro/Bal-mascat.html");
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
