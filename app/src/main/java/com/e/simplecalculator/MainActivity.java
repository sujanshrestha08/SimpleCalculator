package com.e.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


        private EditText etDisplay;
        private Button etOne, etTwo, etThree, etFour, etFive, etSix, etSeven, etEight, etNine, etSum, etSub, etResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}