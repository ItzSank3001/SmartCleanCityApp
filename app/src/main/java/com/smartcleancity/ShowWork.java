package com.smartcleancity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowWork extends AppCompatActivity {

    ExpandableListView expandableListView;

    List<String> name;
    Map<String, List<String>> subject;
    ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_work);

        expandableListView = (ExpandableListView) findViewById(R.id.showWork);
        fillData1();

        listAdapter = new viewMyComplaintsAdapter(this, name, subject);
        expandableListView.setAdapter(listAdapter);
    }

    public void fillData1(){
        name = new ArrayList<>();
        subject = new HashMap<>();

        name.add("Job 1");
        name.add("Job 2");

        List<String> Sanket = new ArrayList<>();
        List<String> Aishwary = new ArrayList<>();

        Sanket.add("Description: Clean as soon as possible");
        Sanket.add("Location");
        Sanket.add("Priority: High");

        Aishwary.add("Description: Add new bin");
        Aishwary.add("Location");
        Aishwary.add("Priority: Medium");

        subject.put(name.get(0),Sanket);
        subject.put(name.get(1),Aishwary);

    }

}