package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.lang.String;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText dob;
    Button c;
    int change;
    final Calendar mycal = Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dob = findViewById(R.id.selectdob);
        c = findViewById(R.id.calc);
    }
    public void DOB(View view)
    {
        final int day=mycal.get(Calendar.DAY_OF_MONTH);
        final int month=mycal.get(Calendar.MONTH);
        final int myear=mycal.get(Calendar.YEAR);
        DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

            }
        },day, month, myear);
        datePickerDialog.show();
    }






}