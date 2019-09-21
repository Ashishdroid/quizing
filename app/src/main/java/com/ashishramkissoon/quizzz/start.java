package com.ashishramkissoon.quizzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class start extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        RelativeLayout paper = findViewById(R.id.paper);
        RelativeLayout threshold = findViewById(R.id.threshold);
        RelativeLayout answer = findViewById(R.id.answer);

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPaper = new Intent(start.this, listViewYouTube.class);
                startActivity(intentPaper);

            }
        });
        threshold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentThreshold = new Intent(start.this, threshold.class);
                startActivity(intentThreshold);

            }
        });

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intentAnswer = new Intent(start.this,answerListView.class);
                    startActivity(intentAnswer);
            }
        });


    }
}