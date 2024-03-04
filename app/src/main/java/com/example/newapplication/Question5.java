package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.SortedMap;

public class Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        RadioGroup answerGroup4 = findViewById(R.id.answerGroup4);

        answerGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if(id == R.id.ansss1){
                    Toast.makeText(Question5.this, "You choose answer A", Toast.LENGTH_SHORT).show();
                    StoreScore.score++;
                }
                else if(id == R.id.ansss2){
                    Toast.makeText(Question5.this, "You choose answer B", Toast.LENGTH_SHORT).show();
                }
                else if(id == R.id.ansss3){
                    Toast.makeText(Question5.this, "You choose answer C", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Question5.this, "You choose answer D", Toast.LENGTH_SHORT).show();
                }
                Intent newIntent4 = new Intent(Question5.this, Score.class);
                startActivity(newIntent4);
            }
        });
    }
}