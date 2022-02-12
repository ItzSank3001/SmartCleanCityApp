package com.smartcleancity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Complaints extends AppCompatActivity {

    ExpandableListView expandableListView;

    List<String> states;
    Map<String,List<String>>cities;
    ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaints);

        expandableListView = (ExpandableListView) findViewById(R.id.complaints);
        fillData();
        listAdapter = new complaintsAdapter(this,states,cities);
        expandableListView.setAdapter(listAdapter);
    }

    public void fillData(){
        states=new ArrayList<>();
        cities=new HashMap<>();

        states.add("Manali Ghume");
        states.add("Rachita Dengale");

        List<String> maharashtra=new ArrayList<>();
        List<String>gujarat=new ArrayList<>();

        maharashtra.add("Description: Clean the place as soon as possible");
        maharashtra.add("Location");
        maharashtra.add("Image");

        gujarat.add("Description: Bin is not Cleaned since 4-5 days");
        gujarat.add("Location");
        gujarat.add("Image");


        cities.put(states.get(0),maharashtra);
        cities.put(states.get(1),gujarat);

    }
}