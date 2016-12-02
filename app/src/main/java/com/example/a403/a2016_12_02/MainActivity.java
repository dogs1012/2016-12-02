package com.example.a403.a2016_12_02;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.view.View;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

        Chronometer chronometer;
        CalendarView calendarView;
        TimePicker timePicker;
        TextView textView4;
        Button button,button2;
        RadioGroup Rg;
        RadioButton radioButton,radioButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        chronometer=(Chronometer)findViewById(R.id.chronometer3);
        calendarView =(CalendarView)findViewById(R.id.calendarView);
        timePicker = (TimePicker)findViewById(R.id.timePicker);


    }

    public void OnClick(View v){
            switch (v.getId())
            {
                case  R.id.button:
                    chronometer.start();
                    chronometer.setTextColor(Color.RED);
                break;
                case R.id.button2:
                    chronometer.stop();
                    chronometer.setTextColor(Color.BLUE);
                    break;
            }
    }


}
