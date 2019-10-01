package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class EduActivity extends AppCompatActivity {

    private String[] schoolName, degName, studyDuration, activities, description;
    private TextView schoolNameTV, degNameTV, studyDurationTV, activitiesTV, descriptionTV;

    private ListView eduList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu);

        initWidgets();

        Resources resources = getResources();
        schoolName = resources.getStringArray(R.array.school_name);
        degName = resources.getStringArray(R.array.deg_name);
        studyDuration = resources.getStringArray(R.array.study_duration);
        activities = resources.getStringArray(R.array.activities);
        description = resources.getStringArray(R.array.descriptionSch);

        EduAdapter adapter = new EduAdapter(this, schoolName, degName, studyDuration, activities, description);
        eduList.setAdapter(adapter);

        eduList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent showDetailActivity = new Intent(getApplicationContext(), EduDetailsActivity.class);
                showDetailActivity.putExtra("com.example.education.ITEM_INDEX", i);
                startActivity(showDetailActivity);
            }
        });
    }

    private void initWidgets() {
        schoolNameTV = (TextView) findViewById(R.id.schoolName);
        degNameTV = (TextView) findViewById(R.id.degName);
        studyDurationTV = (TextView) findViewById(R.id.studyDuration);
        activitiesTV = (TextView) findViewById(R.id.activities);
        descriptionTV = (TextView) findViewById(R.id.descriptionSch);

        eduList = (ListView) findViewById(R.id.eduList);
    }
}
