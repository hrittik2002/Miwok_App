package com.hrittik.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I’m feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));


        // Using ArrayAdapter and listView
        /*ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this , R.layout.list_item , words);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(itemsAdapter);*/

        WordAdapter adapter = new WordAdapter(this , words , R.color.category_phrases);
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