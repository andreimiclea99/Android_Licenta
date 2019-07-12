package com.example.timisoara;

import android.support.design.card.MaterialCardView;
import android.support.design.drawable.DrawableUtils;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.applandeo.materialcalendarview.CalendarView;
import com.applandeo.materialcalendarview.EventDay;
import com.applandeo.materialcalendarview.exceptions.OutOfDateRangeException;
import com.applandeo.materialcalendarview.utils.DateUtils;

import com.applandeo.materialcalendarview.CalendarView;
import com.applandeo.materialcalendarview.EventDay;
import com.applandeo.materialcalendarview.exceptions.OutOfDateRangeException;
import com.applandeo.materialcalendarview.utils.DateUtils;
import com.applandeo.materialcalendarview.EventDay;
import com.applandeo.materialcalendarview.listeners.OnDayClickListener;
import com.applandeo.materialcalendarview.listeners.OnSelectDateListener;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class material_cal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_cal);
        CalendarView mat = findViewById(R.id.calendarView);

        mat.setOnDayClickListener(eventDay ->
                Toast.makeText(getApplicationContext(),
                        eventDay.getCalendar().getTime().toString() + " "
                                + eventDay.isEnabled(),
                        Toast.LENGTH_SHORT).show());
       // Calendar calendar = Calendar.getInstance();
       /* mat.state().edit()
            .setFirstDayOfWeek(Calendar.MONDAY)
            .setMinimumDate(CalendarDay.from(1900, 1, 1))
            .setMaximumDate(CalendarDay.from(2100, 12, 31))
            .setCalendarDisplayMode(CalendarMode.MONTHS)
            .commit();

        calendar.set(2019, 5, 31);
        mat.setDate(calendar);*/
        List<EventDay> events = new ArrayList<>();



        Calendar calendar1 = Calendar.getInstance();
        calendar1.add(Calendar.DAY_OF_MONTH, 2);
        events.add(new EventDay(calendar1, R.drawable.sample));


        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.DAY_OF_MONTH, 5);

        events.add(new EventDay(calendar2, R.drawable.sample));

        Calendar calendar3 = Calendar.getInstance();
        calendar3.add(Calendar.DAY_OF_MONTH, 7);
        events.add(new EventDay(calendar3, R.drawable.sample));




        Calendar min = Calendar.getInstance();
        min.add(Calendar.MONTH, -4);

        Calendar max = Calendar.getInstance();
        max.add(Calendar.MONTH, 4);

        mat.setMinimumDate(min);
        mat.setMaximumDate(max);

        mat.setEvents(events);




    }

}
