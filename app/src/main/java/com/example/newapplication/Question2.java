package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        RadioGroup Question2 = findViewById(R.id.answerGroup1);

        Question2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if(id == R.id.an1){
                    Toast.makeText(Question2.this, "You choose answer A", Toast.LENGTH_SHORT).show();
                    StoreScore.score++;
                }
                else if(id == R.id.an2){
                    Toast.makeText(Question2.this, "You choose answer B", Toast.LENGTH_SHORT).show();
                }
                else if(id == R.id.an3){
                    Toast.makeText(Question2.this, "You choose answer C", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Question2.this, "You choose answer D", Toast.LENGTH_SHORT).show();
                }
                Intent newIntent1 = new Intent(Question2.this, Question3.class);
                startActivity(newIntent1);
            }
        });
    }
}