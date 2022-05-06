package com.example.fyp_app;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class training_0_Activity extends AppCompatActivity {

    Button btn_startTraining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training_0);

        btn_startTraining =  findViewById(R.id.btn_startTraining);
        btn_startTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(training_0_Activity.this, EntryChoiceActivity.class);
                startActivity(intent);
            }
        });
    }
}
