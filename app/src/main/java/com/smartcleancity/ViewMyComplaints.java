package com.smartcleancity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViewMyComplaints extends AppCompatActivity {

    ExpandableListView expandableListView;

    List<String> lang;
    Map<String, List<String>> topics;
    ExpandableListAdapter listAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_my_complaints);

        expandableListView = (ExpandableListView) findViewById(R.id.viewMyComplaints);
        fillData();

        listAdapter = new viewMyComplaintsAdapter(this, lang, topics);
        expandableListView.setAdapter(listAdapter);




    }
    public void fillData(){
        lang = new ArrayList<>();
        topics = new HashMap<>();

        lang.add("Complaint 1");
        lang.add("Complaint 2");

        List<String> Java = new ArrayList<>();
        List<String> C = new ArrayList<>();

        Java.add("Date: 05/05/2021 Time: 15:03");
        Java.add("Description: Clean the place as soon as possible");
        Java.add("Location");

        C.add("Date: 11/05/2021 Time: 11:29");
        C.add("Description: Bin is not Cleaned since 4-5 days");
        C.add("Location");

        topics.put(lang.get(0),Java);
        topics.put(lang.get(1),C);

    }
}