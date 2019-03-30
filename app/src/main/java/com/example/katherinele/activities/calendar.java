package com.example.katherinele.activities;














import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

//<<<<<<< HEAD
//=======
//import com.github.sundeepk.compactcalendarview.CompactCalendarView;
//import com.github.sundeepk.compactcalendarview.domain.Event;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.List;
//import java.util.Locale;
//import com.example.katherinele.R;
//
//>>>>>>> 9fa1a4390d6671269c23c4cf7589145326c4549e
public class calendar extends AppCompatActivity {

    // Define the variable of CalendarView type
    // and TextView type;
    CalendarView calender;
    TextView date_view;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        // By ID we can use each component
        // which id is assign in xml file
        // use findViewById() to get the
        // CalendarView and TextView
        calender = (CalendarView)
                findViewById(R.id.calender);
        date_view = (TextView)
                findViewById(R.id.date_view);

        // Add Listener in calendar
        calender
                .setOnDateChangeListener(
                        new CalendarView
                                .OnDateChangeListener() {
                            @Override

                            // In this Listener have one method
                            // and in this method we will
                            // get the value of DAYS, MONTH, YEARS
                            public void onSelectedDayChange(
                                    @NonNull CalendarView view,
                                    int year,
                                    int month,
                                    int dayOfMonth)
                            {

                                // Store the value of date with
                                // format in String type Variable
                                // Add 1 in month because month
                                // index is start with 0
                                String Date
                                        = dayOfMonth + "-"
                                        + (month + 1) + "-" + year;

                                // set this date in TextView for Display
                                date_view.setText(Date);
                            }
                        });
    }
}

























//import android.graphics.Color;
//import android.nfc.Tag;
//import android.support.v7.app.ActionBar;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.EventLog;
//import android.util.Log;
//import android.widget.TextView;
//
//import com.github.sundeepk.compactcalendarview.CompactCalendarView;
//import com.github.sundeepk.compactcalendarview.domain.Event;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.List;
//import java.util.Locale;
//
//public class calendar extends AppCompatActivity {
//
//    CompactCalendarView compactCalendar;
//    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_calendar);
//        CompactCalendarView calender;
//        calender = (CompactCalendarView)
//                findViewById(R.id.compactcalendar_view);
//
//        calender
//                .setOnDateChangeListener(
//                        new CompactCalendarView()
//                                .OnDateChangeListener() {
//                            @Override
//
//                            // In this Listener have one method
//                            // and in this method we will
//                            // get the value of DAYS, MONTH, YEARS
//                            public void onSelectedDayChange(
//                                    @NonNull CalendarView view,
//                                    int year,
//                                    int month,
//                                    int dayOfMonth)
//                            {
//                            }
//}