package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        RadioGroup answerGroup3 = findViewById(R.id.answerGroup3);

        answerGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if(id == R.id.anss1){
                    Toast.makeText(Question4.this, "You choose answer A", Toast.LENGTH_SHORT).show();
                }
                else if(id == R.id.anss2){
                    Toast.makeText(Question4.this, "You choose answer B", Toast.LENGTH_SHORT).show();
                }
                else if(id == R.id.anss3){
                    Toast.makeText(Question4.this, "You choose answer C", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Question4.this, "You choose answer D", Toast.LENGTH_SHORT).show();
                    StoreScore.score++;
                }
                Intent newIntent3 = new Intent(Question4.this, Question5.class);
                startActivity(newIntent3);
            }
        });
    }
}