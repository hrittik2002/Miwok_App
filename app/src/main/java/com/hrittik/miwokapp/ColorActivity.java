package com.hrittik.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "weṭeṭṭi" , R.drawable.color_red));
        words.add(new Word("mustard yellow", "chiwiiṭә" , R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow", "ṭopiisә" , R.drawable.color_dusty_yellow));
        words.add(new Word("green", "chokokki" , R.drawable.color_green));
        words.add(new Word("brown", "ṭakaakki" , R.drawable.color_brown));
        words.add(new Word("gray", "ṭopoppi" , R.drawable.color_gray));
        words.add(new Word("black", "kululli" , R.drawable.color_black));
        words.add(new Word("white", "kelelli" , R.drawable.color_white));


        // Using ArrayAdapter and listView
        /*ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this , R.layout.list_item , words);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(itemsAdapter);*/

        WordAdapter adapter = new WordAdapter(this , words , R.color.category_color);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        /* Using loop
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        int i = 0;
        while (i < words.size()){
            TextView text = new TextView(this);
            text.setText(words.get(i));
            rootView.addView(text);
            i++;
        }*/
    }
}