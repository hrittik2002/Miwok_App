package com.hrittik.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One" , "lutti" , R.drawable.number_one));
        words.add(new Word("Two" , "otiiko" , R.drawable.number_two));
        words.add(new Word("Three" , "tolookosu" , R.drawable.number_three));
        words.add(new Word("Four" , "oyyisa" , R.drawable.number_four));
        words.add(new Word("Five" , "massoka" , R.drawable.number_five));
        words.add(new Word("Six" , "temmokka" , R.drawable.number_six));
        words.add(new Word("Seven" , "kenekaku" , R.drawable.number_seven));
        words.add(new Word("Eight" , "kawinta" , R.drawable.number_eight));
        words.add(new Word("Nine" , "wo'e" , R.drawable.number_nine));
        words.add(new Word("Ten" , "na'aacha" , R.drawable.number_ten));


        // Using ArrayAdapter and listView
        /*ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this , R.layout.list_item , words);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(itemsAdapter);*/

        WordAdapter adapter = new WordAdapter(this , words , R.color.category_numbers);
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