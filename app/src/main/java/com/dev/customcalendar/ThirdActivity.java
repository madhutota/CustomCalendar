package com.dev.customcalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        SimpleCalendar simpleCalendar = (SimpleCalendar) findViewById(R.id.square_day);

        simpleCalendar.setUserCurrentMonthYear(6, 2018);

        simpleCalendar.setCallBack(new SimpleCalendar.DayClickListener() {
            @Override
            public void onDayClick(View view) {

            }
        });
    }
}
