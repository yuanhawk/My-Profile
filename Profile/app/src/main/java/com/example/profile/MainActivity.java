package com.example.profile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //TODO: Craft Out Designs for the next few layouts

    private static final String TAG = "MainActivity";
    private TextView introText, abtMeTxt, workExpTxt, eduTxt, nsLifeTxt, listAchieveTxt, volSvcTxt, intNHobbiesTxt, abtAppTxt;
    private CardView abtMeCardView, workExpCardView, eduCardView, nsLifeCardView, achieveCardView, volSvcCardView, intNHobbiesCardView, abtAppCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setOnClickListener();
    }

    public void initWidgets() {
        introText = (TextView) findViewById(R.id.introText);
        abtMeTxt = (TextView) findViewById(R.id.abtMeTxt);
        workExpTxt = (TextView) findViewById(R.id.workExpTxt);
        eduTxt = (TextView) findViewById(R.id.eduTxt);
        nsLifeTxt = (TextView) findViewById(R.id.nsLifeTxt);
        listAchieveTxt = (TextView) findViewById(R.id.listAchieveTxt);
        volSvcTxt = (TextView) findViewById(R.id.volSvcTxt);
        intNHobbiesTxt = (TextView) findViewById(R.id.intNHobbiesTxt);
        abtAppTxt = (TextView) findViewById(R.id.abtAppTxt);


        abtMeCardView = (CardView) findViewById(R.id.abtMeCardView);
        workExpCardView = (CardView) findViewById(R.id.workExpCardView);
        eduCardView = (CardView) findViewById(R.id.eduCardView);
        nsLifeCardView = (CardView) findViewById(R.id.nsLifeCardView);
        achieveCardView = (CardView) findViewById(R.id.achieveCardView);
        volSvcCardView = (CardView) findViewById(R.id.volSvcCardView);
        intNHobbiesCardView = (CardView) findViewById(R.id.intNHobbiesCardView);
        abtAppCardView = (CardView) findViewById(R.id.abtAppCardView);
    }

    public void setOnClickListener() {

        abtMeCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: started");
                Intent intent = new Intent(MainActivity.this, AboutMeActivity.class);
                startActivity(intent);
            }
        });

        workExpCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: started");
                Intent intent = new Intent(MainActivity.this, WorkExpActivity.class);
                startActivity(intent);

            }
        });

        eduCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: started");
                Intent intent = new Intent(MainActivity.this, EduActivity.class);
                startActivity(intent);
            }
        });

        nsLifeCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: started");
                Intent intent = new Intent(MainActivity.this, NSLifeActivity.class);
                startActivity(intent);
            }
        });

        achieveCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: started");
                Intent intent = new Intent(MainActivity.this, AchievementActivity.class);
                startActivity(intent);
            }
        });

        volSvcCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: started");
                Intent intent = new Intent(MainActivity.this, VolSvcActivity.class);
                startActivity(intent);
            }
        });

        intNHobbiesCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: started");
                Intent intent = new Intent(MainActivity.this, IntNHobbiesActivity.class);
                startActivity(intent);
            }
        });

        abtAppCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: started");
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("App Version 1.0")
                        .setMessage("\n\nWould you like to proceed to my blog")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(MainActivity.this, MyWebActivity.class);
                                intent.putExtra("url", "https://tyuanhawkguitar.wordpress.com");
                                startActivity(intent);
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                builder.create().show();
            }
        });
    }
}
