package edu.famodu.resistorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int currentBand = 0;
    int resistorValue = 0;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.tvDisplay);
    }


    public void doBand1(View view) {
        currentBand = 1;
    }

    public void doBand2(View view) {
        currentBand = 2;
    }

    public void doBand3(View view) {
        currentBand = 3;
    }

    public void doRed(View view) {
        if (currentBand == 1) {
            resistorValue = 2;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 2;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 100;
        }
    }

    public void doOrange(View view) {
        if (currentBand == 1) {
            resistorValue = 3;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 3;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 1000;
        }
    }

    public void doYellow(View view) {
        if (currentBand == 1) {
            resistorValue = 4;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 4;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 10000;
        }
    }

    public void doCalculate(View view) {

        display.setText(String.valueOf(resistorValue));
    }

    public void doReset(View view){

    }
}