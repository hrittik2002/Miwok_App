package com.hrittik.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // OnclickListner for number

        TextView numbers = (TextView) findViewById(R.id.numbers);
             // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , NumbersActivity.class);
                startActivity(i);
            }
        });


        // OnclickListener for Family

        TextView family = (TextView) findViewById(R.id.family);
        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , Family.class);
                startActivity(i);
            }
        });

        // OnClickListener for Color

        TextView color = (TextView) findViewById(R.id.colors);
        // Set a click listener on that View
        color.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , ColorActivity.class);
                startActivity(i);
            }
        });


        // OnClickListener for phrases
        TextView phrases = (TextView) findViewById(R.id.phrases);
        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , PhrasesActivity.class);
                startActivity(i);
            }
        });

    }
    /*public void openNumbersList(View view){
        Intent i = new Intent(this , NumbersActivity.class);
        startActivity(i);

    }*/

    /*public void openFamilyList(View view){
        Intent i = new Intent(this , Family.class);
        startActivity(i);

    }
    public void openColorList(View view){
        Intent i = new Intent(this , ColorActivity.class);
        startActivity(i);

    }/*
    /*public void openPhrasesList(View view){
        Intent i = new Intent(this , PhrasesActivity.class);
        startActivity(i);

    }*/
}