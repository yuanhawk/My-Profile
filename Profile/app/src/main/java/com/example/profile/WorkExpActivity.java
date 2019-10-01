package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WorkExpActivity extends AppCompatActivity {

    private String[] position, companyName, workDuration, description;
    private TextView positionTV, companyNameTV, workDurationTV, descriptionTV;

    private ListView workList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_exp);

        initWidgets();

        Resources resources = getResources();
        position = resources.getStringArray(R.array.position);
        companyName = resources.getStringArray(R.array.company_name);
        workDuration = resources.getStringArray(R.array.work_duration);
        description = resources.getStringArray(R.array.description);

        WorkExpAdapter adapter = new WorkExpAdapter(this, position, companyName, workDuration, description);
        workList.setAdapter(adapter);

        workList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent showDetailActivity = new Intent(getApplicationContext(), WorkExpDetailActivity.class);
                showDetailActivity.putExtra("com.example.profile.ITEM_INDEX", i);
                startActivity(showDetailActivity);
            }
        });
    }

    private void initWidgets() {

        positionTV = (TextView) findViewById(R.id.position);
        companyNameTV = (TextView) findViewById(R.id.companyName);
        workDurationTV = (TextView) findViewById(R.id.workDuration);
        descriptionTV = (TextView) findViewById(R.id.description);

        workList = (ListView) findViewById(R.id.workList);
    }


}
