package edu.famodu.resistorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResistorActivity extends AppCompatActivity {
    Spinner color_band_1, color_band_2, multiplier, tolerance;
    Button calculateBtn, resetBtn;
    TextView valueDisplay, place_holder_band_2, place_holder_band_1, multiplier_placeholder, tolerance_placeholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistor);


        init();

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateValue();
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetValue();
            }
        });


        color_band_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItemText = (String) parentView.getItemAtPosition(position);
                switch (selectedItemText) {
                    case "Black":
                        place_holder_band_2.setBackgroundResource(R.color.colorBlack);
                        place_holder_band_2.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Brown":
                        place_holder_band_2.setBackgroundResource(R.color.colorBrown);
                        place_holder_band_2.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Red":
                        place_holder_band_2.setBackgroundResource(R.color.colorRed);
                        place_holder_band_2.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Orange":
                        place_holder_band_2.setBackgroundResource(R.color.colorOrange);
                        place_holder_band_2.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Yellow":
                        place_holder_band_2.setBackgroundResource(R.color.colorYellow);
                        place_holder_band_2.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Green":
                        place_holder_band_2.setBackgroundResource(R.color.colorGreen);
                        place_holder_band_2.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Blue":
                        place_holder_band_2.setBackgroundResource(R.color.colorBlue);
                        place_holder_band_2.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Violet":
                        place_holder_band_2.setBackgroundResource(R.color.colorViolet);
                        place_holder_band_2.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Gray":
                        place_holder_band_2.setBackgroundResource(R.color.colorGray);
                        place_holder_band_2.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "White":
                        place_holder_band_2.setBackgroundResource(R.color.colorWhite);
                        place_holder_band_2.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        color_band_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItemText = (String) parentView.getItemAtPosition(position);
                switch (selectedItemText) {
                    case "Black":
                        place_holder_band_1.setBackgroundResource(R.color.colorBlack);
                        place_holder_band_1.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Brown":
                        place_holder_band_1.setBackgroundResource(R.color.colorBrown);
                        place_holder_band_1.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Red":
                        place_holder_band_1.setBackgroundResource(R.color.colorRed);
                        place_holder_band_1.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Orange":
                        place_holder_band_1.setBackgroundResource(R.color.colorOrange);
                        place_holder_band_1.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Yellow":
                        place_holder_band_1.setBackgroundResource(R.color.colorYellow);
                        place_holder_band_1.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Green":
                        place_holder_band_1.setBackgroundResource(R.color.colorGreen);
                        place_holder_band_1.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Blue":
                        place_holder_band_1.setBackgroundResource(R.color.colorBlue);
                        place_holder_band_1.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Violet":
                        place_holder_band_1.setBackgroundResource(R.color.colorViolet);
                        place_holder_band_1.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Gray":
                        place_holder_band_1.setBackgroundResource(R.color.colorGray);
                        place_holder_band_1.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "White":
                        place_holder_band_1.setBackgroundResource(R.color.colorWhite);
                        place_holder_band_1.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });


        multiplier.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItemText = (String) parentView.getItemAtPosition(position);
                switch (selectedItemText) {
                    case "Black":
                        multiplier_placeholder.setBackgroundResource(R.color.colorBlack);
                        multiplier_placeholder.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Brown":
                        multiplier_placeholder.setBackgroundResource(R.color.colorBrown);
                        multiplier_placeholder.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Red":
                        multiplier_placeholder.setBackgroundResource(R.color.colorRed);
                        multiplier_placeholder.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Orange":
                        multiplier_placeholder.setBackgroundResource(R.color.colorOrange);
                        multiplier_placeholder.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Yellow":
                        multiplier_placeholder.setBackgroundResource(R.color.colorYellow);
                        multiplier_placeholder.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Green":
                        multiplier_placeholder.setBackgroundResource(R.color.colorGreen);
                        multiplier_placeholder.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Blue":
                        multiplier_placeholder.setBackgroundResource(R.color.colorBlue);
                        multiplier_placeholder.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Violet":
                        multiplier_placeholder.setBackgroundResource(R.color.colorViolet);
                        multiplier_placeholder.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Gold":
                        multiplier_placeholder.setBackgroundResource(R.color.colorGold);
                        multiplier_placeholder.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Silver":
                        multiplier_placeholder.setBackgroundResource(R.color.colorSilver);
                        multiplier_placeholder.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        tolerance.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItemText = (String) parentView.getItemAtPosition(position);
                switch (selectedItemText) {
                    case "Black":
                        tolerance_placeholder.setBackgroundResource(R.color.colorBlack);
                        tolerance_placeholder.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Brown":
                        tolerance_placeholder.setBackgroundResource(R.color.colorBrown);
                        tolerance_placeholder.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Red":
                        tolerance_placeholder.setBackgroundResource(R.color.colorRed);
                        tolerance_placeholder.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Gray":
                        tolerance_placeholder.setBackgroundResource(R.color.colorGray);
                        tolerance_placeholder.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Green":
                        tolerance_placeholder.setBackgroundResource(R.color.colorGreen);
                        tolerance_placeholder.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Blue":
                        tolerance_placeholder.setBackgroundResource(R.color.colorBlue);
                        tolerance_placeholder.setTextColor(getResources().getColor(R.color.colorWhite));
                        break;
                    case "Violet":
                        tolerance_placeholder.setBackgroundResource(R.color.colorViolet);
                        tolerance_placeholder.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Gold":
                        tolerance_placeholder.setBackgroundResource(R.color.colorGold);
                        tolerance_placeholder.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "Silver":
                        tolerance_placeholder.setBackgroundResource(R.color.colorSilver);
                        tolerance_placeholder.setTextColor(getResources().getColor(R.color.colorBlack));
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

    }

    private void resetValue() {
        valueDisplay.setText("Resistor Value");
        color_band_1.setSelection(0);
        color_band_2.setSelection(0);
        multiplier.setSelection(0);
        tolerance.setSelection(0);

    }

    private void init() {
        color_band_1 = findViewById(R.id.colorBand1);
        color_band_2 = findViewById(R.id.colorBand2);
        multiplier = findViewById(R.id.multiplier1);
        tolerance = findViewById(R.id.tolerance1);
        calculateBtn = findViewById(R.id.calculate);
        resetBtn = findViewById(R.id.reset);
        valueDisplay = findViewById(R.id.tvDisplay);
        place_holder_band_2 = findViewById(R.id.colorBand2PlaceHolder);
        place_holder_band_1 = findViewById(R.id.colorBand1PlaceHolder);
        multiplier_placeholder = findViewById(R.id.multiplier1PlaceHolder);
        tolerance_placeholder = findViewById(R.id.tolerancePlaceHolder);


        //For Bands
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.band, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        color_band_1.setAdapter(adapter);
        color_band_2.setAdapter(adapter);

        //For Multiplier
        ArrayAdapter<CharSequence> multiplier_adapter = ArrayAdapter.createFromResource(this,
                R.array.multiplier, android.R.layout.simple_spinner_item);
        multiplier_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        multiplier.setAdapter(multiplier_adapter);

        //For Tolerance
        ArrayAdapter<CharSequence> tolerance_adapter = ArrayAdapter.createFromResource(this,
                R.array.tolerance, android.R.layout.simple_spinner_item);
        tolerance_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tolerance.setAdapter(tolerance_adapter);
    }


    private void calculateValue() {
        String band_1 = color_band_1.getSelectedItem().toString();
        String band_2 = color_band_2.getSelectedItem().toString();
        String multiplier_band = multiplier.getSelectedItem().toString();
        String tolerance_band = tolerance.getSelectedItem().toString();


        String band_1_text = "0";
        switch (band_1) {

            case "Black":
                band_1_text = "0";
                break;
            case "Brown":
                band_1_text = "1";
                break;
            case "Red":
                band_1_text = "2";
                break;
            case "Orange":
                band_1_text = "3";
                break;
            case "Yellow":
                band_1_text = "4";
                break;
            case "Green":
                band_1_text = "5";
                break;
            case "Blue":
                band_1_text = "6";
                break;
            case "Violet":
                band_1_text = "7";
                break;
            case "Gray":
                band_1_text = "8";
                break;
            case "White":
                band_1_text = "9";
                break;

        }

        String band_2_text = "0";
        switch (band_2) {

            case "Black":
                band_2_text = "0";
                break;
            case "Brown":
                band_2_text = "1";
                break;
            case "Red":
                band_2_text = "2";
                break;
            case "Orange":
                band_2_text = "3";
                break;
            case "Yellow":
                band_2_text = "4";
                break;
            case "Green":
                band_2_text = "5";
                break;
            case "Blue":
                band_2_text = "6";
                break;
            case "Violet":
                band_2_text = "7";
                break;
            case "Gray":
                band_2_text = "8";
                break;
            case "White":
                band_2_text = "9";
                break;

        }
        String bands = band_1_text + band_2_text;

        String multiplier_text = "1";
        switch (multiplier_band) {

            case "Black":
                multiplier_text = "1";
                break;
            case "Brown":
                multiplier_text = "10";
                break;
            case "Red":
                multiplier_text = "100";
                break;
            case "Orange":
                multiplier_text = "1000";
                break;
            case "Yellow":
                multiplier_text = "10000";
                break;
            case "Green":
                multiplier_text = "100000";
                break;
            case "Blue":
                multiplier_text = "1000000";
                break;
            case "Violet":
                multiplier_text = "10000000";
                break;
            case "Gray":
                multiplier_text = "100000000";
                break;
            case "White":
                multiplier_text = "1000000000";
                break;
            case "Gold":
                multiplier_text = "0.1";
                break;
            case "Silver":
                multiplier_text = "0.01";
                break;
        }


        String toleranceText = " ± ";
        switch (tolerance_band) {
            case "Brown":
                toleranceText += "1";
                break;
            case "Red":
                toleranceText += "2";
                break;
            case "Green":
                toleranceText += "0.5";
                break;
            case "Blue":
                toleranceText += "0.25";
                break;
            case "Violet":
                toleranceText += "0.1";
                break;
            case "Gray":
                toleranceText += "0.05";
                break;
            case "Gold":
                toleranceText += "5";
                break;
            case "Silver":
                toleranceText += "10";
                break;


        }
        toleranceText += "%";


        double ohms = Integer.parseInt(bands) * Double.parseDouble(multiplier_text);

        String finalOutputText = formatDigits(ohms) + " Ω " + toleranceText;
        Log.d("Values", "calculateValue: " + band_1 + "\n" + band_2);
        Log.d("Values", "calculateValue: " + multiplier_band + "\n" + tolerance_band);
        Log.d("Text Values", "calculateValue: " + band_1_text + "\n" + band_2_text);
        Log.d("Text Values", "calculateValue: " + multiplier_text + "\n" + toleranceText);
        Log.d("Text Values", "calculateValue: " + finalOutputText + "\n" + ohms);

        valueDisplay.setText(finalOutputText);


    }

    private String formatDigits(double digits) {
        String selectedSuffix = "";


        for (String suffix : new String[]{" K", " M", " G"}) {
            if (digits < 1000)
                break;
            selectedSuffix = suffix;
            digits /= 1000;
        }


        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(digits) + selectedSuffix;
    }
}