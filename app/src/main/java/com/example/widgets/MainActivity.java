package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    //Data for listView
    private String[] names = {"Super Berget", "Berget Klara", "Berg x100"};

    private ArrayList<String> listData = new ArrayList<String>(Arrays.asList(names));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.listitem_layout,R.id.listitem_layout,listData);
        ListView myListView = findViewById(R.id.listview);
        myListView.setAdapter(adapter);


        //Buttons
        Button like = findViewById(R.id.button);
        Button dislike = findViewById(R.id.button2);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Like-button", "User did like this.");
            }
        });
        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dislike-button", "User did dislike this.");
            }
        });
    }



}
