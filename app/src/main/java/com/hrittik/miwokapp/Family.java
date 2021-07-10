package com.hrittik.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "әpә" , R.drawable.family_father));
        words.add(new Word("mother", "әṭa" , R.drawable.family_mother));
        words.add(new Word("son", "angsi" , R.drawable.family_son));
        words.add(new Word("daughter", "tune" , R.drawable.family_daughter));
        words.add(new Word("older brother", "taachi" , R.drawable.family_older_brother));
        words.add(new Word("younger brother", "chalitti" , R.drawable.family_younger_brother));
        words.add(new Word("older sister", "teṭe" , R.drawable.family_older_sister));
        words.add(new Word("younger sister", "kolliti" , R.drawable.family_younger_sister));
        words.add(new Word("grandmother ", "ama" , R.drawable.family_grandmother));
        words.add(new Word("grandfather", "paapa" , R.drawable.family_grandfather));


        // Using ArrayAdapter and listView
        /*ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this , R.layout.list_item , words);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(itemsAdapter);*/

        WordAdapter adapter = new WordAdapter(this , words , R.color.category_family);
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