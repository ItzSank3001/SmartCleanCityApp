package com.smartcleancity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5,c6,c7,c8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        c1 = (CardView) findViewById(R.id.dashRaiseComplaint);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchCard1 = new Intent(Dashboard.this,ComplaintForm.class);
                startActivity(launchCard1);
            }
        });


        c2 = (CardView) findViewById(R.id.dashViewMyComplaints);

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchCard2 = new Intent(Dashboard.this,ViewMyComplaints.class);
                startActivity(launchCard2);
            }
        });


        c3 = (CardView) findViewById(R.id.dashComplaints);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchCard3 = new Intent(Dashboard.this,Complaints.class);
                startActivity(launchCard3);
            }
        });







        //AsssignWork(Admin) is not created yet, it will done after Database
        //ViewAssignedWork(Admin) is not created yet. (ExpandableListView)







        c6 = (CardView) findViewById(R.id.dashCreateBin);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchCard6 = new Intent(Dashboard.this,CreateBin.class);
                startActivity(launchCard6);
            }
        });



        c7 = (CardView) findViewById(R.id.dashCreateDriver);
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchCard7 = new Intent(Dashboard.this,CreateDriver.class);
                startActivity(launchCard7);
            }
        });



        c8 = (CardView) findViewById(R.id.dashShowWork);
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchCard8 = new Intent(Dashboard.this,ShowWork.class);
                startActivity(launchCard8);
            }
        });
    }
}