package com.example.android.yhack2017;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class infoAdapter extends ArrayAdapter<info> {

    public infoAdapter(Activity context, ArrayList<info> votingInfo){
        super(context,0, votingInfo);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.votebox, parent, false);


        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        info currentVote = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView questionBox = (TextView) listItemView.findViewById(R.id.text_container);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        questionBox.setText(currentVote.getmvoteText());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView difficultyBox = (TextView) listItemView.findViewById(R.id.difficulty_container);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        difficultyBox.setText(currentVote.getmLocation());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView dateBox = (TextView) listItemView.findViewById(R.id.date);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        dateBox.setText(currentVote.getmDate());





        return listItemView;
    }
}
