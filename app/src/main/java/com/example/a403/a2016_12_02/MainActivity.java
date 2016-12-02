package com.example.a403.a2016_12_02;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.view.View;
import android.widget.CompoundButton;
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
        String result1;
        String result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        chronometer=(Chronometer)findViewById(R.id.chronometer3);
        calendarView =(CalendarView)findViewById(R.id.calendarView);
        timePicker = (TimePicker)findViewById(R.id.timePicker);
        button =(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        textView4 =(TextView)findViewById(R.id.textView4);
        Rg=(RadioGroup)findViewById(R.id.RG);
        radioButton=(RadioButton)findViewById(R.id.radioButton);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
                  @Override
                       public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                             result1 = (year + "년" + month + "월" + dayOfMonth + "일" );

                     }
                });

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
                        @Override
                        public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                              result2 = (hourOfDay + "시" + minute + "분");
                   }

        });



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.setBase(0);
                chronometer.start();
                chronometer.setTextColor(Color.RED);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                chronometer.stop();
                chronometer.setTextColor(Color.BLUE);
                textView4.setText(result1+result2);
            }
        });


        radioButton.setChecked(true);
             radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                     @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                         timePicker.setVisibility(View.INVISIBLE);
                         calendarView.setVisibility(View.VISIBLE);
                          }
                  });
        radioButton2.setChecked(true);
            radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                    timePicker .setVisibility(View.VISIBLE);
                    calendarView .setVisibility(View.INVISIBLE);
                }
            });



    }




}
