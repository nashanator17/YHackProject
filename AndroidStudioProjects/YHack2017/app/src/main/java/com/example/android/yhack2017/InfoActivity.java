package com.example.android.yhack2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {

    final ArrayList<info> voteList = new ArrayList<info>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.votelist);

        voteList.add(new info("H.R. 1164: Taylor Force Act","LA", "2017-12-24", 3));
        voteList.add(new info("Vote for ban on windows","NY", "2017-12-05", 1));
        voteList.add(new info("Vote for Governer of Illinois","NY", "2017-12-26", 4));
        voteList.add(new info("Vote for Legalization of food","MI", "2017-12-15", 2));

        ///Create ArrayAdapter whose data source is String (questions)
        infoAdapter itemsAdapter = new infoAdapter(this, voteList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // question_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //String question = questionList.get(position);
                Intent detailVoteIntent = new Intent(InfoActivity.this,DetailVote.class);
                startActivity(detailVoteIntent);
            }
        });
    }





}
