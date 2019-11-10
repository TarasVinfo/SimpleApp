package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.simpleapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    static float convertCtoF(float valueCelsius){
        return valueCelsius*9/5+32;
    }

    /** Called when the user taps the Calculate button */
    public void converteTemperarure(View view) {
        String result="";
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        try {
            float valueCelsius=Float.parseFloat(String.valueOf(editText.getText()));
            float valueFahrenheit=convertCtoF(valueCelsius);
            result=String.valueOf(valueFahrenheit);

        }
        catch (Exception exceptionError) {
            result="Enter digits";
        }

        intent.putExtra(EXTRA_MESSAGE, result);
        startActivity(intent);
    }

}
