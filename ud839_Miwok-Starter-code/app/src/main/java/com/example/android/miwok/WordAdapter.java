package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alin- on 10.06.2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int colorID; //background for list items
    public WordAdapter(@NonNull Context context, ArrayList<Word> resource, int colorID) {
        super(context,0, resource);
        this.colorID = colorID;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word local_word = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(local_word.getMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(local_word.getDefaultTranslation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_id);
        if(local_word.getImageResourceId()==-1) imageView.setVisibility(View.GONE);
        else imageView.setImageResource(local_word.getImageResourceId());
        View myLayout = listItemView.findViewById(R.id.colorView);
        int color = ContextCompat.getColor(getContext(),colorID);
        myLayout.setBackgroundColor(color);
        return listItemView;
    }
}
