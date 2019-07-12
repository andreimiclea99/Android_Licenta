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
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Calendar_clasa_events extends AppCompatActivity {
    CompactCalendarView compactCalendar;
    private static final String TAG = "Calendar_clasa";
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_evenimente);
        compactCalendar =  findViewById(R.id.compactcalendar_view);
               final ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle(null);

        compactCalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);

        Event ev1 = new Event(Color.RED, 1561117546000L, "Streetfood Festival");
        compactCalendar.addEvent(ev1);
        Event ev2 = new Event(Color.BLUE, 1561722346000L,"Concert Bosquito");
        compactCalendar.addEvent(ev2);
        Event ev3 = new Event(Color.BLUE, 1561203946000L,"Fete de la Musique");
        compactCalendar.addEvent(ev3);
        Event ev4 = new Event(Color.BLUE, 1561290346000L,"Festivalul Papanasilor");
        compactCalendar.addEvent(ev4);
        Event ev5 = new Event(Color.BLUE, 1561895146000L,"Festivalul Filmului Francez de Umor");
        compactCalendar.addEvent(ev5);
        Event ev6 = new Event(Color.RED, 1562327146000L,"Jazz TM");
        compactCalendar.addEvent(ev6);
        Event ev7 = new Event(Color.BLUE, 1563018346000L,"Concert in 2");
        compactCalendar.addEvent(ev7);
        Event ev8 = new Event(Color.BLUE, 1563623146000L,"Festivalul Ceau, cinema!");
        compactCalendar.addEvent(ev8);
        Event ev9 = new Event(Color.BLUE, 1563450346000L,"Rolo Tomassi");
        compactCalendar.addEvent(ev9);
        Event ev11 = new Event(Color.BLUE, 1564400746000L,"Caravana Metropolis");
        compactCalendar.addEvent(ev11);
        Event ev12 = new Event(Color.BLUE, 1564659946000L,"Ziua Timisoarei");
        compactCalendar.addEvent(ev12);
        Event ev13 = new Event(Color.BLUE, 1565869546000L,"Tango Jazz Quartet");
        compactCalendar.addEvent(ev13);
        Event ev14 = new Event(Color.BLUE, 1566301546000L,"Rock the Boat");
        compactCalendar.addEvent(ev14);
        Event ev15 = new Event(Color.RED, 1567856746000L,"Festivalul Bega Bulevard");
        compactCalendar.addEvent(ev15);
        Event ev16 = new Event(Color.RED, 1568375146000L,"PLAI Festival 2019");
        compactCalendar.addEvent(ev16);
        Event ev17 = new Event(Color.BLUE, 1568547946000L,"Festivalul de muzica veche Timișoara");
        compactCalendar.addEvent(ev17);
        Event ev18 = new Event(Color.BLUE, 1569584746000L,"ABBA Tribute");
        compactCalendar.addEvent(ev18);


        compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context = getApplicationContext();
                List<Event> events = compactCalendar.getEvents(dateClicked);
                Log.d(TAG, "Day was clicked: " + dateClicked + " with events " + events);

                if (dateClicked.toString().compareTo("Fri Jun 21 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Streetfood Festival", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.vinsieu.ro/eveniment/timis/timisoara/festivaluri/street-food-festival-timi-oara/132596/e.html");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Fri Jun 28 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Concert Bosquito", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.iabilet.ro/bilete-timisoara-concert-bosquito-43041/?q=bosqui&fbclid=IwAR2hzglg9RuPEiBJMsJMhWyk5lSGZCK_FL9UZbuRMFBosikfyA9aP-WhpsY");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);

                }else if (dateClicked.toString().compareTo("Sat Jun 22 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Fete de la Musique", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.facebook.com/events/380465159482466/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Sun Jun 30 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Festivalul Filmului Francez de Umor", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.iabilet.ro/bilete-timisoara-concert-bosquito-43041/?q=bosqui&fbclid=IwAR2hzglg9RuPEiBJMsJMhWyk5lSGZCK_FL9UZbuRMFBosikfyA9aP-WhpsY");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Sun Jun 23 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Festivalul Papanasilor", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.facebook.com/events/337960266885731/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Fri Jul 05 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Jazz TM", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("http://www.jazztm.ro/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Sat Jul 13 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Concert in 2", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.iabilet.ro/bilete-ada-mila-si-bobo-bulacianu-concert-in-2-43573/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Sat Jul 20 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Festivalul Ceau, cinema!", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.iabilet.ro/bilete-festivalul-ceau-cinema-editia-a-6-a-43243/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Thu Jul 18 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Rolo Tomassi", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.iabilet.ro/bilete-rolo-tomassi-live-in-timisoara-42557/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Mon Jul 29 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Caravana Metropolis", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.cinemainaerliber.ro/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Thu Aug 01 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Ziua Timisoarei", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.primariatimisoara.ro/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Thu Aug 15 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Tango Jazz Quartet", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.iabilet.ro/bilete-tango-jazz-quartet-arg-live-43501/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Tue Aug 20 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Rock the Boat", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.vinsieu.ro/eveniment/timis/timisoara/cluburi-si-discoteci-festivaluri-muzica-si-concerte/rock-the-boat/1031/e.html");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Sat Sep 07 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Festivalul Bega Bulevard", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("http://www.timisoreni.ro/despre/festivalul_bega_bulevard/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Fri Sep 13 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "PLAI Festival 2019", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.infomusic.ro/agenda/plai-festival-timisoara-2019/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Sun Sep 15 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "Festivalul de muzica veche Timișoara", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("http://festivalmuzicaveche.ro/");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }else if (dateClicked.toString().compareTo("Fri Sep 27 00:00:00 GMT+03:00 2019") == 0) {
                    Toast.makeText(context, "ABBA Tribute", Toast.LENGTH_SHORT).show();
                    Uri uri4 = Uri.parse("https://www.iabilet.ro/bilete-abba-tribute-43407/");
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

    }
}
