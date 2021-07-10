package com.hrittik.miwokapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId; // resource id for background color

    public WordAdapter(@NonNull Activity context, ArrayList<Word> words , int ColorResourceId) {
        super(context, 0 , words);
        mColorResourceId = ColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item , parent , false);
        }

        Word currentView = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentView.getMiwokTrasnslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.text_text_view);
        defaultTextView.setText(currentView.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        //imageView.setImageResource(currentView.getmImageResourceID());
        if(currentView.hasImage()){
            imageView.setImageResource(currentView.getmImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View textCointainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext() , mColorResourceId);
        textCointainer.setBackgroundColor(color);

        return listItemView;
    }
}
